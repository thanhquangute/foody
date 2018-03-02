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
 * Created by My PC on 3/15/2017.
 */

public class Home_AnGi extends Fragment {
    private FragmentTabHost mtabhost;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        mtabhost = new FragmentTabHost(getActivity());
        mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.home_angi);

        Bundle arg1 = new Bundle();
        arg1.putInt("arg1 Tab 1", 1);

        Bundle arg2 = new Bundle();
        arg2.putInt("arg2 Tab 2", 2);

        Bundle arg3 = new Bundle();
        arg3.putInt("arg Tab 3", 3);





        //Set tab activity to tab menu
        mtabhost.addTab(mtabhost.newTabSpec("tab1").setIndicator("Mới nhất"),
                Home_AnGi_MoiNhat.class, arg1);
        mtabhost.addTab(mtabhost.newTabSpec("tab2").setIndicator("Danh mục"),
                Home_AnGi_DanhMuc.class, arg2);
        mtabhost.addTab(mtabhost.newTabSpec("tab3").setIndicator("Tỉnh thành"),
                Home_AnGi_ThanhPho.class, arg3);

        for(int i=0; i<mtabhost.getTabWidget().getChildCount();i++)
        {
            TextView tv=(TextView) mtabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setAllCaps(false);
            // định dạng màu nền cho tabhost
            mtabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#ffffff"));
            // size cho tabhost là 16
            tv.setTextSize(16);
        }
        return mtabhost;
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        mtabhost = null;
    }
}

