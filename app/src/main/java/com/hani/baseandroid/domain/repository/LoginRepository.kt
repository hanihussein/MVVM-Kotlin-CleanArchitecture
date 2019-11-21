package com.hani.baseandroid.domain.repository

import com.hani.baseandroid.core.models.Output
import com.hani.baseandroid.domain.model.LoginEntity

interface LoginRepository {

     fun login(username: String, password: String) : Output<LoginEntity>
}