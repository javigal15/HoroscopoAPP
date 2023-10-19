package com.example.horoscopoapp.data.providers.network.response

import com.example.horoscopoapp.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName

data class HoroscopeResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}