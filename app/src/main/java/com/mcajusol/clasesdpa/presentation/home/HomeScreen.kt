package com.mcajusol.clasesdpa.presentation.home

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){


    Column(

        modifier = Modifier.fillMaxSize()
    ){

        Text(text = "Bienvenido a la clase DPA",style = MaterialTheme.typography.titleLarge)

    }
}