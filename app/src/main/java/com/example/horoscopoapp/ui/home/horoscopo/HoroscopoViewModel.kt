package com.example.horoscopoapp.ui.home.horoscopo

import androidx.lifecycle.ViewModel
import com.example.horoscopoapp.data.providers.HoroscopeProvider
import com.example.horoscopoapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopoViewModel @Inject constructor(private val horoscopeProvider: HoroscopeProvider) :
    ViewModel() {
    private var _horocope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horocope

    init {
        _horocope.value = horoscopeProvider.getHoroscopes()
    }
}