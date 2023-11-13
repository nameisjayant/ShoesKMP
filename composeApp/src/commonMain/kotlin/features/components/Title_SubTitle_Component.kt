package features.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import utils.lightSubTextColor
import utils.lightTextColor


@Composable
fun TitleSubTitleComponent(
    modifier: Modifier = Modifier,
    title: String,
    subTitle: String
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            title, style = TextStyle(
                color = lightTextColor,
                fontSize = 28.sp,
                fontWeight = FontWeight.W500
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            subTitle, style = TextStyle(
                color = lightSubTextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.W400
            ),
            textAlign = TextAlign.Center
        )
    }
}