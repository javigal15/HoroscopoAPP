package com.example.horoscopoapp.domain.model

import com.example.horoscopoapp.data.providers.network.response.HoroscopeResponse

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}