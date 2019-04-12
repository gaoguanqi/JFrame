package com.maple.jframe.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maple.jframe.R;
import com.maple.jframe.app.MyApplication;
import com.maple.jframe.app.base.BaseActivity;
import com.maple.jframe.app.base.IView;
import com.maple.jframe.app.config.AppConfig;
import com.maple.jframe.http.RetrofitManager;
import com.maple.jframe.http.RxLifecycleUtils;
import com.maple.jframe.http.RxUtils;
import com.maple.jframe.model.data.BaseResponse;
import com.maple.jframe.model.service.ApiService;
import com.maple.jframe.utils.LogUtils;

import io.reactivex.functions.Consumer;

public class SplashActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        RetrofitManager.getInstance(MyApplication.getInstance(), AppConfig.BASE_URL).createService(ApiService.class)
//                .login("16619948760","123")
//                .subscribe(new Consumer<BaseResponse<String>>() {
//            @Override
//            public void accept(BaseResponse<String> s) throws Exception {
//                LogUtils.logGGQ("login:"+s);
//            }
//        });
//
       // RetrofitManager.getInstance(MyApplication.getInstance(),AppConfig.BASE_URL).createService(ApiService.class).login("","").compose(RxUtils.applySchedulers(this));
        startActivity(new Intent(this,TestActivity.class));
    }

}
