package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by My PC on 3/15/2017.
 */

public class TabProfile extends Activity {
    //Các hình ảnh của từng Item trong ListView
    public static   int[] imgAvatar1 = {R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung1 = {"Việt Nam", "Châu Mỹ","Mỹ","Tây Âu","Ý"};
    public static   int[] imgAvatar2 = {R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung2 = {"Việt Nam", "Châu Mỹ","Mỹ","Tây Âu","Ý"};
    public static   int[] imgAvatar3 = {R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay,R.drawable.ic_anchay};
    //Nội dung của từng Item trong ListView
    public static   String[] tvNoiDung3 = {"Việt Nam", "Châu Mỹ","Mỹ","Tây Âu","Ý"};
    ListView lvCustomListView1, lvCustomListView2, lvCustomListView3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabprofile);


    //get ListView theo ID từ layout xml
        lvCustomListView1 = (ListView)findViewById(R.id.ListView1);
       // lvCustomListView2= (ListView)findViewById(R.id.ListView2);
        //lvCustomListView3 = (ListView)findViewById(R.id.ListView3);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
        lvCustomListView1.setAdapter(new CT_Profile_Listview1_Adapter (this,tvNoiDung1, imgAvatar1));

       // lvCustomListView2.setAdapter(new CT_Profile_Listview1_Adapter (this,tvNoiDung2, imgAvatar2));
        //lvCustomListView3.setAdapter(new CT_Profile_Listview1_Adapter (this,tvNoiDung3, imgAvatar3));
    }
}
