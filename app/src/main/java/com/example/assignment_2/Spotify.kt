package com.example.assignment_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.round

@Composable
fun spotifyView(){
    Column (modifier = Modifier.padding(40.dp)){
        Row(verticalAlignment = Alignment.CenterVertically){
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.Start){
                Icon(
                    painter = painterResource(id = R.drawable.round_keyboard_arrow_down_24),
                    contentDescription = "Dropdown Arrow"
                )
            }
            Column(modifier = Modifier.weight(2f), horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = "Liked Songs",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
            }
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End){
                Icon(
                    painter = painterResource(id = R.drawable.ellipsis),
                    contentDescription = "Ellipsis",
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.album),
            contentDescription = "Album Cover",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(verticalAlignment = Alignment.CenterVertically){
            Column(modifier = Modifier.weight(3f), horizontalAlignment = Alignment.Start) {
                Text(
                    "Love never felt so good",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    "Michael Jackson",
                    fontSize = 20.sp,
                )
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.weight(1f)){
                Icon(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "Like button",
                    Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        HorizontalDivider(
            modifier = Modifier.clip(RoundedCornerShape(15.dp)),
            thickness = 4.dp,
            color = Color.Black
        )

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 5.dp)){
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.Start){
                Text(
                    "0:10"
                )
            }
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End) {
                Text(
                    "-3:57"
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(2f), horizontalAlignment = Alignment.CenterHorizontally){
                Icon(
                    painter = painterResource(id = R.drawable.previous),
                    contentDescription = "Previous button",
                    modifier = Modifier.size(60.dp)
                )
            }

            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.play),
                    contentDescription = "Play button",
                    modifier = Modifier.size(60.dp)
                )
            }

            Column(modifier = Modifier.weight(2f), horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "Next button",
                    modifier = Modifier.size(60.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.Black)

        ){
            Row(){

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun spotifyPreview(){
    spotifyView()
}
