package com.styla.app.ui.navigation

sealed class StylaDestinations(val route: String) {
    data object Map : StylaDestinations("map")
    data object Explore : StylaDestinations("explore")
    data object Favorites : StylaDestinations("favorites")
    data object Profile : StylaDestinations("profile")

    data object StoreDetail : StylaDestinations("store_detail/{storeId}") {
        fun createRoute(storeId: String) = "store_detail/$storeId"
        const val ARG_STORE_ID = "storeId"
    }
}