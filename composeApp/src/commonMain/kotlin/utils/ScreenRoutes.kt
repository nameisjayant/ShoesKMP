package utils

sealed class ScreenRoutes(val route: String) {

    data object Start : ScreenRoutes("start") {
        data object Splash : ScreenRoutes("/splash")
        data object Onboarding : ScreenRoutes("/onboarding")
    }

    data object Register : ScreenRoutes("register") {
        data object Login : ScreenRoutes("/login")
        data object SignUp : ScreenRoutes("/signup")
        data object ForgetPassword : ScreenRoutes("/forgetPassword")
    }

    data object BottomBar : ScreenRoutes("/bottombar")
}
