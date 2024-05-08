package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("X-RapidAPI-Key: 063ed0a645mshecc8590b8076dbbp1b2dc8jsn81ef4ff762c6" , "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")

    @GET("search")
    fun getData(@Query("q") query: String ): Call<MyData>

}