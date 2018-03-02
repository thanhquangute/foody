package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by My PC on 3/23/2017.
 */

public class Home_ThanhPho_DoiQuocGia extends Activity {
    ImageButton imageButton;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_thanhpho_chonquocgia);
        final ImageButton imageButton = (ImageButton)
                findViewById(R.id.ImaQuaylai);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doQuayLai();
            }
        });
        final Button button = (Button)
                findViewById(R.id.btnXong);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClickXong();
            }
        });

    }
    public void doQuayLai()
    {
        Intent myIntent = new Intent(this, Home_ThanhPho_ChonThanhPho.class);
        startActivity(myIntent);
    }
    public void doClickXong()
    {
        Intent myIntent = new Intent(this, Home_ThanhPho_ChonThanhPho.class);
        startActivity(myIntent);
    }
}
