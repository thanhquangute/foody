package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by My PC on 3/15/2017.
 */

public class TabDiaDanh extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {
    private TabHost mTabHost;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabdiadanh);

        intialiseViewPager();
        initialiseTabHost();
    }

    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("tab", mTabHost.getCurrentTabTag()); //save the tab selected
        super.onSaveInstanceState(outState);
    }


    //
    //Initialise ViewPager
    private void intialiseViewPager() {

        mViewPager = (ViewPager) findViewById(R.id.viewpagerdiadanh);

        List<Fragment> listFragments = new ArrayList<Fragment>();
        listFragments.add(new TabDiaDanh_BSTDiaDiem());
        listFragments.add(new TabDiaDanh_BSTAnh());

        TabHome_DiaDanh_Adapter pagerAdapter = new TabHome_DiaDanh_Adapter(getSupportFragmentManager(), listFragments);

        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setOnPageChangeListener(this);

    }

    //
    //Initialise the tab host
    private void initialiseTabHost() {
        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        String[] tabName = {"Bộ sưu tập địa danh", "Bộ sưu tập ảnh"};
        for(int i=0;i<tabName.length;i++){
            TabHost.TabSpec tabSpec;
            tabSpec = mTabHost.newTabSpec(tabName[i]);
            tabSpec.setIndicator(tabName[i]);
            tabSpec.setContent(new TabDiaDanh.TabFactory(getApplicationContext()));
            mTabHost.addTab(tabSpec);
                TextView tv=(TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                tv.setAllCaps(false);
                // định dạng màu nền cho tabhost
                mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#ff0000"));
                // size cho tabhost là 12
                tv.setTextSize(12);
        }
        mTabHost.setOnTabChangedListener(this);
    }



    //
    public class TabFactory implements TabHost.TabContentFactory{
        private final Context mContext;
        public TabFactory(Context context){
            mContext = context;
        }

        @Override
        public View createTabContent(String tag) {
            View v = new View(mContext);
            v.setMinimumWidth(0);
            v.setMinimumHeight(0);
            return v;
        }
    }

    //
    public void onTabChanged(String tag) {
        //TabInfo newTab = this.mapTabInfo.get(tag);
        int pos = this.mTabHost.getCurrentTab();
        this.mViewPager.setCurrentItem(pos);
    }

    //
    @Override
    public void onPageScrolled(int position, float positionOffset,
                               int positionOffsetPixels) {
        // TODO Auto-generated method stub

    }

    //
    @Override
    public void onPageSelected(int position) {
        // TODO Auto-generated method stub
        this.mTabHost.setCurrentTab(position);
    }

    //
    @Override
    public void onPageScrollStateChanged(int state) {
        // TODO Auto-generated method stub

    }
}
