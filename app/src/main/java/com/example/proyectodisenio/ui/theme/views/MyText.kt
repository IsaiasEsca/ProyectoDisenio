package com.example.proyectodisenio.ui.theme.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectodisenio.R

@Composable
fun MyText(modifier: Modifier = Modifier){
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Blue)) {
        Text(text = stringResource(R.string.nombre), style = TextStyle(fontFamily = FontFamily.Cursive))
    }
}


@Composable
fun MyIcon(){
    Icon(imageVector = Icons.Rounded.Add, contentDescription = "Agregar", tint = Color.Blue)
}

@Preview
@Composable
fun MyPogress(){
    Column(Modifier.padding(24.dp).fillMaxSize(), verticalArrangement = Arrangement.Center) {
        CircularProgressIndicator()
        LinearProgressIndicator(modifier = Modifier.padding(top = 16.dp))
    }
}