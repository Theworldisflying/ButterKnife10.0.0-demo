package com.example.butterknife_demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
//    绑定view
    @BindView(R.id.textView)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        绑定当前视图
        ButterKnife.bind(this);
    }
    // 点击事件
    @OnClick(R.id.textView)
    public void onClick(){
        Toast.makeText(getApplicationContext(),"=====",Toast.LENGTH_LONG).show();
    }
}
