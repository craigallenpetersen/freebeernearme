package com.subprint.freebeernearme;

import com.phonegap.DroidGap;

import android.app.Activity;
import android.os.Bundle;

public class FreeBeerNearMe extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}