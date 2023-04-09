package com.example.estherhappybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estherhappybirthday.ui.theme.EstherHappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstherHappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage(getString(R.string.Happy_birthday_text), getString(R.string.signature_string))
                }

            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String,  modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = CenterHorizontally
    ){
        Text(
            text = message,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(top = 16.dp),
            color = Color.Magenta,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 16.dp, end = 16.dp)
                .align(alignment = CenterHorizontally),
            color = Color.Magenta,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic
                    )
    }
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.birthday)
    //Step 3 create a box to overlap image and texts
    Box (modifier = Modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = "painterResource(R.drawable.birthday",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
                   )
        BirthdayGreetingWithText(message = message, from = from)
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
        EstherHappyBirthdayTheme {
            BirthdayGreetingWithImage( stringResource(R.string.happy_birthday_text),
                stringResource(R.string.signature_text))
    }
}