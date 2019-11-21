package com.hani.baseandroid.data.repository

import com.hani.baseandroid.core.bases.BaseRepository
import com.hani.baseandroid.core.models.Output
import com.hani.baseandroid.data.remote.LoginResponse
import com.hani.baseandroid.data.remote.RemoteDataSource
import com.hani.baseandroid.data.wrapper.toLoginResponse
import com.hani.baseandroid.domain.model.LoginEntity
import com.hani.baseandroid.domain.repository.LoginRepository

class LoginRepositoryImpl : BaseRepository(), LoginRepository {

    override  fun login(username: String, password: String): Output<LoginEntity> {

        return safeApiCall(remoteDataSource.makeRemoteCall(RemoteDataSource::class.java)
            .login(username, password), transform = { it.toLoginResponse() }, default = LoginResponse(), error = "")

    }


}

