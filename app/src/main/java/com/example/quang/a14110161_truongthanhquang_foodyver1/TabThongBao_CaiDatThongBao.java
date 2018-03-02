package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by My PC on 3/22/2017.
 */

public class TabThongBao_CaiDatThongBao extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabthongbao_caidatthongbao);
        // Khai báo 1 imagebutton có id là btnquaylaithongbao
        final ImageButton btnthongbao = (ImageButton)
                findViewById(R.id.btnquaylaithongbao);
        // Tạo sự kiện click view. Nghĩa là sau khi kích vào button này sẽ chuyển ddến một trang khác
        // ở đây sau khi click sẽ trở về trang thông báo bình thường
        btnthongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doGoThongBao();
            }
        });

    }
    // Tạo hàm mới
    public void doGoThongBao()
    {
        // Khai báo một intent mới khi click vào sẽ chuyển đến tabThongBao
        Intent myIntent = new Intent(this, TabThongBao.class);
        startActivity(myIntent);

    }
}
