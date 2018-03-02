package com.example.quang.a14110161_truongthanhquang_foodyver1;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

/**
 * Created by My PC on 3/15/2017.
 */

public class TabSearch extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabsreach);
        TextView tvSpan = (TextView)findViewById(R.id.textviewSearch);
        SpannableString content = new SpannableString("Địa điểm tại");
        content.setSpan(new UnderlineSpan(), 0,8, 0);
        TextView tvSpanm = (TextView)findViewById(R.id.textviewDiaDiem);
        SpannableString content1 = new SpannableString("TPHCM");
        content.setSpan(new UnderlineSpan(),0, content1.length(), 0);

// từ chữ thứ 5 - > 8 sẽ được gạch dưới , ngoài ra các bạn có thể tìm hiểu thêm để chữ nghiêng , đậm , .....
        tvSpan.setText(content);
        tvSpan.setText(content1);

    }
}