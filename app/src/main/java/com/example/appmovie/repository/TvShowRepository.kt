package com.example.appmovie.repository

import com.example.appmovie.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject constructor( private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()


}