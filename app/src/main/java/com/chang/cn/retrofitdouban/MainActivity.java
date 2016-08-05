package com.chang.cn.retrofitdouban;

import android.content.Intent;
import android.os.Bundle;

import com.chang.cn.retrofitdouban.activity.BaseActivity;
import com.chang.cn.retrofitdouban.brvahstudy.StudyBrvahActivity;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this,StudyBrvahActivity.class));
    }


}
