package com.example.horoscopoapp.domain.model.useCase

import com.example.horoscopoapp.domain.model.PredictionModel
import com.example.horoscopoapp.domain.model.Repository
import javax.inject.Inject

class GetPrediction @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign: String): PredictionModel? {
        return repository.getPrediction(sign)
    }
}