package com.example.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modifier.ui.theme.ModifierTheme

@Composable
fun TaskOne(
    name: String,
    modifier: Modifier = Modifier,
    boxModifier: Modifier = Modifier
) {
    Box(
        modifier = boxModifier
            .background(Color.White)
            .padding(bottom = 50.dp)
            .fillMaxSize(),
    ) {
        val defaultModifier: Modifier = Modifier
            .align(Alignment.BottomCenter)
            .border(3.dp, Color.Red)
            .padding(20.dp)
        Text(
            text = "Привет $name!",
            fontSize = 24.sp,
            modifier = modifier.then(defaultModifier)
        )
    }
}
@Preview(showSystemUi = true)
@Composable
fun OnePreview() {
    ModifierTheme {
        TaskOne("Android")
    }
}