package com.example.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.components.NormalTextComponent

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.White)
            .padding(28.dp)
    ) {
        NormalTextComponent(value = stringResource(id = R.string.Hello))
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}