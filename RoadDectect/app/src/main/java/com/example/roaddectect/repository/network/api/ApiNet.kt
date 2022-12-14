package com.example.roaddectect.repository.network.api

import com.example.roaddectect.repository.network.responce.ChangepwdResponse
import com.example.roaddectect.repository.network.responce.EmailResponse
import com.example.roaddectect.repository.network.responce.LoginResponse
import com.example.roaddectect.repository.network.responce.RegisterResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiNet {

    /**
     * 登陆相关
     */
    @FormUrlEncoded
    @POST("php/connect.php")
    fun postLogin(
        @Field("name") user:String,
        @Field("pwd") pswd:String
    ): Call<LoginResponse>
    /**
     * 注册相关
     */
    @FormUrlEncoded
    @POST("php/regist.php")
    fun postRegister(
        @Field("name") user:String,
        @Field("pwd") pswd:String,
        @Field("email") email:String
    ):Call<RegisterResponse>

    /**
     * 发送邮件相关
     */
    @FormUrlEncoded
    @POST("php/email.php")
    fun postEmail(
        @Field("email") email: String
    ): Call<EmailResponse>

    /**
     * 修改密码相关
     */
    @FormUrlEncoded
    @POST("php/changepwd.php")
    fun postChangepwd(
        @Field("name") name:String,
        @Field("pwd") pwd:String
    ):Call<ChangepwdResponse>
}