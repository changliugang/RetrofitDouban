package com.chang.cn.retrofitdouban.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.chang.cn.retrofitdouban.R;
import com.chang.cn.retrofitdouban.entity.MovieData;

/**
 * 电影详情
 */
public class MovieDetailActivity extends BaseActivity {

    MovieData.SubjectsBean movieItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movieItem = (MovieData.SubjectsBean) getIntent().getSerializableExtra(EXTRA_KEY_1);
        if (movieItem != null)
            Toast.makeText(MovieDetailActivity.this, "movie:" + movieItem.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
