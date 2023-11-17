import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import di.koinModule
import features.main.bottombar.BottomBarRow
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.ShoesKMPNavigation
import org.koin.compose.KoinApplication
import utils.BottomBarRoutes
import utils.ScreenRoutes

@Composable
fun ShoesKMPApp() {
    MaterialTheme {
        KoinApplication(application = {
            modules(koinModule)
        }) {
            val appState = rememberShoesKMPAppState()
            Scaffold(bottomBar = {
                if (appState.shouldShowBottomBar)
                    BottomAppBar(
                        backgroundColor = Color.White,
                        elevation = 0.dp
                    ) {
                        BottomBarRow(appState.navigator)
                    }

            }) { innerPadding ->
                print("Current Navigation -> ${CurrentRoute(appState.navigator)}")
                ShoesKMPNavigation(appState.navigator, innerPadding)
            }
        }
    }
}

@Composable
fun CurrentRoute(navigator: Navigator): String {
    return navigator.currentEntry.collectAsState(null).value?.route?.route ?: "NO Route Found"
}

@Composable
fun rememberShoesKMPAppState(
    navigator: Navigator = rememberNavigator()
) = remember(navigator) {
    ShoesKMPAppState(navigator)
}

@Stable
class ShoesKMPAppState(
    val navigator: Navigator
) {
    val shouldShowBottomBar: Boolean
        @Composable get() = when (CurrentRoute(navigator)) {
            BottomBarRoutes.HOME.routes, BottomBarRoutes.Shop.routes, BottomBarRoutes.WISHLIST.routes, BottomBarRoutes.NOTIFICATION.routes, BottomBarRoutes.Profile.routes, ScreenRoutes.BottomBar.route -> true
            else -> false
        }
}


