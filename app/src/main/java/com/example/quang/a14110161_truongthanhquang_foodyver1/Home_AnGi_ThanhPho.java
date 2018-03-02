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

public class Home_AnGi_ThanhPho extends Fragment {
    ImageButton imageButton;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_angi_thanhpho, container, false);
        imageButton = (ImageButton)view.findViewById(R.id.ImaDoiThanhPho);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doDoiThanhPho();
            }
        });
        button = (Button)view.findViewById(R.id.BtnDoiThanhPho);

        return  view;
    }
    public  void doDoiThanhPho()
    {
        Intent myIntent = new Intent(getActivity(), Home_ThanhPho_ChonThanhPho.class);
        startActivity(myIntent);
    }
}
