package features.register.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import utils.lightSubTextColor
import utils.lightTextColor


@Composable
fun BottomContent(
    modifier: Modifier = Modifier,
    text1: String,
    text2: String,
    onClick: (Boolean) -> Unit
) {
    Row(
        modifier = modifier
            .toggleable(
                value = false,
                onValueChange = onClick,
                role = Role.Button,
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text1, style = TextStyle(
                color = lightSubTextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.W400
            ),
        )
        Text(
            text2, style = TextStyle(
                color = lightTextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.W500
            )
        )
    }
}