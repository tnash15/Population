package com.example.tae.apipopulation

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface APIService {

    @GET("population/{country}/{age}")
    fun getDetails(@Path("country") country: String,
                   @Path("age") age: Int): Call<Response>

}