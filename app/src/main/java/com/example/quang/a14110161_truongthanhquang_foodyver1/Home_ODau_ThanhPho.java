package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by My PC on 3/15/2017.
 */

public class Home_ODau_ThanhPho extends Fragment {
    ImageButton btnthongbao;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_odau_thanhpho, container, false );
        btnthongbao = (ImageButton)view.findViewById(R.id.ImaBtndoithanhpho) ;

        btnthongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doDoiThanhPho();
            }
        });
        button = (Button)view.findViewById(R.id.btndoitinhthanh) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doDoiThanhPho();
            }
        });
        return  view;
    }

    public void doDoiThanhPho()
    {
        Intent myIntent = new Intent(getActivity(), Home_ThanhPho_ChonThanhPho.class);
        startActivity(myIntent);
    }

}
