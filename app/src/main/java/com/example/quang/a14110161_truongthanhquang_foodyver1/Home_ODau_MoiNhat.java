package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by My PC on 3/15/2017.
 */

public class Home_ODau_MoiNhat extends Fragment {
    //Các hình ảnh của từng Item trong ListView
    public static   int[] imgAvatar = {R.drawable.home_ic_filter_latest_act, R.drawable.home_ic_filter_most_near_act,
            R.drawable.home_ic_filter_top_of_week_act, R.drawable.home_ic_filter_tourist_act, R.drawable.home_ic_filter_ecard_act, R.drawable.home_ic_filter_most_reservation_act,
            R.drawable.home_ic_filter_bankcard_act, R.drawable.home_ic_delivery};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung = {"Mới nhất", "Gần tôi",
            "Phổ biến", "Du khách", "Ưu đãi E-card", "Đặt chỗ",
            "Ưu đãi thẻ", "Đặt giao hàng"};
    ListView lvCustomListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        //get ListView theo ID từ layout xml
        View v = inflater.inflate(R.layout.home_odau_moinhat, container, false);
        lvCustomListView = (ListView) v.findViewById(R.id.ListViewODau_MoiNhat);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
        lvCustomListView.setAdapter(new CT_AnGi_Adapter(getActivity(), tvNoiDung, imgAvatar));
        return v;

    }
}