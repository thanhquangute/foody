package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by My PC on 3/22/2017.
 */

public class CT_Profile_Listview1_Adapter  extends  BaseAdapter{
        String[] result;
        Context context;
        int[] imageId;
        public static LayoutInflater inflater=null;
        /**
         * Constructor này dùng để khởi tạo các giá trị
         * từ CustomListViewActivity truyền vào
         *
         * @paramcontext  : là Activity từ CustomListView
         * @paramimageId: Là danh sách image của list item truyền từ Main
         * @paramresult   : Danh sách nội dung của list item truyền từ Main
         */
        public CT_Profile_Listview1_Adapter(Context context, String[] result, int[] imageId) {
            this.context = context;
            this.result = result;
            this.imageId = imageId;
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }
        //Trả về độ dài của mảng chứa nội dung list item
        @Override
        public int getCount() {
            return result.length;
        }

        //Trả về vị trí của mảng chứa nội dung list item
        @Override
        public Object getItem(int position) {
            return position;
        }

        //Trả về vị trí của mảng image list item
        @Override
        public long getItemId(int position) {
            return position;
        }

        /**
         * hàm dùng để custom layout, ta phải override lại hàm này
         * từ CustomListViewActivity truyền vào
         *
         * @paramposition     : là vị trí của phần tử trong danh sách Item
         * @paramconvertView: convertView, dùng nó để xử lý Item
         * @paramparent       : Danh sách  truyền từ Main
         * @return View: trả về chính convertView
         */
        public class Holder{
            TextView textView;
            ImageView imageView;
        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View rowView;
            com.example.quang.a14110161_truongthanhquang_foodyver1.CT_Profile_Listview1_Adapter.Holder holder= new com.example.quang.a14110161_truongthanhquang_foodyver1.CT_Profile_Listview1_Adapter.Holder();
            rowView = inflater.inflate(R.layout.listview_angi_new, null);
            holder.textView = (TextView) rowView.findViewById(R.id.tvODau_New);
            holder.imageView = (ImageView) rowView.findViewById(R.id.imgODau_New);

            //lấy Nội dung của Item ra để thiết lập nội dung item cho đúng
            holder.textView.setText(result[position]);
            //lấy ImageView ra để thiết lập hình ảnh cho đúng
            holder.imageView.setImageResource(imageId[position]);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
                }
            });
            //trả về View này, tức là trả luôn về các thông số mới mà ta vừa thay đổi
            return rowView;
        }
    }
