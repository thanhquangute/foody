package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

/**
 * Created by My PC on 3/15/2017.
 */

public class TabThongBao extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener
{
        private TabHost mTabHost;
        private ViewPager mViewPager;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tabthongbao);
            initialiseTabHost();
            final ImageButton btnthongbao = (ImageButton)
            findViewById(R.id.caidatthongbao);
            btnthongbao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    doOpenCaiDatThongBao();
                }
            });

        }
        public void doOpenCaiDatThongBao()
        {
            Intent myIntent = new Intent(this, TabThongBao_CaiDatThongBao.class);
            startActivity(myIntent);
        }
        protected void onSaveInstanceState(Bundle outState) {
            outState.putString("tab", mTabHost.getCurrentTabTag()); //save the tab selected
            super.onSaveInstanceState(outState);
        }

        //Initialise ViewPager

        //
        //Initialise the tab host
        private void initialiseTabHost() {
            mTabHost = (TabHost) findViewById(android.R.id.tabhost);
            mTabHost.setup();
            TabWidget widget = mTabHost.getTabWidget();
            String[] tabName = {"Dịch vụ", "Của tôi", "Tin mới"};
            for(int i=0;i<tabName.length;i++){
                TabHost.TabSpec tabSpec;
                tabSpec = mTabHost.newTabSpec(tabName[i]);
                tabSpec.setIndicator(tabName[i]);
                tabSpec.setContent(new com.example.quang.a14110161_truongthanhquang_foodyver1.TabThongBao.TabFactory(getApplicationContext()));
                mTabHost.addTab(tabSpec);
                TextView tv=(TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                tv.setAllCaps(false);
                // định dạng màu nền cho tabhost
                widget.getChildAt(i).setBackgroundResource(R.drawable.click_tabwiget);
                // size cho tabhost là 16
                tv.setTextSize(16);
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
