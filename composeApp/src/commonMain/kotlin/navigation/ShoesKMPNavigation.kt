package navigation

import androidx.compose.runtime.Composable
import features.register.ForgetPasswordScreen
import features.register.LoginScreen
import features.register.SignUpScreen
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
                OnBoardingScreen(navigator)
            }
        }

        group(
            route = ScreenRoutes.Register.route,
            initialRoute = ScreenRoutes.Register.Login.route
        ) {
            scene(ScreenRoutes.Register.Login.route) {
                LoginScreen(navigator)
            }
            scene(ScreenRoutes.Register.SignUp.route) {
                SignUpScreen(navigator)
            }
            scene(ScreenRoutes.Register.ForgetPassword.route) {
                ForgetPasswordScreen(navigator)
            }
        }
    }

}
