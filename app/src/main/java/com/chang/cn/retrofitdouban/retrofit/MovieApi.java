package com.chang.cn.retrofitdouban.retrofit;


import com.chang.cn.retrofitdouban.entity.MovieData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 电影相关api
 * Created by chang on 2016/3/11.
 */
public interface MovieApi {

    @GET("movie/in_theaters")
    Call<MovieData> getBeShowing(@Query("start") int start, @Query("count") int count,
                                 @Query("count") String apikey);

    @GET("movie/coming_soon")
    Call<MovieData> getComingSoon(@Query("start") int start, @Query("count") int count,
                                  @Query("count") String apikey);

    @GET("movie/top250")
    Call<MovieData> getTop250(@Query("start") int start, @Query("count") int count,
                                  @Query("count") String apikey);
}
