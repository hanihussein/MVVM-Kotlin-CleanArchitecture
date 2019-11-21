package com.hani.baseandroid.core.Util


class DataValidator {

    companion object {


        fun isUsernameValid(username: String?): Boolean {

            return (!username.isNullOrBlank() && username.length >= 4)

        }


        fun iPasswordValid(password: String?): Boolean {

            return (!password.isNullOrBlank() && password.length >= 5)

        }
    }

}

