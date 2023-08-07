package com.marinato.qrcodecreator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marinato.qrcodecreator.ui.theme.QRCodeCreatorTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun QRCodeApp() {

    var textValue by remember { mutableStateOf(TextFieldValue("")) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Gerador de QRCode",
            textAlign = TextAlign.Center
        )

        Icon(
            painter = painterResource(id = R.drawable.baseline_qr_code_scanner_24),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )

        TextField(value = textValue, onValueChange = {
            textValue = it
        })

    }
}

@Preview(showBackground = true)
@Composable
fun QRCodeAppPreview() {
    QRCodeCreatorTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            QRCodeApp()
        }
    }
}
