package com.example.www.lifangxian20190407;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("李彦宏");
//        arrayList.add("马化腾");
//        arrayList.add("刘强东");
//        arrayList.add("周宏伟");

        for (int i=0;i<10;i++){
            Log.e("sss","一寸光阴一寸金");
        }
        int i=0;
        while (i<10){
            Log.e("sss","一寸光阴一寸金");
        }


    }
}
