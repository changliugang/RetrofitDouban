package com.chang.cn.retrofitdouban.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chang.cn.retrofitdouban.Config;
import com.chang.cn.retrofitdouban.R;
import com.chang.cn.retrofitdouban.activity.MovieDetailActivity;
import com.chang.cn.retrofitdouban.entity.MovieData;
import com.chang.cn.retrofitdouban.retrofit.MovieApi;
import com.chang.cn.retrofitdouban.retrofit.RetrofitFactory;
import com.changlg.cn.tapechat.log.Loglg;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 电影条目展示
 */
public class MoviePageFragment extends LazyLoadFragment implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {

    private static final String ARG_PARAM1 = "movie_api_tag";

    @Bind(R.id.movie_rl_list)
    RecyclerView mMovieRlList;
    @Bind(R.id.movie_swipeLayout)
    SwipeRefreshLayout mMovieSwipeLayout;

    private BaseQuickAdapter<MovieData.SubjectsBean> adapter;

    private int mMovieApiTag;
    private int mCurrentCounter = 0;// 当前加载数据数量
    private int TOTAL_COUNTER;// 数据总量
    private MovieApi movieApi;

    private View endView;// 加载到最后的提示view
    private View emptyView;// 无数据view

    public MoviePageFragment() {
    }

    public static MoviePageFragment newInstance(int tag) {
        MoviePageFragment fragment = new MoviePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, tag);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMovieApiTag = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMovieSwipeLayout.setOnRefreshListener(this);
        mMovieRlList.setLayoutManager(new LinearLayoutManager(getContext()));
        movieApi = RetrofitFactory.getControllerSingleTon(MovieApi.class);
        initRecyclerView();
        mMovieSwipeLayout.setProgressViewOffset(false, 0, 100);
        mMovieSwipeLayout.setRefreshing(true);

    }

    @Override
    public void loadData() {
        super.loadData();
        requestData(true);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_movie_page;
    }

    @Override
    public void initViews(View view) {
        ButterKnife.bind(this, view);
        endView = LayoutInflater.from(getContext()).inflate(R.layout.not_loading, (ViewGroup) mMovieRlList.getParent(), false);
        emptyView = LayoutInflater.from(getContext()).inflate(R.layout.empty_view, (ViewGroup) mMovieRlList.getParent(), false);
    }

    private void requestData(final boolean isRefresh) {
        Call<MovieData> callMovie = null;
        switch (mMovieApiTag) {
            case Config.COMING_SOON:
                callMovie = movieApi.getComingSoon(mCurrentCounter, Config.PAGE_SIZE, RetrofitFactory.API_KEY);
                break;
            case Config.IN_THEATERS:
                callMovie = movieApi.getBeShowing(mCurrentCounter, Config.PAGE_SIZE, RetrofitFactory.API_KEY);
                break;
            case Config.TOP250:
                callMovie = movieApi.getTop250(mCurrentCounter, Config.PAGE_SIZE, RetrofitFactory.API_KEY);
                break;
        }
        if (callMovie != null)
            callMovie.enqueue(new Callback<MovieData>() {
                @Override
                public void onResponse(Call<MovieData> call, Response<MovieData> response) {
                    TOTAL_COUNTER = response.body().getTotal();
                    if (response.body() != null && response.body().getSubjects() != null)
                        if (isRefresh) {
                            adapter.setNewData(response.body().getSubjects());
                            adapter.openLoadMore(Config.PAGE_SIZE, true);
                            mCurrentCounter = Config.PAGE_SIZE;
                            mMovieSwipeLayout.setRefreshing(false);
                        } else {
                            if (mCurrentCounter >= TOTAL_COUNTER) {
                                adapter.notifyDataChangedAfterLoadMore(false);
                                adapter.addFooterView(endView);
                            } else {
                                adapter.notifyDataChangedAfterLoadMore(response.body().getSubjects(), true);
                                mCurrentCounter = adapter.getData().size();
                            }
                        }
                }

                @Override
                public void onFailure(Call<MovieData> call, Throwable t) {
                    Loglg.d(t.getLocalizedMessage());
                }
            });
    }

    private void initRecyclerView() {
        adapter = new BaseQuickAdapter<MovieData.SubjectsBean>(R.layout.item_movie_card, null) {
            @Override
            protected void convert(BaseViewHolder baseViewHolder, MovieData.SubjectsBean item) {
                baseViewHolder.setText(R.id.item_movie_title, item.getTitle())
                        .setText(R.id.item_movie_rating, item.getRating().getAverageString())
                        .setText(R.id.item_movie_actors, item.getCastsString());

                Glide.with(mContext).load(item.getImages().getLarge()).crossFade()
                        .into((ImageView) baseViewHolder.getView(R.id.item_movie_poster));
            }
        };
        // 设置空数据布局
        adapter.setEmptyView(emptyView);
        adapter.openLoadAnimation();
        mCurrentCounter = adapter.getData().size();
        adapter.setOnLoadMoreListener(this);
        adapter.openLoadMore(Config.PAGE_SIZE, true);
        adapter.setOnRecyclerViewItemClickListener(new BaseQuickAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int i) {
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra(EXTRA_KEY_1, adapter.getItem(i));
                startActivity(intent);
            }
        });

        mMovieRlList.setAdapter(adapter);

    }

    @Override
    public void onRefresh() {
        mCurrentCounter = 0;
        requestData(true);
    }

    @Override
    public void onLoadMoreRequested() {
        requestData(false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}
