package com.example.movie_app.data

import com.example.movie_app.data.remote.api.ApiApp
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object TheMovieDBClient {
        const val API_KEY = "6e63c2317fbe963d76c3bdc2b785f6d1"
        const val BASE_URL = "https://api.themoviedb.org/3/"

    fun getClint() : ApiApp{
        val requestInterceptor = Interceptor{
            val url = it.request()
                .url()
                .newBuilder()
                .addQueryParameter("api_key", API_KEY)
                .build()

            val request = it.request()
                .newBuilder()
                .url(url)
                .build()
            return@Interceptor it.proceed(request)
        }
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(requestInterceptor)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build()
        return Retrofit.Builder()
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiApp::class.java)
    }
}