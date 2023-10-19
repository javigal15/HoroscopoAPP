package com.example.horoscopoapp.data.providers

import android.util.Log
import com.example.horoscopoapp.data.providers.network.HoroscopeApiService
import com.example.horoscopoapp.data.providers.network.response.HoroscopeResponse
import com.example.horoscopoapp.domain.model.PredictionModel
import com.example.horoscopoapp.domain.model.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Javi", "Ha ocurrido un error, ${it.message}") }
        return null
    }
}