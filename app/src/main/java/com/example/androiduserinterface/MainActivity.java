package com.example.androiduserinterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //오버라이딩 할 때
        //직접 만든 클래스의 메소드를 오버라이딩 하는 경우가
        //아니면 상위 클래스의 메소드를 호출해 주어야 합니다.
        super.onCreate(savedInstanceState);

        //xml 파일의 내용을 메인 뷰로 설정
        //setContentView(R.layout.activity_main);

        //레이아웃 생성
        LinearLayout linear =
                new LinearLayout(this);
        //버튼 생성
        Button btn1 = new Button(this);
        //버튼의 속성을 설정
        btn1.setText("버튼");
        //버튼을 레이아웃에 추가
        linear.addView(btn1);

        //Activity에 레이아웃을 메인 뷰로 설정
        setContentView(linear);

    }

}