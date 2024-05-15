package com.becker.bottomnavigationcomposeneconaz.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = SCREEN_ROUTE_1
    ) {

        composable(SCREEN_ROUTE_1) {
            Screen1()
        }
        composable(SCREEN_ROUTE_2) {
            Screen2()
        }
        composable(SCREEN_ROUTE_3) {
            Screen3()
        }
        composable(SCREEN_ROUTE_4) {
            Screen4()
        }
    }
}