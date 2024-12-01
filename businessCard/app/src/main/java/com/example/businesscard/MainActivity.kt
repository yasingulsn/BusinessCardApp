package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    GreetingImage(
                        modifier = Modifier.fillMaxSize()
                    )

                    GreetingText(
                        message = "Yasin Gülşen",
                        gmail = "yasingulsen28m@gmail.com",
                        number = 5352944741,
                        socialMedia = "@yasingulsn",
                        subtitle = "Java Developer",
                        modifier = Modifier.padding(40.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(
    message: String,
    subtitle: String,
    gmail: String,
    socialMedia: String,
    number: Long,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 25.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dell),
                contentDescription = "profil",
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = message,
                fontSize = 50.sp,
                lineHeight = 70.sp,
                color= Color.White,
                textAlign = TextAlign.Center,

            )
            Text(
                text = subtitle,
                fontSize = 24.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.gmail12),
                    contentDescription = "Email Icon",
                    modifier = Modifier.size(30.dp),
                )
                Text(
                    text = gmail,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 8.dp),
                       color=Color.White
                )
            }


            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.instablack),
                    contentDescription = "Social Media Icon",
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = socialMedia,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 8.dp),
                    color=Color.White                )
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = number.toString(),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 8.dp),
                            color=Color.White                )
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.kotlin_1)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    )
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            GreetingImage(modifier = Modifier.fillMaxSize())
            GreetingText(
                message = "Yasin Gülşen",
                number = 5352944741,
                socialMedia = "@yasingulsn",
                gmail = "yasingulsen28m@gmail.com",
                subtitle = "Java Developer",
                modifier = Modifier.padding(40.dp)
            )
        }
    }
}