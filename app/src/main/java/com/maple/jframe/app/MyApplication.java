package com.maple.jframe.app;

import android.app.Application;

import com.maple.jframe.app.config.AppConfig;
import com.maple.jframe.http.RetrofitManager;
import com.maple.jframe.model.service.ApiService;

/**
 * author: gaogq
 * time: 2019/4/12 10:16
 * description:
 */
public class MyApplication extends Application {
    private static MyApplication INSTANCE;
    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public static MyApplication getInstance(){
        return INSTANCE;
    }
}
