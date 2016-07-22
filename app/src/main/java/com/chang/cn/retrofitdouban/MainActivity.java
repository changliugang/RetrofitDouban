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
//        Log.e(TAG, "onCreate: ");
//        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
//        GridLayoutManager manager = new GridLayoutManager(this, 3);
//        manager.setOrientation(OrientationHelper.VERTICAL);
//        recyclerview.setLayoutManager(manager);
//        recyclerview.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this)
//                .colorResId(android.R.color.holo_blue_bright)
//                .sizeResId(R.dimen.activity_horizontal_margin)
//                .showLastDivider().build());
//        QuickAdapter<String> adapter = new QuickAdapter<String>(this,R.layout.item_recycler,Config.stringList()) {
//            @Override
//            protected void convert(BaseViewHolder helper, String item) {
//                helper.setText(R.id.item_text,item);
//            }
//        };
//        HeaderAndFooterWrapper mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(adapter);
//
//        TextView t1 = new TextView(this);
//        t1.setText("Header 1");
//        TextView t2 = new TextView(this);
//        t2.setText("Header 2");
//        mHeaderAndFooterWrapper.addHeaderView(t1);
//        mHeaderAndFooterWrapper.addFootView(t2);
//        recyclerview.setAdapter(mHeaderAndFooterWrapper);
    }

}
