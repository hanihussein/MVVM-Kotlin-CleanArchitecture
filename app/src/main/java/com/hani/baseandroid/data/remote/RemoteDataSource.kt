package com.hani.baseandroid.data.remote

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface RemoteDataSource {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("username")username: String , @Field("password")password: String ): Call<LoginResponse>


}