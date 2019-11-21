package com.hani.baseandroid.data.remote

open class BaseResponse(var rCode: String = "00000", var rMessage: String = "")


data class LoginResponse(val loginSuccess: Boolean= false) : BaseResponse(){}