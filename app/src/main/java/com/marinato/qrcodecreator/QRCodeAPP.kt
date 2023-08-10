package com.marinato.qrcodecreator

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marinato.qrcodecreator.ui.theme.PurpleGrey80
import com.marinato.qrcodecreator.ui.theme.QRCodeCreatorTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun QRCodeApp() {

    var textValue by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        Text(
            "Gerador de QRCode",
            textAlign = TextAlign.Center
        )

        Icon(
            painter = painterResource(id = R.drawable.baseline_qr_code_scanner_24),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )

        TextField(
            value = textValue,
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = PurpleGrey80,
                    shape = RoundedCornerShape(10.dp)
                )
                .fillMaxWidth(),
            placeholder = {
                Text(
                    text = "Inforome o texto",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            shape = RoundedCornerShape(10.dp),
            color = TextFieldDefaults.textFieldColors(
                containerColor = Color.White
            ),
            onValueChange = {
                textValue = it
            })

        Spacer(Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text("teste")

        }
    }
}

@Composable
fun RoundedButton(
    onClick: () -> Unit,
    enabled: Boolean,
    text: String,
    color: Color,
    ) {
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.Blue
        )

    ) {
        Text(test, modifier = Modifier.padding(vertical = 6dp))

    }
}


@Preview(showBackground = true)
@Composable
fun QRCodeAppPreview() {
    QRCodeCreatorTheme(dynamicColor = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            QRCodeApp()
        }
    }
}
