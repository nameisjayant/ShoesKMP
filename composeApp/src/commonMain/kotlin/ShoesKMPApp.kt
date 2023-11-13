import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import di.koinModule
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.ShoesKMPNavigation
import org.koin.compose.KoinApplication

@Composable
fun ShoesKMPApp() {
    MaterialTheme {
        KoinApplication(
            application = {
                modules(koinModule)
            }
        ) {
            val navigator = rememberNavigator()
            Scaffold {
                ShoesKMPNavigation(navigator)
            }
        }
    }
}