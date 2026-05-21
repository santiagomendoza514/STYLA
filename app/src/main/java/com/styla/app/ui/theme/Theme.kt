package com.styla.app.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color

private val StylaLightColors = lightColorScheme(
    primary = Coral,
    onPrimary = OffWhite,
    primaryContainer = CoralLight,
    onPrimaryContainer = CoralDark,

    secondary = Charcoal,
    onSecondary = OffWhite,
    secondaryContainer = SandBeige,
    onSecondaryContainer = Charcoal,

    tertiary = MidGray,
    onTertiary = OffWhite,

    background = OffWhite,
    onBackground = Charcoal,

    surface = OffWhite,
    onSurface = Charcoal,
    surfaceVariant = SandBeige,
    onSurfaceVariant = MidGray,

    outline = LightGray,
    outlineVariant = SandBeige,

    error = ErrorRed,
    onError = OffWhite
)

private val StylaDarkColors = darkColorScheme(
    primary = Coral,
    onPrimary = OffWhite,
    primaryContainer = CoralDark,
    onPrimaryContainer = CoralLight,

    secondary = SandBeige,
    onSecondary = Charcoal,

    background = Charcoal,
    onBackground = OffWhite,

    surface = Color(0xFF242424),
    onSurface = OffWhite,
    surfaceVariant = MidGray,
    onSurfaceVariant = SandBeige,

    outline = MidGray,

    error = ErrorRed,
    onError = OffWhite
)

@Composable
fun StylaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) StylaDarkColors else StylaLightColors

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = StylaTypography,
        content = content
    )
}