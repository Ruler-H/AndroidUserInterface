package com.example.androiduserinterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewAttribute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attribute);

        //XML에 디자인 뷰를 자바에서 사용하기 위해 참조를 가져오는 방법
        Button btn = findViewById(R.id.btnvisible);
        //지역변수에 final을 붙이는 경우는 Anonymous Class에서 사용하기 위해
        final TextView msg = (TextView)findViewById(R.id.txtmsg);

        //버튼을 클릭했을 때 수행할 내용
        btn.setOnClickListener(new Button.OnClickListener(){
           @Override
           public void onClick(View view){
               msg.setVisibility(View.VISIBLE);
           }
        });
    }
}