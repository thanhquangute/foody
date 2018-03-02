package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by My PC on 3/17/2017.
 */

public class TabHome_DiaDanh_Adapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public TabHome_DiaDanh_Adapter(FragmentManager fm, List<Fragment> fragments){
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position){
        return this.fragments.get(position);
    }

    @Override
    public  int getCount(){
        return this.fragments.size();
    }
}
