package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    TabHost mtabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Assign id to Tabhost
        mtabhost = (TabHost) findViewById(android.R.id.tabhost);

        // Creating tab menu.
        TabHost.TabSpec tab1 = mtabhost.newTabSpec("Tab 1");
        TabHost.TabSpec tab2 = mtabhost.newTabSpec("Tab 2");
        TabHost.TabSpec tab3 = mtabhost.newTabSpec("Tab 3");
        TabHost.TabSpec tab4 = mtabhost.newTabSpec("Tab 4");
        TabHost.TabSpec tab5 = mtabhost.newTabSpec("Tab 5");

        //Setting up tab
        tab1.setIndicator("", getResources().getDrawable(R.drawable.ic_home_black_24dp));
        tab2.setIndicator("", getResources().getDrawable(R.drawable.ic_filter_none_black_24dp));
        tab3.setIndicator("", getResources().getDrawable(R.drawable.ic_search_black_24dp));
        tab4.setIndicator("", getResources().getDrawable(R.drawable.ic_chuong));
        tab5.setIndicator("", getResources().getDrawable(R.drawable.ic_perm_identity_black_24dp));

        //Set tab 1 activity to tab menu.
        tab1.setContent(new Intent(this,HomePage.class));
        tab2.setContent(new Intent(this,TabDiaDanh.class));
        tab3.setContent(new Intent(this,TabSearch.class));
        tab4.setContent(new Intent(this,TabThongBao.class));
        tab5.setContent(new Intent(this,TabProfile.class));

        //Adding tab to tabhost view.
        mtabhost.addTab(tab1);
        mtabhost.addTab(tab2);
        mtabhost.addTab(tab3);
        mtabhost.addTab(tab4);
        mtabhost.addTab(tab5);
    }
}

