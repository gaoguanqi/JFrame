package com.maple.jframe.http;

import android.content.Context;
import android.support.annotation.NonNull;

import com.maple.jframe.model.service.ApiService;
import com.maple.jframe.utils.LogUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: gaogq
 * time: 2019/4/12 11:50
 * description:
 */
public class RetrofitManager {

    private String baseUrl;
    private Retrofit retrofit;
    private OkHttpClient client;

    private RetrofitManager() { }
    private RetrofitManager(Context context,String baseUrl) {
        this.baseUrl = baseUrl;
        getRetrofit(context);
    }

    public static RetrofitManager getInstance(Context context,String baseUrl){
        return new RetrofitManager(context,baseUrl);
    }



    private Retrofit getRetrofit(Context context){
        synchronized (RetrofitManager.class) {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(getOkHttpClient(context))
                        .build();
            }
        }
        return retrofit;
    }

    private OkHttpClient getOkHttpClient(Context context){
        if (client == null){
            client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10,TimeUnit.SECONDS)
                    .readTimeout(15,TimeUnit.SECONDS)
//                    .addInterceptor(new ReadCookiesInterceptor(context))
//                    .addInterceptor(new SaveCookiesInterceptor(context))
                    .addInterceptor(getInterceptor())
                    .build();

        }
        return client;
    }


    public final <T> T createService(final Class<T> service){
        return retrofit.create(service);
    }


    private static HttpLoggingInterceptor getInterceptor(){
        return new HttpLoggingInterceptor(s ->{
            LogUtils.logGGQ("RetrofitLog:"+s);
        }).setLevel(HttpLoggingInterceptor.Level.BODY);
    }
}
