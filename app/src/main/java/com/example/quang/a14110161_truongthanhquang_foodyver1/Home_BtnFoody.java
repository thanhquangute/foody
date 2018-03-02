package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Home_BtnFoody extends Activity{
    //Các hình ảnh của từng Item trong ListView
    public static   int[] imgAvatar = {};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung = {};
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_btnfoody);
    }


}
