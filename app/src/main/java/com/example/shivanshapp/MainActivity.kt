package com.example.shivanshapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shivanshapp.ui.theme.ShivanshAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShivanshAppTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.White),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.baseline_smart_toy_24)
        Image(
            painter = image,
            contentDescription = "Logo",
        modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(
            text = "Shivansh Prasad",
            color = Color.Black,
            fontSize = 43.sp
        )
        Text(
            text = "Android Developer",
            fontSize = 30.sp,
            color = Color(0xFF33ff33)
        )
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp)
        ) {
            val phone = painterResource(id = R.drawable.baseline_phone_iphone_24)
            Image(painter = phone, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "9589551822",
                color = Color(0xFF33ff33),
                modifier = Modifier.padding(8.dp)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp)
        ) {
            val share = painterResource(id = R.drawable.baseline_ios_share_24)
            Image(painter = share, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "@AndroidDeveloper",
                color = Color(0xFF33ff33),
                modifier = Modifier.padding(8.dp)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp)
        ) {
            val email = painterResource(id = R.drawable.baseline_mail_outline_24)
            Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "prasadshivansh66@gmail.com",
                color = Color(0xFF33ff33),
                modifier = Modifier.padding(8.dp)
            )

        }
    }
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun BusineesCardAppPreview() {
    ShivanshAppTheme {
        BusinessCard()
    }
}