package com.chang.cn.retrofitdouban.activity;

import android.content.Intent;
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

    public static final String EXTRA_KEY_1 = "extra_key_1";
    public static final String EXTRA_KEY_2 = "extra_key_2";
    public static final String EXTRA_KEY_3 = "extra_key_3";
    public static final String EXTRA_KEY_4 = "extra_key_4";
    public static final String EXTRA_KEY_5 = "extra_key_5";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}
