package edu.ucb.ds.components.surfaces

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.ucb.ds.theme.MyProjectTheme

@Composable
fun PrimarySurface(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        color = MyProjectTheme.colors.background
    ) {
        Box(
            modifier = Modifier.padding(
                MyProjectTheme.spacing.large
            )
        ) {
            content()
        }
    }
}