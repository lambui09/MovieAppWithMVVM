package com.example.movie_app.data.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Long,
    @SerializedName("results")
    val movieList: List<MovieEntity>,
    @SerializedName("total_pages")
    val totalPages: Long,
    @SerializedName("total_results")
    val totalResults: Long
)