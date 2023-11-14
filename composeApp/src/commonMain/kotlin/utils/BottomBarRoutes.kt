package utils


enum class BottomBarRoutes(
    val id: Int,
    val title: String,
    val routes: String,
    val icon: String
) {

    HOME(1, "Home", "/home", "home.png"),
    WISHLIST(2, "Wishlist", "/wishlist", "wishlist.png"),
    Shop(3, "Shop", "/shop", "shop.png"),
    NOTIFICATION(
        4,
        "Notification", "/notification", "notification.png"
    ),
    Profile(5, "Profile", "/profile", "profile.png")

}