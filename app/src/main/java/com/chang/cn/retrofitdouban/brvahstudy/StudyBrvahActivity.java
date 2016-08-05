package com.chang.cn.retrofitdouban.brvahstudy;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chang.cn.retrofitdouban.R;
import com.chang.cn.retrofitdouban.activity.BaseActivity;

public class StudyBrvahActivity extends BaseActivity implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener{

    private RecyclerView mRecyclerView;
//    private QuickAdapter mQuickAdapter;
    BaseQuickAdapter<Status> adapter;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    private static final int TOTAL_COUNTER = 18;

    private static final int PAGE_SIZE = 6;

    private int delayMillis = 1000;

    private int mCurrentCounter = 0;// 当前加载数据数量

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_brvah);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLayout);

        mSwipeRefreshLayout.setOnRefreshListener(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initAdapter();

    }

    private void initAdapter(){
//        mQuickAdapter = new QuickAdapter(0);
         adapter = new BaseQuickAdapter<Status>( R.layout.tweet, DataServer.getSampleData(0)) {
            @Override
            protected void convert(BaseViewHolder baseViewHolder, Status item) {
                baseViewHolder.setText(R.id.tweetName, item.getUserName())
                        .setText(R.id.tweetText, item.getText())
                        .setText(R.id.tweetDate, item.getCreatedAt())
                        .setVisible(R.id.tweetRT, item.isRetweet())
                        .setOnClickListener(R.id.tweetAvatar, new OnItemChildClickListener())
                        .setOnClickListener(R.id.tweetName, new OnItemChildClickListener())
                        .linkify(R.id.tweetText);

                Glide.with(mContext).load(item.getUserAvatar()).crossFade()//淡入淡出动画效果
                        .placeholder(R.mipmap.def_head).transform(new GlideCircleTransform(mContext))//圆形图片
                        .into((ImageView) baseViewHolder.getView(R.id.tweetAvatar));
            }
        };
        View emptyView = getLayoutInflater().inflate(R.layout.empty_view, (ViewGroup) mRecyclerView.getParent(), false);
        adapter.setEmptyView(emptyView);

        adapter.openLoadAnimation();
        mRecyclerView.setAdapter(adapter);
        mCurrentCounter = adapter.getData().size();
        adapter.setOnLoadMoreListener(this);
        adapter.openLoadMore(PAGE_SIZE, true);


    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                adapter.setNewData(DataServer.getSampleData(PAGE_SIZE));
                adapter.openLoadMore(PAGE_SIZE, true);
                mCurrentCounter = PAGE_SIZE;
                mSwipeRefreshLayout.setRefreshing(false);
            }
        }, delayMillis);
    }

    @Override
    public void onLoadMoreRequested() {
        mRecyclerView.post(new Runnable() {
            @Override
            public void run() {
                if (mCurrentCounter >= TOTAL_COUNTER) {
                    adapter.notifyDataChangedAfterLoadMore(false);
                    View view = getLayoutInflater().inflate(R.layout.not_loading, (ViewGroup) mRecyclerView.getParent(), false);
                    adapter.addFooterView(view);
                } else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            adapter.notifyDataChangedAfterLoadMore(DataServer.getSampleData(PAGE_SIZE), true);
                            mCurrentCounter = adapter.getData().size();
                        }
                    }, delayMillis);
                }
            }


        });
    }


}
