package features.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import moe.tlaster.precompose.navigation.Navigator
import utils.ScreenRoutes
import utils.backgroundColor


@Composable
fun SplashScreen(
    navigator: Navigator
) {

    LaunchedEffect(Unit) {
        delay(2000)
        navigator.navigate(ScreenRoutes.Start.Onboarding.route)
    }

    Box(
        modifier = Modifier.background(backgroundColor).fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            "OXY BOOTS", style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
    }

}