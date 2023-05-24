package com.vimalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vimalapi.adsmodels.AdsPrefernce;
import com.vimalapi.adsmodels.ConstantAds;
import com.vimalapi.adutils.BaseAdsClass;

public class BaseActivity extends BaseAdsClass {
    AdsPrefernce adsPrefernce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstantAds.setAdsURL("1mMcTUkK6kf6nJVbtbWVDavHomfZae6YU1IWiIYRruBc");
        ConstantAds.preloadAppopen(true);
        ConstantAds.preloadInterstitial(true);
        adsPrefernce = new AdsPrefernce(this);
    }
}