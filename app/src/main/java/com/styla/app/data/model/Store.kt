package com.styla.app.data.model

import com.google.android.gms.maps.model.LatLng

data class Store(
    val id: String,
    val name: String,
    val category: Category,
    val description: String,
    val tagline: String,              // frase corta editorial estilo revista
    val address: String,
    val neighborhood: String,         // Zona T, Chapinero, Usaquén, etc.
    val latitude: Double,
    val longitude: Double,
    val phone: String? = null,
    val instagram: String? = null,
    val tiktok: String? = null,
    val website: String? = null,
    val openingHours: Map<DayOfWeek, String> = emptyMap(),
    val photos: List<String> = emptyList(),  // URLs o nombres de drawable
    val rating: Double,
    val priceRange: PriceRange = PriceRange.MID
) {
    // Helper para Maps Compose
    val location: LatLng get() = LatLng(latitude, longitude)
}

enum class DayOfWeek(val displayName: String) {
    MONDAY("Lun"), TUESDAY("Mar"), WEDNESDAY("Mié"),
    THURSDAY("Jue"), FRIDAY("Vie"), SATURDAY("Sáb"), SUNDAY("Dom")
}

enum class PriceRange(val symbol: String, val label: String) {
    BUDGET("$", "Económico"),
    MID("$$", "Medio"),
    PREMIUM("$$$", "Premium"),
    LUXURY("$$$$", "Lujo")
}