package features.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.AppButtonComponent
import components.AppImageComponent
import features.start.domain.model.OnboardingModel
import features.start.domain.model.onboardList
import utils.backgroundColor
import utils.lightBlue2Color
import utils.lightBlueColor
import utils.lightSubTextColor
import utils.lightTextColor


@Composable
fun OnBoardingScreen() {

    Box(
        modifier = Modifier.background(backgroundColor).fillMaxSize().padding(20.dp)
    ) {

        AppImageComponent(image = "bg_2.png", modifier = Modifier.align(Alignment.TopEnd))

        AppImageComponent(
            image = "bg_1.png", modifier = Modifier.padding(bottom = 200.dp).align(Alignment.Center)
        )

        Circle(
            modifier = Modifier.padding(top = 100.dp, start = 30.dp), color = lightBlue2Color
        )

        Circle(
            modifier = Modifier.align(Alignment.CenterStart).padding(top = 50.dp)
        )
        Circle(
            modifier = Modifier.align(Alignment.CenterEnd).padding(bottom = 50.dp)
        )

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            PagerContent(modifier = Modifier.weight(1f), data = onboardList[0])
            Row(
                modifier = Modifier.padding(vertical = 20.dp).fillMaxWidth()
            ) {
                Box(modifier = Modifier.weight(1f))
                AppButtonComponent(
                    title = "Get Started"
                ) {}
            }
        }

    }

}

@Composable
fun PagerContent(
    modifier: Modifier = Modifier, data: OnboardingModel
) {
    Column(
        modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box { }
        Box { }
        Column {
            AppImageComponent(
                image = data.image
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                data.title, style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W500,
                    color = lightTextColor,
                    lineHeight = 56.sp
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                data.description, style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W400,
                    color = lightSubTextColor,
                    lineHeight = 32.sp
                )
            )
        }
    }
}

@Composable
fun Circle(
    modifier: Modifier = Modifier, color: Color = lightBlueColor
) {
    Spacer(modifier = modifier.background(color, CircleShape).size(13.dp))
}
