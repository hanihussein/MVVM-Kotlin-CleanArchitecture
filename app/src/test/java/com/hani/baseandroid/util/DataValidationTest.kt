package com.hani.baseandroid.util

import com.hani.baseandroid.core.Util.DataValidator
import org.junit.Assert
import org.junit.Test

class DataValidationTest {


    @Test
    fun login_UsernameEmpty_False() {

        val username: String? = null

        Assert.assertFalse(DataValidator.isUsernameValid(username))
    }


    @Test
    fun login_UsernameBlank_False() {

        val username: String? = ""

        Assert.assertFalse(DataValidator.isUsernameValid(username))
    }

    @Test
    fun login_UsernameShort_False() {

        val username: String? = "han"

        Assert.assertFalse(DataValidator.isUsernameValid(username))
    }


    @Test
    fun login_UsernameValid_True() {

        val username: String? = "hani"

        Assert.assertTrue(DataValidator.isUsernameValid(username))
    }
}