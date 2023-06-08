package com.khairi.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getRick(): Call<ResponseRick>
}