package com.example.proyectodisenio.ui.theme.views.VLoguin

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectodisenio.R
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.proyectodisenio.ui.theme.views.VLoguin.Vdata.dLoguin
import com.example.proyectodisenio.ui.theme.views.VLoguin.Vdata.regis

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoguinApp(){
    Scaffold(topBar = { LayoutLoguin()}) {it -> LazyColumn(contentPadding = it){
        this.items(regis){
            BRegistros(dloguin = it)
        }
    }
  }
}

@Composable
fun LayoutLoguin(modifer: Modifier = Modifier){
    val mediumPadding = dimensionResource(R.dimen.padding_medium)
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
       // .padding(mediumPadding),
             ,   verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
            Image(painter = painterResource(id = R.drawable.logg), contentDescription = "")
       Text(text = stringResource(R.string.tittle),
           fontWeight = FontWeight.Bold,
           fontSize = 31.sp,
          modifier =  Modifier.padding(5.dp),
           style = TextStyle(fontFamily = FontFamily.Serif))
       Text(text = stringResource(R.string.sub_tittle), fontSize = 20.sp)

        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,) {
            CButt()
            BInicio()
        }

    }

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CButt(modifier: Modifier = Modifier){
    val mediumPadding = dimensionResource(R.dimen.padding_medium)
    var myText by remember { mutableStateOf("") }

        val userIcon = Icons.Default.Person
        val ConIcon = Icons.Default.Lock
Column(
    modifier = Modifier
        .fillMaxWidth()
        .padding(mediumPadding),
    verticalArrangement =  Arrangement.spacedBy(mediumPadding),
    horizontalAlignment = Alignment.CenterHorizontally

) {
    TextField(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        colors = TextFieldDefaults.textFieldColors(colorResource(id = R.color.white)),
        value = myText,
        onValueChange = { myText = it },
        label = { Text(text = "Correo") },
        leadingIcon = {
            Icon(
                imageVector = userIcon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)

            )
        }
    )
    TextField(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        colors = TextFieldDefaults.textFieldColors(colorResource(id = R.color.Green)),
        value = myText,
        onValueChange = { myText = it },
        label = { Text(text = "Contraseña") },
        leadingIcon = {
            Icon(
                imageVector = ConIcon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)

            )
        }
    )
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "¿Olvidaste tu Contraseña?")
    }
}
}
@Composable
fun BInicio(){
    val mediumPadding = dimensionResource(R.dimen.padding_medium)
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement =  Arrangement.spacedBy(mediumPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .clip(RoundedCornerShape(35.dp))
                .width(350.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.Green))

        ) {
            Text(text = stringResource(id = R.string.log_Inicio), fontSize = 30.sp)
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.instrucciones))
            
        }
    }
}

@Composable
fun BRegistros(modifier: Modifier = Modifier,
               dloguin: dLoguin
               ){
    Row {
        Button(onClick = { /*TODO*/ }, modifier = Modifier, colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)) ) {
            RedIcon(resIcon = dloguin.imageResourceId)
            RedInformation(redInformation = dloguin.parrafo)
        }


    }

}
@Composable
fun RedIcon(
    modifier: Modifier = Modifier,
    @DrawableRes resIcon: Int
){
    Image(
        modifier = modifier
            .size(60.dp)
            .padding(5.dp)
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
        painter = painterResource(resIcon)
        , contentDescription = null)
}
@Composable
fun RedInformation(modifier: Modifier = Modifier,
@StringRes redInformation: Int
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(redInformation),
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(top = 5.dp),
           color = Color.Black
        )

    }
}