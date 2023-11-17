package navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import features.main.screens.HomeScreen
import features.main.screens.NotificationScreen
import features.main.screens.ProfileScreen
import features.main.screens.ShopScreen
import features.main.screens.WishListScreen
import features.register.screens.ForgetPasswordScreen
import features.register.screens.LoginScreen
import features.register.screens.SignUpScreen
import features.start.screens.OnBoardingScreen
import features.start.screens.SplashScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import utils.BottomBarRoutes
import utils.ScreenRoutes
import utils.backgroundColor


@Composable
fun ShoesKMPNavigation(
    navigator: Navigator,
    innerPadding: PaddingValues
) {

    NavHost(
        navigator = navigator,
        initialRoute = ScreenRoutes.Start.route,
        modifier = Modifier.background(backgroundColor)
            .fillMaxSize()
            .padding(innerPadding)
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
        group(
            route = ScreenRoutes.BottomBar.route,
            initialRoute = BottomBarRoutes.HOME.routes
        ) {
            scene(BottomBarRoutes.HOME.routes) {
                HomeScreen()
            }
            scene(BottomBarRoutes.WISHLIST.routes) {
                WishListScreen()
            }
            scene(BottomBarRoutes.Shop.routes) {
                ShopScreen()
            }
            scene(BottomBarRoutes.NOTIFICATION.routes) {
                NotificationScreen()
            }
            scene(BottomBarRoutes.Profile.routes) {
                ProfileScreen()
            }
        }
    }

}
