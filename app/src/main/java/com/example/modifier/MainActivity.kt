package com.example.modifier

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifier.ui.theme.LightBlue
import com.example.modifier.ui.theme.ModifierTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifierTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    val modifierCustomOne = Modifier
                        .border(3.dp, Color.Red)
                        .padding(20.dp)
                        .background(Color.Yellow)

                    val modifierCustomTwo = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .border(3.dp, Color.Green, shape = RoundedCornerShape(100))
                        .background(LightBlue, shape = RoundedCornerShape(100))
                        .wrapContentSize(align = Alignment.Center)
                        .padding()

                    /*TaskOne(
                       name = "Привет",
                       modifier = modifierCustomOne,
                   )*/

                    TaskTwo(
                        name = "Андроид",
                        modifier = modifierCustomTwo
                    )
                }
            }
        }
    }
}
