package com.example.estherhappybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.estherhappybirthday.ui.theme.EstherHappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstherHappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithText(message = "Happy Birthday Esther!", from ="- from your love")
                }

            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String,  modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Surface(color= Color.Red) {
        EstherHappyBirthdayTheme {
            BirthdayGreetingWithText(message = "Happy Birthday Esther!", from = "- from your love")
        }
    }
}