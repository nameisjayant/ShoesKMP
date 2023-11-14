package features.main.bottombar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import utils.BottomBarRoutes
import utils.lightBlueColor
import utils.lightSubTextColor


@Composable
fun BottomBarRow(
    navigator: Navigator
) {

    val tabList = listOf(
        BottomBarRoutes.HOME,
        BottomBarRoutes.WISHLIST,
        BottomBarRoutes.Shop,
        BottomBarRoutes.NOTIFICATION,
        BottomBarRoutes.Profile
    )


    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        tabList.forEach { tab ->
            BottomBarItems(
                tab = tab,
                navigator
            )
        }
    }

}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BottomBarItems(
    tab: BottomBarRoutes,
    navigator: Navigator
) {


    val contentColor =
        if (tab.routes == navigator.currentEntry.collectAsState(null).value?.route?.route) lightBlueColor else lightSubTextColor

    IconButton(onClick = {
        navigator.navigate(tab.routes)
    }) {
        Icon(
            painter = painterResource(tab.icon),
            contentDescription = "",
            tint = contentColor,
            modifier = Modifier.size(24.dp)
        )
    }
}
