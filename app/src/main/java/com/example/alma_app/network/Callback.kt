package com.example.alma_app.network

interface Callback<T> {

    fun onSuccess(result: T)

    fun onFailed(exception:Exception)

}