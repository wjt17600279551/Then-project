package com.example.zhuozhanapplication.httpUtils;

import com.example.zhuozhanapplication.ChengGongBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyService {
    //登录接口
    @POST("user/login")
    Call<ResponseBody> getLogin(@Query("username") String username,
                                @Query("password") String password);

    //登陆成功人员的信息
    @GET("command/user/getUserInfoByToken")
    Call<ChengGongBean> getCheng(@Query("Authorization")String Authorization);

}
