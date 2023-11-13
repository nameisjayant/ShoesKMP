package components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import utils.lightSubTextColor
import utils.lightTextColor


@OptIn(ExperimentalResourceApi::class)
@Composable
fun AppTextFieldComponent(
    modifier: Modifier = Modifier,
    text: String,
    label: String,
    placeholder: String,
    isVisible: Boolean = false,
    isShowPassword: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    onPasswordValueUpdate: (Boolean) -> Unit,
    onValueChange: (String) -> Unit
) {
    Column {
        Text(
            label, style = TextStyle(
                fontSize = 16.sp, fontWeight = FontWeight.W500, color = lightTextColor
            )
        )
        Spacer(modifier = Modifier.height(12.dp))
        TextField(
            value = text,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            ),
            shape = CircleShape,
            modifier = modifier.height(50.dp).fillMaxWidth(),
            placeholder = {
                Text(
                    placeholder, style = TextStyle(
                        fontSize = 12.sp, fontWeight = FontWeight.W400, color = lightSubTextColor
                    )
                )
            },
            textStyle = TextStyle(
                color = lightTextColor, fontSize = 14.sp, fontWeight = FontWeight.W400
            ),
            visualTransformation = if (isVisible && isShowPassword)
                PasswordVisualTransformation() else
                VisualTransformation.None,
            trailingIcon = {
                if (!isVisible) {
                } else if (!isShowPassword) {
                    IconButton(onClick = { onPasswordValueUpdate(!isShowPassword) }) {
                        Icon(painter = painterResource("eye_open.png"), contentDescription = null)
                    }
                } else {
                    IconButton(onClick = { onPasswordValueUpdate(!isShowPassword) }) {
                        Icon(painter = painterResource("eye_close.png"), contentDescription = null)
                    }
                }
            },
            keyboardOptions = keyboardOptions,
            maxLines = 1,
            singleLine = true
        )
    }
}