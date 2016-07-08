package com.tomer.alwayson;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;

public class AlwaysOnAMOLED extends Application {
    static {
        try {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_AUTO);
        } catch (NoClassDefFoundError e) {
            Log.i("Error in application", "Android failed to do its job.");
        }
    }
}
