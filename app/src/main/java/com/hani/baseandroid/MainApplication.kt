package com.hani.baseandroid

import android.app.Application
import com.hani.baseandroid.core.di.networkModule
import com.hani.baseandroid.core.di.repoModule
import com.hani.baseandroid.core.di.useCaseModule
import com.hani.baseandroid.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {

            androidContext(this@MainApplication)

            modules(listOf(viewModelModule, repoModule, networkModule,useCaseModule))

        }
    }

}




