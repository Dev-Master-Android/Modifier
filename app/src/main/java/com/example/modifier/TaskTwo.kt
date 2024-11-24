package com.example.modifier

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modifier.ui.theme.ModifierTheme

@Composable
fun TaskTwo(
    name: String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .wrapContentSize(align = Alignment.Center),

) {
    Text(
        text = "Привет $name!",
        fontSize = 24.sp,
        modifier = modifier
    )
}
@Preview(showSystemUi = true)
@Composable
fun Preview() {
    ModifierTheme {
        TaskTwo("Android")
    }
}