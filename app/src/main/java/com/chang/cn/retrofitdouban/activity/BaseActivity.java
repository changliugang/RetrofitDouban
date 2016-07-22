package com.chang.cn.retrofitdouban.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.barryzhang.temptyview.TViewUtil;
import com.chang.cn.retrofitdouban.R;

/**
 * Activity基类
 * Created by chang on 2016/7/18.
 */
public class BaseActivity extends AppCompatActivity {

    protected static final int NO_DATA = 1;
    protected static final int REQUEST_ERR = 2;
    protected TViewUtil.EmptyViewBuilder emptyViewConfig;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        emptyViewConfig = TViewUtil.EmptyViewBuilder.getInstance(getApplicationContext());
    }


    protected void createStateView(int state, RecyclerView recyclerView){
        switch (state){
            case NO_DATA:
                    emptyViewConfig
                        .setEmptyTextSize(14)
                        .setEmptyTextColor(Color.GRAY)
                        .setEmptyText("No Data")
                        .setIconSrc(R.drawable.no_data)
                        .bindView(recyclerView);
                break;
            case REQUEST_ERR:
                emptyViewConfig.setEmptyText("Load Error")
                    .setEmptyTextSize(12)
                    .setEmptyTextColor(Color.GRAY)
                    .setIconSrc(R.drawable.load_err)
                    .setShowText(true)
                    .setShowButton(true)
                    .setActionText("retry")
                    .setAction(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getApplicationContext(),"Yes, clicked~",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .bindView(recyclerView);

                break;
        }
    }


}
