package com.becker.bottomnavigationcomposeneconaz.screens

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigation(
    navController: NavController
) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )

    NavigationBar(                                                                                  //  not as on lesson. it's material3 analog
        modifier = Modifier.background(Color.White)                                                 //  not as on lesson. it's material3 analog
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        listItems.forEach { item ->
            NavigationBarItem(                                                                      //  not as on lesson. it's material3 analog
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "Icon"
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 12.sp
                    )
                },
                colors = NavigationBarItemDefaults                                                  // not as on lesson. it's material3 analog
                    .colors(
                        unselectedIconColor = Color.Gray,
                        selectedIconColor = Color.Red,
                        unselectedTextColor = Color.Gray
                    )
            )
        }
    }
}