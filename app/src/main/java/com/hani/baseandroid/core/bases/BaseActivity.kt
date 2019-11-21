package com.hani.baseandroid.core.bases

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(mainLayout())

        initView()
    }


    abstract fun initView()

    abstract fun mainLayout(): Int
}