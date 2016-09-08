package com.chang.cn.retrofitdouban;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.chang.cn.retrofitdouban.activity.BaseActivity;
import com.chang.cn.retrofitdouban.fragment.MoviePageFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Bind(R.id.tab_layout)
    TabLayout mTabLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(MoviePageFragment.newInstance(Config.COMING_SOON));
        fragments.add(MoviePageFragment.newInstance(Config.IN_THEATERS));
        fragments.add(MoviePageFragment.newInstance(Config.TOP250));
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this, fragments);
        mViewpager.setOffscreenPageLimit(2);
        mViewpager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewpager);

    }

    public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        private String[] mTabs;
        private List<Fragment> mFragments;

        public SimpleFragmentPagerAdapter(FragmentManager fm, AppCompatActivity context, List<Fragment> fragments) {
            super(fm);
            mFragments = fragments;
            mTabs = context.getResources().getStringArray(R.array.tabs);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments != null ? mFragments.get(position) : null;
        }

        @Override
        public int getCount() {
            return mTabs != null ? mTabs.length : 0;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabs != null ? mTabs[position] : "";
        }
    }
}
