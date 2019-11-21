package com.hani.baseandroid.domain.usecase

import com.hani.baseandroid.core.bases.BaseUseCase
import com.hani.baseandroid.core.models.Output
import com.hani.baseandroid.domain.model.LoginEntity
import com.hani.baseandroid.domain.repository.LoginRepository

class LoginUseCase(var loginRepository: LoginRepository) : BaseUseCase<LoginEntity, LoginUseCase.Params>() {

    override suspend fun run(params: Params): Output<LoginEntity> {

        return loginRepository.login(params.username, params.password)
    }

    data class Params(val username: String, val password: String)

}