package com.example.zhuozhanapplication.httpUtils;

import com.example.zhuozhanapplication.bean.JiaoLiuBean;
import com.example.zhuozhanapplication.bean.RenWuLeiBean;

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
    Call<ResponseBody> getCheng(@Query("Authorization")String Authorization);

    //任务列表
    @GET("command/combat/getCaseListByTokenAndStatus")
    Call<RenWuLeiBean> getRenWu(@Query("Authorization")String Authorization,
                                @Query("status")String status);

    //工作交流
    @GET("http://39.98.37.28:8085/command/article/getType")
    Call<JiaoLiuBean> getJiao();

}
