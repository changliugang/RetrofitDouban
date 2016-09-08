package com.chang.cn.retrofitdouban;

import android.app.Application;

import butterknife.ButterKnife;

/**
 * 应该全局
 * Created by chang on 2016/7/18.
 */
public class AppApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
        ButterKnife.setDebug(BuildConfig.DEBUG);

    }
}
