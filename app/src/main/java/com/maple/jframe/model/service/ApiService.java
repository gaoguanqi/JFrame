package com.maple.jframe.model.service;

import com.maple.jframe.model.data.BaseResponse;

import io.reactivex.Maybe;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * author: gaogq
 * time: 2019/4/12 11:49
 * description:
 */
public interface ApiService {

    @FormUrlEncoded
    @POST("small/user/v1/login")
    Maybe<BaseResponse<String>> login(@Field("phone") String phone, @Field("pwd") String pwd);
}
