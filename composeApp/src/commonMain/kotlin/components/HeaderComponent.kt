package components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HeaderComponent(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {},
    title: String = ""
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        IconWithBackgroundComponent(
            icon = "arrow_back.png",
            onClick = onBack
        )
    }
}