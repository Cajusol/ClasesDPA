package com.mcajusol.clasesdpa.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mcajusol.clasesdpa.presentation.auth.LoginScreen
import com.mcajusol.clasesdpa.presentation.auth.RegisterScreen
import com.mcajusol.clasesdpa.presentation.home.HomeScreen

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "register")
    {
        composable(route = "register"){ RegisterScreen( navController) }
        composable(route = "login"){ LoginScreen(navController) }
        composable(route = "home"){ HomeScreen() }


    }
}