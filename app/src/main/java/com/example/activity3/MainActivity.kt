package com.example.activity3

import android.location.Location
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity3.ui.theme.Activity3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "cuaca",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.padding(10.dp))

        BoxLayar()

        Spacer(modifier = Modifier.padding(10.dp))

        Loc()
    }
}

@Composable
fun BoxLayar(){
    Box(
        Modifier
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(color = Color.LightGray)){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.img), contentDescription = "cuaca",
                modifier = Modifier.fillMaxWidth().padding(20.dp))

            Text(text = "hujan", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(13.dp))
        }
    }

}

@Composable
fun Loc(){
    Text(text = "19 C", fontSize = 60.sp, fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HomeScreen()
}


