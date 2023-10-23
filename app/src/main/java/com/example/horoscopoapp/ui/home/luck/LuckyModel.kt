package com.example.horoscopoapp.ui.home.luck

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel(
    @DrawableRes var image: Int,
    @StringRes var text: Int
)