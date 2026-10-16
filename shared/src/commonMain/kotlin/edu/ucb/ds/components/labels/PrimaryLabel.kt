package edu.ucb.ds.components.labels

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.ucb.ds.theme.MyProjectTheme

@Composable
fun PrimaryLabel(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = MyProjectTheme.typography.label,
        color = MyProjectTheme.colors.primary
    )
}