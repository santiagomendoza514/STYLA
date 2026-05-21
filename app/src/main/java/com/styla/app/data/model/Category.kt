package com.styla.app.data.model

import androidx.compose.ui.graphics.Color
import com.styla.app.ui.theme.CategoryAccessories
import com.styla.app.ui.theme.CategoryDesigner
import com.styla.app.ui.theme.CategoryLuxury
import com.styla.app.ui.theme.CategoryStreetwear
import com.styla.app.ui.theme.CategoryVintage

enum class Category(
    val displayName: String,
    val color: Color,
    val emoji: String
) {
    STREETWEAR("Streetwear", CategoryStreetwear, "🔥"),
    LUXURY("Luxury", CategoryLuxury, "✨"),
    VINTAGE("Vintage", CategoryVintage, "🕰️"),
    DESIGNER("Designer", CategoryDesigner, "👗"),
    ACCESSORIES("Accessories", CategoryAccessories, "💎")
}