package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by My PC on 3/15/2017.
 */

public class Home_ODau_DanhMuc extends Fragment {
    Button button;
    //Các hình ảnh của từng Item trong ListView
    public static   int[] imgAvatar = {R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,
            R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,
            R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung = {"Sang Trọng","Buffet","Nhà hàng","Ăn vặt/vỉa hè","Ăn chay","Café/Dessert","Quán ăn","Bar/pub","Quán nhậu","Beer club","Tiệm bánh","Tiệc tận nơi","Shop Online","Giao cơm văn phòng","Khu ẩm thực","Việt Nam", "Châu Mỹ","Mỹ","Tây Âu","Ý","Pháp","Đức","Tây Ban Nha","Trung Hoa","Ấn Độ","Thái Lan","Nhật Bản","Hàn Quốc","Malaysia","Quốc Tế"};
    ListView lvCustomListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        //get ListView theo ID từ layout xml
        View v = inflater.inflate(R.layout.home_odau_danhmuc, container, false);
        lvCustomListView = (ListView) v.findViewById(R.id.ListViewODau_DanhMuc);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);

        lvCustomListView.setAdapter(new CT_ODau_DanhMuc(getActivity(), tvNoiDung, imgAvatar));
        return v;

    }
}
