package com.chang.cn.retrofitdouban.retrofit;

import com.chang.cn.retrofitdouban.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit配置
 * Created by chang on 2016/7/18.
 */
public class RetrofitFactory {

    private static Retrofit retrofit;//Retrofit核心配置
    // 配置Gson
    final static Gson gson = new GsonBuilder().serializeNulls().create();
    // okhttp3配置
    private static final okhttp3.OkHttpClient.Builder builder = new OkHttpClient.Builder();

    public static final String BASE_URL = "http://api.douban.com/v2/";

    public static final String API_KEY = "090f741bb95bf0041b2e5c532c13d00c";

    private static Map<Class<?>, Object> controller = new HashMap<>();

    RetrofitFactory() {
        // 超时配置
        OkHttpClient httpClient = builder.connectTimeout(10, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS).build();
        // Debug模式输出网络相关log
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient = new OkHttpClient.Builder().addInterceptor(logging).build();
        }
        // 配置Retrofit
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

    private <T> T createAPI(Class<T> cls) {
        return retrofit.create(cls);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getControllerSingleTon(Class<T> controllerInterface) {
        T t = (T) controller.get(controllerInterface);
        if (t == null) {
            synchronized (RetrofitFactory.class) {
                t = new RetrofitFactory().createAPI(controllerInterface);
                return t;
            }
        } else return t;
    }

}
