package com.example.movie_app.data.remote.api

import android.database.Observable
import com.example.movie_app.data.model.MovieResponse
import retrofit2.http.GET

interface ApiApp {

    @GET("movie/popular?language=en-US&region=US&page=1")
    fun fetchMoviesByType() : Observable<MovieResponse>




}