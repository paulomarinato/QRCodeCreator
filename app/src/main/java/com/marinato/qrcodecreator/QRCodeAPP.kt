package com.marinato.qrcodecreator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.marinato.qrcodecreator.ui.theme.QRCodeCreatorTheme

@Composable
fun QRCodeApp(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Gerador de QRCode",
        textAlign = TextAlign.Center)

        Icon(painter = painterResource(id = R.drawable.baseline_qr_code_scanner_24),
            contentDescription = "" )
        
    }
}

@Preview(showBackground = true)
@Composable
fun QRCodeAppPreview(){
    QRCodeCreatorTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            QRCodeApp()
        }
    }
}
