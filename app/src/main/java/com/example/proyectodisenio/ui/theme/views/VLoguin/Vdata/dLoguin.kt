package com.example.proyectodisenio.ui.theme.views.VLoguin.Vdata

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.proyectodisenio.R

data class dLoguin (
    @DrawableRes val imageResourceId: Int,
    @StringRes val parrafo: Int
)
val regis = listOf(
    dLoguin(R.drawable.ic_google, R.string.google),
    dLoguin(R.drawable.ic_facebook, R.string.facebook)
)

