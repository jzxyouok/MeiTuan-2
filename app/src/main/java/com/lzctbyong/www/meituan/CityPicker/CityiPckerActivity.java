package com.lzctbyong.www.meituan.CityPicker;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lzctbyong.www.meituan.CityPicker.Interface.letterinterface;
import com.lzctbyong.www.meituan.CityPicker.V.SideLetterBar;
import com.lzctbyong.www.meituan.R;

public class CityiPckerActivity extends AppCompatActivity {

    private android.widget.TextView tvletteroverlay;
    private com.lzctbyong.www.meituan.CityPicker.V.SideLetterBar sideletterbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityi_pcker);
        /*获取控件*/
        findview();
        /*传递textview到view*/
        sideletterbar.postview(tvletteroverlay);
        /**/
        sideletterbar.setOnLetterChangedListener(new letterinterface() {
            @Override
            public void onLetterChanged(String letter) {

            }
        });
    }

    private void findview() {
        this.sideletterbar = (SideLetterBar) findViewById(R.id.side_letter_bar);
        this.tvletteroverlay = (TextView) findViewById(R.id.tv_letter_overlay);
    }

    public void backtomain(View view) {
        NavUtils.navigateUpFromSameTask(this);
    }
}
