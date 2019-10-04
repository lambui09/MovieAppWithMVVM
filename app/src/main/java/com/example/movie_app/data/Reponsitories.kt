package com.example.movie_app.data

import com.bumptech.glide.load.engine.Resource
import com.example.movie_app.data.local.storage.MovieDAO
import com.example.movie_app.data.model.MovieEntity
import com.example.movie_app.data.remote.api.ApiApp
import com.example.movie_app.data.remote.network.NetworkBoundResource
import io.reactivex.Observable
import javax.inject.Singleton

@Singleton
class Reponsitories(private val mMovieDAO : MovieDAO,
                    private val mApiApp : ApiApp) {
    fun loadMoviesByType() : Observable<Resource<List<MovieEntity>>> {
        return object : NetworkBoundResource<List<MovieEntity>, Reponsitories>(){

        }
    }


}