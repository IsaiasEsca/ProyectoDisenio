package com.example.proyectodisenio.ui.theme.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectodisenio.R

@Preview
@Composable
fun Layouts(){
   Column(Modifier.fillMaxSize()) {
      Box(
         Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Yellow), contentAlignment = Alignment.Center ){
            Text(text = "Hello")
      }
      Row(
         Modifier
            .fillMaxWidth()
            .weight(1f)
            ){
         Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.Magenta), contentAlignment = Alignment.Center){

            Text(text = "Estandar gg")
         }
         Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.DarkGray), contentAlignment = Alignment.Center){
            Text(text = "Hola Nuvo")
         }
      }
      Box(
         Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Blue), contentAlignment = Alignment.BottomCenter){
            Text(text = "Chcici")
      }
   }

}

@Composable
fun MySpacer(space: Int){
   Spacer(modifier = Modifier.height(space.dp))
}