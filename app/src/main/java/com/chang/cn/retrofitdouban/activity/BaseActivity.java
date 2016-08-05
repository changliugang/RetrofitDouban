package com.chang.cn.retrofitdouban.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity基类
 * Created by chang on 2016/7/18.
 */
public class BaseActivity extends AppCompatActivity {

    protected static final int NO_DATA = 1;
    protected static final int REQUEST_ERR = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




}
