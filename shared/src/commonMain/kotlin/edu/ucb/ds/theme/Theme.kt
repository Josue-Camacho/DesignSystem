package edu.ucb.ds.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class DesignSystemColors(
    val primary: Color,
    val secondary: Color,
    val background: Color,
    val error: Color
)

data class DesignSystemTypography(
    val heading: TextStyle,
    val body: TextStyle,
    val label: TextStyle
)

data class DesignSystemSpacing(
    val small: Dp,
    val medium: Dp,
    val large: Dp
)

object MyProjectTheme {

    val colors = DesignSystemColors(
        primary = Primary,
        secondary = Secondary,
        background = Background,
        error = Error
    )

    val typography = DesignSystemTypography(
        heading = Heading,
        body = Body,
        label = Label
    )

    val spacing = DesignSystemSpacing(
        small = 4.dp,
        medium = 8.dp,
        large = 16.dp
    )

    @Composable
    operator fun invoke(
        content: @Composable () -> Unit
    ) {
        MaterialTheme(
            colorScheme = lightColorScheme(
                primary = colors.primary,
                secondary = colors.secondary,
                background = colors.background,
                error = colors.error
            ),
            typography = Typography(
                headlineMedium = typography.heading,
                bodyMedium = typography.body,
                labelMedium = typography.label
            ),
            content = content
        )
    }
}