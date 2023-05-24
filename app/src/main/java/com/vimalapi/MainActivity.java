package com.vimalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vimalapi.adsmodels.ConstantAds;
import com.vimalapi.adutils.BaseAdsClass;

public class MainActivity extends BaseAdsClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstantAds.setAdsURL("Sheet_ID");

    }
}