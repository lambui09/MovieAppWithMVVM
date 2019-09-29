package com.example.movie_app.data.local.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movie_app.data.model.MovieEntity

@Dao
interface MovieDAO {
    /**
     * insert movies that it fetched from api
     * */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies : List<MovieEntity>) : LongArray

    /**
     * fetch the movies stored locally
     * */
    @Query("Select * from MovieEntity")
    fun getMovies() : List<MovieEntity>


}