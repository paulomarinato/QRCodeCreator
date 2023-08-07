package com.marinato.qrcodecreator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marinato.qrcodecreator.ui.theme.QRCodeCreatorTheme

@Composable
fun QRCodeApp(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        
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
