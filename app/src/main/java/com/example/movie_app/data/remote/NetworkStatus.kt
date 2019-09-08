package com.example.movie_app.data.remote

import com.example.movie_app.enum.Status

class NetworkStatus(val status : Status, val msg : String) {
    val LOADED : NetworkStatus
    val LOADING : NetworkStatus
    val ERROR : NetworkStatus
    init {
        LOADED = NetworkStatus(Status.SUCCESS, "success")
        LOADING = NetworkStatus(Status.RUNNING, "loading")
        ERROR = NetworkStatus(Status.FAILED, "error")
    }
}