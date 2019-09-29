package com.example.movie_app.data.local.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movie_app.data.model.MovieEntity

@Database(entities = [MovieEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao() : MovieDAO
}