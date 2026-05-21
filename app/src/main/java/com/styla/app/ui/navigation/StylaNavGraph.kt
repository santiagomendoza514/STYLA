package com.styla.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.styla.app.ui.screens.detail.StoreDetailScreen
import com.styla.app.ui.screens.map.MapScreen

@Composable
fun StylaNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = StylaDestinations.Map.route
    ) {
        // Pantalla principal: el mapa
        composable(StylaDestinations.Map.route) {
            MapScreen(
                onStoreClick = { storeId ->
                    navController.navigate(StylaDestinations.StoreDetail.createRoute(storeId))
                }
            )
        }

        // Detalle de tienda — recibe el storeId como argumento
        composable(
            route = StylaDestinations.StoreDetail.route,
            arguments = listOf(
                navArgument(StylaDestinations.StoreDetail.ARG_STORE_ID) {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val storeId = backStackEntry.arguments
                ?.getString(StylaDestinations.StoreDetail.ARG_STORE_ID)
                ?: return@composable

            StoreDetailScreen(
                storeId = storeId,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}