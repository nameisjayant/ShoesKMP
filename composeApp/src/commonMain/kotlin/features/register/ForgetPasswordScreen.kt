package features.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import components.AppButtonComponent
import components.AppTextFieldComponent
import components.HeaderComponent
import features.components.TitleSubTitleComponent
import moe.tlaster.precompose.navigation.Navigator
import utils.backgroundColor


@Composable
fun ForgetPasswordScreen(
    navigator: Navigator
) {
    var email by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.background(backgroundColor).fillMaxSize()
    ) {
        Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
        Column(
            modifier = Modifier.padding(horizontal = 20.dp).verticalScroll(scrollState)
        ) {
            HeaderComponent(onBack = {
                navigator.goBack()
            })
            Spacer(modifier = Modifier.height(32.dp))
            TitleSubTitleComponent(
                title = "Recovery Password",
                subTitle = "Please Enter Your Email Address To\nReceive a Verification Code"
            )
            Spacer(modifier = Modifier.height(50.dp))
            AppTextFieldComponent(
                text = email,
                placeholder = "Enter Email",
                label = "Email Address",
                onPasswordValueUpdate = {},
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Email
                )
            ) {
                email = it
            }
            Spacer(modifier = Modifier.height(30.dp))
            AppButtonComponent(title = "Continue", modifier = Modifier.fillMaxWidth()) {}
            Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.navigationBars))
        }
    }


}