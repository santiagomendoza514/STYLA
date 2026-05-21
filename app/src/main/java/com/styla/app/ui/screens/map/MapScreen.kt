package com.styla.app.ui.screens.map

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.styla.app.data.repository.MockStoreRepository
import com.styla.app.ui.theme.Coral

// Coordenadas centrales de Bogotá (más o menos Zona T / Chapinero)
private val BOGOTA_CENTER = LatLng(4.6650, -74.0550)

@Composable
fun MapScreen(
    onStoreClick: (String) -> Unit
) {
    val stores = remember { MockStoreRepository.getAllStores() }

    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(BOGOTA_CENTER, 13f)
    }

    // Custom marker color: coral STYLA
    // BitmapDescriptorFactory usa HSV hue (0-360), no RGB. Calculamos el hue del coral.
    val coralHue = remember {
        val hsv = FloatArray(3)
        android.graphics.Color.colorToHSV(Coral.toArgb(), hsv)
        hsv[0]
    }

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState,
            properties = MapProperties(
                isMyLocationEnabled = false // lo activamos en la próxima sesión
            ),
            uiSettings = MapUiSettings(
                zoomControlsEnabled = false,
                mapToolbarEnabled = false,
                compassEnabled = true,
                myLocationButtonEnabled = false
            )
        ) {
            stores.forEach { store ->
                Marker(
                    state = MarkerState(position = store.location),
                    title = store.name,
                    snippet = store.tagline,
                    icon = BitmapDescriptorFactory.defaultMarker(coralHue),
                    onClick = {
                        onStoreClick(store.id)
                        true // consumimos el click
                    }
                )
            }
        }
    }
}