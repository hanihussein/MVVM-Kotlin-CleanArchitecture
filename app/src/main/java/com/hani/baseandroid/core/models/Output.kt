package com.hani.baseandroid.core.models



sealed class Output<out T> {

    data class Success<out T : Any>(val output: T) : Output<T>()
    data class Error(val errorType: ErrorType, val error: String) : Output<Nothing>()
    class Loading() : Output<Nothing>()

}

