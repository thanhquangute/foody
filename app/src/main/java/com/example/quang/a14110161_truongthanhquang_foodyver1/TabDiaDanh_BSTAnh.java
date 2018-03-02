package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by My PC on 3/17/2017.
 */
public class TabDiaDanh_BSTAnh extends Fragment{
    private FragmentTabHost mtabhost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       mtabhost = new FragmentTabHost(getActivity());
        mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.tabdiadanh_bstanh);
        Bundle arg1  = new Bundle();
        arg1.putInt("arg Tab 1",1);
        Bundle arg2 = new Bundle();
        arg2.putInt("arg Tab 2", 2);

        mtabhost.addTab(mtabhost.newTabSpec("tab 1").setIndicator("Của bạn"),
        TabDiaDanh_Anh_CuaBan.class, arg1);
        mtabhost.addTab(mtabhost.newTabSpec("tab 2").setIndicator("Xem nhiều"),
                TabDiaDanh_Anh_XemNhieu.class, arg2);

        for(int i=0; i<mtabhost.getTabWidget().getChildCount();i++)
        {
            TextView tv=(TextView) mtabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setAllCaps(false);
            // định dạng màu nền cho tabhost
            mtabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#ffffff"));
            // size cho tabhost là 13
            tv.setTextSize(14);
        }
        return mtabhost;
    }
}
