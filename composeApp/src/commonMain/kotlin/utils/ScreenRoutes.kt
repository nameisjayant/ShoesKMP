package utils

sealed class ScreenRoutes(val route: String) {

    data object Start : ScreenRoutes("start") {
        data object Splash : ScreenRoutes("/splash")
        data object Onboarding : ScreenRoutes("/onboarding")
    }
}
