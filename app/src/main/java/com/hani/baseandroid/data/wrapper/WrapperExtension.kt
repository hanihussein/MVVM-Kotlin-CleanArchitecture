package com.hani.baseandroid.data.wrapper

import com.hani.baseandroid.data.remote.LoginResponse
import com.hani.baseandroid.domain.model.LoginEntity


fun LoginResponse.toLoginResponse() = LoginEntity(isLoggedIn = loginSuccess, message = rMessage )


