package navigation

import androidx.compose.runtime.Composable
import features.start.OnBoardingScreen
import features.start.SplashScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import utils.ScreenRoutes


@Composable
fun ShoesKMPNavigation(
    navigator: Navigator
) {

    NavHost(
        navigator = navigator,
        initialRoute = ScreenRoutes.Start.route
    ) {

        group(
            route = ScreenRoutes.Start.route,
            initialRoute = ScreenRoutes.Start.Splash.route
        ) {
            scene(ScreenRoutes.Start.Splash.route) {
                SplashScreen(navigator)
            }
            scene(ScreenRoutes.Start.Onboarding.route) {
                OnBoardingScreen()
            }
        }
    }

}
