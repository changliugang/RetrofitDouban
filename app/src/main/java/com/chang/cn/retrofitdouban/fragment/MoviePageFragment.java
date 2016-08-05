package com.chang.cn.retrofitdouban.fragment;


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
import com.chang.cn.retrofitdouban.entity.MovieData;
import com.chang.cn.retrofitdouban.retrofit.MovieApi;
import com.chang.cn.retrofitdouban.retrofit.RetrofitFactory;
import com.changlg.cn.tapechat.log.Loglg;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 电影条目展示
 */
public class MoviePageFragment extends BaseFragment implements BaseQuickAdapter.RequestLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {

    private static final String ARG_PARAM1 = "movie_api_tag";
    @InjectView(R.id.movie_rl_list)
    RecyclerView mMovieRlList;
    @InjectView(R.id.movie_swipeLayout)
    SwipeRefreshLayout mMovieSwipeLayout;

    private BaseQuickAdapter<MovieData.SubjectsBean> adapter;

    private int mMovieApiTag;
    private int mCurrentCounter = 0;// 当前加载数据数量
    private int TOTAL_COUNTER;// 数据总量
    private MovieApi movieApi;

    public MoviePageFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param tag Parameter 1.
     * @return A new instance of fragment MoviePageFragment.
     */
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_page, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMovieSwipeLayout.setOnRefreshListener(this);
        mMovieRlList.setLayoutManager(new LinearLayoutManager(getActivity()));
        movieApi = RetrofitFactory.getControllerSingleTon(MovieApi.class);
        init(null);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    private void requestData(int start) {

        Call<MovieData> callMovie = null;
        switch (mMovieApiTag) {
            case Config.COMING_SOON:
                callMovie = movieApi.getComingSoon(start, Config.PAGE_SIZE);
                break;
        }
        if (callMovie != null)
            callMovie.enqueue(new Callback<MovieData>() {
                @Override
                public void onResponse(Call<MovieData> call, Response<MovieData> response) {
                    TOTAL_COUNTER = response.body().getTotal();
                    if (mCurrentCounter == 0)
                        adapter.setNewData(response.body().getSubjects());
                    else
                        adapter.addData(response.body().getSubjects());
                }

                @Override
                public void onFailure(Call<MovieData> call, Throwable t) {
                    Loglg.d(t.getLocalizedMessage());
                }
            });
    }

    private void init(List<MovieData.SubjectsBean> list) {
        adapter = new BaseQuickAdapter<MovieData.SubjectsBean>(R.layout.item_movie_card, list) {
            @Override
            protected void convert(BaseViewHolder baseViewHolder, MovieData.SubjectsBean item) {
                baseViewHolder.setText(R.id.item_movie_title, item.getTitle())
                        .setText(R.id.item_movie_rating, item.getRating().getAverageString())
                        .setText(R.id.item_movie_actors, item.getCastsString());

                Glide.with(mContext).load(item.getImages().getSmall()).crossFade()
                        .placeholder(R.drawable.def_pic).into((ImageView) baseViewHolder.getView(R.id.item_movie_poster));
            }
        };
        // 设置空数据布局
        View emptyView = LayoutInflater.from(getActivity()).inflate(R.layout.empty_view, (ViewGroup) mMovieRlList.getParent(), false);
        adapter.setEmptyView(emptyView);
        adapter.openLoadAnimation();
        mCurrentCounter = adapter.getData().size();
        adapter.setOnLoadMoreListener(this);
        adapter.openLoadMore(Config.PAGE_SIZE, true);
        mMovieRlList.setAdapter(adapter);
    }

    @Override
    public void onRefresh() {
        mCurrentCounter = 0;
        requestData(mCurrentCounter);
    }

    @Override
    public void onLoadMoreRequested() {
        if (mCurrentCounter >= TOTAL_COUNTER) {

        }
    }
}
