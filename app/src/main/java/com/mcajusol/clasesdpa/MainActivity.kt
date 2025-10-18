package com.mcajusol.clasesdpa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mcajusol.clasesdpa.presentation.auth.LoginScreen
import com.mcajusol.clasesdpa.presentation.auth.RegisterScreen
import com.mcajusol.clasesdpa.presentation.navigation.AppNavGraph
import com.mcajusol.clasesdpa.ui.theme.ClasesDPATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClasesDPATheme {
                // A surface container using the 'background' color from the theme
                AppNavGraph()

            }
        }
    }
}
