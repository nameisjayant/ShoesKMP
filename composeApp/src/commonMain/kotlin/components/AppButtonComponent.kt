package components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utils.lightBlueColor


@Composable
fun AppButtonComponent(
    modifier: Modifier = Modifier,
    title: String,
    backgroundColor: Color = lightBlueColor,
    contentColor: Color = Color.White,
    onClick: () -> Unit
) {

    Button(
        onClick = onClick,
        contentPadding = PaddingValues(
            horizontal = 32.dp,
            vertical = 16.dp
        ),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        modifier = modifier,
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Text(
            title, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.W500,
                fontStyle = FontStyle.Normal
            )
        )
    }

}