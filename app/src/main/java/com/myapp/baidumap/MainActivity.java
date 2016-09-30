package com.myapp.baidumap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.mapapi.SDKInitializer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在使用SDK 各组件之前初始化Context信息，传入ApplicationContext
        //使用该方法要在setContentView之前
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);


    }
}


