package edu.ucb.ds.components.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.ucb.ds.theme.MyProjectTheme

@Composable
fun PrimaryCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MyProjectTheme.colors.background
        )
    ) {
        Column(
            modifier = Modifier.padding(
                PaddingValues(
                    horizontal = MyProjectTheme.spacing.large,
                    vertical = MyProjectTheme.spacing.medium
                )
            )
        ) {
            content()
        }
    }
}