package com.example.animationtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typewriter writer = new Typewriter(this);
        setContentView(writer);

        //Add a character every 150ms
        writer.setCharacterDelay(150);
        writer.animateText("CFD là viết tắt của Contract for Difference (Hợp đồng Chênh lệch). Đây là một thỏa thuận giữa hai bên, bên mua và bên bán, theo đó bên bán phải trả cho bên mua phần chênh lệch về giá trị của tài sản ở thời điểm hiện tại và giá trị tại thời điểm hợp đồng. CFD đang ngày càng trở nên phổ biến với các nhà giao dịch nhờ một số ưu điểm.");
    }
}
