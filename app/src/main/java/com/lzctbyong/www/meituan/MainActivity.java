package com.lzctbyong.www.meituan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lzctbyong.www.meituan.CityPicker.CityiPckerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choosecity(View view) {
        startActivityForResult(new Intent(this, CityiPckerActivity.class), 0x1);
    }
}
