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
import features.components.BottomContent
import features.components.TitleSubTitleComponent
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import utils.ScreenRoutes
import utils.backgroundColor


@Composable
fun SignUpScreen(
    navigator: Navigator
) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordShow by remember { mutableStateOf(true) }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.background(backgroundColor).fillMaxSize()
    ) {
        Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f).verticalScroll(scrollState)
            ) {
                HeaderComponent(onBack = {
                    navigator.goBack()
                })
                Spacer(modifier = Modifier.height(32.dp))
                TitleSubTitleComponent(
                    title = "Create Account", subTitle = "Let’s Create Account Together"
                )

                Spacer(modifier = Modifier.height(50.dp))
                AppTextFieldComponent(
                    text = name,
                    label = "Your Name",
                    placeholder = "Enter Name",
                    onPasswordValueUpdate = {},
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Text
                    )
                ) {
                    name = it
                }
                Spacer(modifier = Modifier.height(30.dp))
                AppTextFieldComponent(
                    text = email,
                    placeholder = "Enter Email",
                    label = "Email Address",
                    onPasswordValueUpdate = {},
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    )
                ) {
                    email = it
                }
                Spacer(modifier = Modifier.height(30.dp))
                AppTextFieldComponent(
                    text = password,
                    placeholder = "Enter Password",
                    label = "Password",
                    isVisible = true,
                    isShowPassword = isPasswordShow,
                    onPasswordValueUpdate = {
                        isPasswordShow = it
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                ) {
                    password = it
                }

                Spacer(modifier = Modifier.height(30.dp))
                AppButtonComponent(title = "Create", modifier = Modifier.fillMaxWidth()) {}
            }
            BottomContent(
                text1 = "Already have an account?",
                text2 = "Sign In",
                modifier = Modifier.padding(vertical = 30.dp)
            ) {
                navigator.navigate(
                    ScreenRoutes.Register.Login.route, options = NavOptions(
                        popUpTo = PopUpTo(ScreenRoutes.Register.Login.route, true)
                    )
                )
            }
            Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.navigationBars))
        }
    }

}