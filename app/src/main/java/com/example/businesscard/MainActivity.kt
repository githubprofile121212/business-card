package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
//import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
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
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF073042)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = "Android Logo",
                modifier = Modifier
                    .height(120.dp)
                    .width(150.dp)
            )
            Text(text = "vamsi vemula", color = Color.White, fontSize = 32.sp)
            Text(text = "Android Developer", color = Color(0xFF3ddc84))
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val phone = painterResource(id = R.drawable.phone)
                Image(
                    painter = phone,
                    contentDescription = null,
                    modifier = Modifier.size(34.dp).padding(8.dp)
                )
                Text(
                    text = "+1 123 456 789",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val share = painterResource(id = R.drawable.share)
                Image(
                    painter = share,
                    contentDescription = null,
                    modifier = Modifier.size(34.dp).padding(8.dp)
                )
                Text(
                    text = "@AndroidDev",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val email = painterResource(id = R.drawable.email)
                Image(
                    painter = email,
                    contentDescription = null,
                    modifier = Modifier.size(34.dp).padding(8.dp)
                )
                Text(
                    text = "vamsi.vemula30@gmail.com",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}