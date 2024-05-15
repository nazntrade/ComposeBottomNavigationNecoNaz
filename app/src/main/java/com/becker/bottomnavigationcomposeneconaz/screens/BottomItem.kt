package com.becker.bottomnavigationcomposeneconaz.screens

import com.becker.bottomnavigationcomposeneconaz.R

const val SCREEN_ROUTE_1 = "screen_1"
const val SCREEN_ROUTE_2 = "screen_2"
const val SCREEN_ROUTE_3 = "screen_3"
const val SCREEN_ROUTE_4 = "screen_4"

sealed class BottomItem(val title: String, val iconId: Int, val screenRoute: String) {
    data object Screen1 : BottomItem("Interests", R.drawable.icon, SCREEN_ROUTE_1)
    data object Screen2 : BottomItem("Cake", R.drawable.icon2, SCREEN_ROUTE_2)
    data object Screen3 : BottomItem("Work", R.drawable.icon3, SCREEN_ROUTE_3)
    data object Screen4 : BottomItem("Child", R.drawable.icon4, SCREEN_ROUTE_4)
}