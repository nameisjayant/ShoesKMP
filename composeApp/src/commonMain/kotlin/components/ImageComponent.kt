package components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalResourceApi::class)
@Composable
fun AppImageComponent(
    modifier: Modifier = Modifier,
    image: String
) {
    Image(
        painter = painterResource(image), contentDescription = "",
        modifier = modifier
    )
}