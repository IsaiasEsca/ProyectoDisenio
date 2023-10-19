package com.example.proyectodisenio.ui.theme.views.VLoguin

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp
import com.example.proyectodisenio.ui.theme.md_theme_dark_background
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

        Body(modifier = Modifier)


    }
}
@Composable
fun Body(modifier: Modifier){
    var myCorreo by rememberSaveable { mutableStateOf("") }
    var myContraseña by rememberSaveable { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,) {

        TextCorreo(modifier = Modifier, myCorreo = myCorreo, onTextChanged = {myCorreo = it})
            Spacer(modifier = Modifier.size(16.dp))
        TextContraseña(modifier = Modifier, myContraseña = myContraseña, onTextChanged = {myContraseña=it})
        Spacer(modifier = Modifier.size(16.dp))
        CButt()
        BInicio()
        Spacer(modifier = Modifier.size(16.dp))
        LoguinDivisor()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextCorreo(modifier: Modifier, myCorreo: String, onTextChanged: (String) -> Unit ){
    val mediumPadding = dimensionResource(R.dimen.padding_medium)
    val userIcon = Icons.Default.Person

    TextField(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp)
            .background(color = Color.Red),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Black,
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),

        value = myCorreo,
        onValueChange = { onTextChanged(it) },
        label = { Text(text = "Correo") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        leadingIcon = {
            Icon(
                imageVector = userIcon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)

            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextContraseña(modifier: Modifier, myContraseña: String, onTextChanged: (String) -> Unit ){
    val ConIcon = Icons.Default.Lock
    val mediumPadding = dimensionResource(R.dimen.padding_medium)
    TextField(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Black,
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        value = myContraseña,
        onValueChange = { onTextChanged(it) },
        label = { Text(text = "Contraseña") },
        leadingIcon = {
            Icon(
                imageVector = ConIcon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)

            )
        }
    )
}



@Composable
fun CButt(){
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "¿Olvidaste tu Contraseña?")
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
        OutlinedButton(onClick = { /*TODO*/ },
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 14.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)) ) {
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
@Composable
fun LoguinDivisor(){
    Row (Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
        Divider(
            Modifier
                .background(Color.Black)
                .weight(1f)
                .height(1.dp)
        )
            Text(text = "O",
                modifier = Modifier.padding(horizontal = 6.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue

            )
        Divider(
            Modifier
                .background(Color.Black)
                .weight(1f)
                .height(1.dp)
        )
    }
}