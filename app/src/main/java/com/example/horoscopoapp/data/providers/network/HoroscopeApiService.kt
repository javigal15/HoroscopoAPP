package com.example.horoscopoapp.data.providers.network

import com.example.horoscopoapp.data.providers.network.response.HoroscopeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String): HoroscopeResponse
}