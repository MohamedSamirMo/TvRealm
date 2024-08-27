package com.example.appmovie.api

import com.example.appmovie.helpers.Contents
import com.example.appmovie.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Contents.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>

}