import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import di.koinModule
import features.main.bottombar.BottomBarRow
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.ShoesKMPNavigation
import org.koin.compose.KoinApplication
import utils.BottomBarRoutes

@Composable
fun ShoesKMPApp() {
    MaterialTheme {
        KoinApplication(
            application = {
                modules(koinModule)
            }
        ) {
            val appState = rememberShoesKMPAppState()
            Scaffold(
                bottomBar = {
                    if (appState.shouldShowBottomBar)
                        BottomAppBar {
                            BottomBarRow(appState.navigator)
                        }
                }
            ) { innerPadding ->
                ShoesKMPNavigation(appState.navigator, innerPadding)
            }
        }
    }
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

    private val routes = BottomBarRoutes.values().map { it.routes }

    val shouldShowBottomBar: Boolean
        @Composable get() =
            navigator.currentEntry.collectAsState(null).value?.route?.route in routes
}


