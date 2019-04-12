package com.maple.jframe.utils;

import android.util.Log;

import com.maple.jframe.BuildConfig;


public class LogUtils {

    public static void logGGQ(String msg){
        if(BuildConfig.DEBUG){
            Log.i("GGQ", msg);
        }
    }
}
