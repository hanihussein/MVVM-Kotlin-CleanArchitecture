package com.hani.baseandroid.core.bases

import com.hani.baseandroid.core.models.ErrorType
import com.hani.baseandroid.core.models.Output
import com.hani.baseandroid.core.source.network.RemoteSourceManager
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Call

abstract class BaseRepository : KoinComponent {

    val remoteDataSource: RemoteSourceManager by inject()

    fun <T, R : Any> safeApiCall(
        call: Call<T>, transform: (T) -> R, default: T,
        error: String
    ): Output<R> {

        try {
            val response = call.execute()

            return if (response.isSuccessful)
                Output.Success(transform((response.body() ?: default)))
            else
                Output.Error(ErrorType.DATA, "OOps .. Something went wrong due to  $error")

        } catch (exception: Throwable) {
            return Output.Error(ErrorType.CONNECTION, "OOps .. Something went wrong due to  $error")
        }
    }

}