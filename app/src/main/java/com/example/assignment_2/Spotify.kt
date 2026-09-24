package com.example.assignment_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.stylusHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.min

@Composable
fun spotifyView(){
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfffdfbd4))
    ){
        Column (
            modifier = Modifier
                .padding(top = 40.dp, start = 40.dp, end = 40.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically){
                Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.Start){
                    Icon(
                        modifier = Modifier.size(25.dp),
                        painter = painterResource(id = R.drawable.arrow_down_96),
                        contentDescription = "Dropdown Arrow"
                    )
                }
                Column(modifier = Modifier.weight(2f), horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = "Liked Songs",
                        fontWeight = FontWeight.Bold,
                        fontSize = 23.sp)
                }
                Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End){
                    Icon(
                        modifier = Modifier.size(25.dp),
                        painter = painterResource(id = R.drawable.ellipsis_90),
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
                        painter = painterResource(id = R.drawable.heart_96),
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
                        painter = painterResource(id = R.drawable.back_96),
                        contentDescription = "Previous button",
                        modifier = Modifier.size(60.dp)
                    )
                }

                Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.pause_button_96),
                        contentDescription = "Play button",
                        modifier = Modifier.size(60.dp)
                    )
                }

                Column(modifier = Modifier.weight(2f), horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.forward_96),
                        contentDescription = "Next button",
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp) // Menyesuaikan lebar (width) dengan konten atas
                .fillMaxWidth()
                .weight(1f) // Mengisi seluruh sisa ruang ke bawah layar
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)) // Hanya sudut atas yang melengkung
                .background(Color(0xff7d7c68))
                .padding(24.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier =
                        Modifier
                            .fillMaxWidth(),
                    text = "Lyrics by Youtube",
                    color = Color(0xffd9d9d9),
                    textAlign = TextAlign.Left
                )

                Text(
                    text = "Baby, love never felt so good\n" +
                            "And I'd doubt if it ever could\n" +
                            "Not like you hold me, hold me\n" +
                            "Oh baby, love never felt so fine\n" +
                            "And I'd doubt if it's never mine\n" +
                            "Not like you hold me, hold me\n" +
                            "And the night is gonna be just fine\n" +
                            "Gotta fly, gotta see\n" +
                            "I can't wait, I can't take it\n" +
                            "'Cause baby, every time I love you\n" +
                            "In and out of my life, in and out baby\n" +
                            "Tell me, if you really love me\n" +
                            "It's in and out of my life, in and out baby\n" +
                            "So baby, yes, love never felt so good\n" +
                            "Baby (mm-mm), love never felt so fine (so fine)\n" +
                            "And I'd doubt if it's ever mine\n" +
                            "Not like you hold me, hold me\n" +
                            "Oh baby, love never felt so good\n" +
                            "And I'd doubt if it ever could\n" +
                            "Not like you hold me, hold me\n" +
                            "And the night is gonna be just fine\n" +
                            "Gotta fly, gotta see, can't believe\n" +
                            "I can't take it\n" +
                            "'Cause baby, every time I love you\n" +
                            "It's in and out of my life, in and out baby\n" +
                            "Tell me, if you really love me\n" +
                            "It's in and out of my life, driving me crazy\n" +
                            "Baby, love never felt so good\n" +
                            "Baby, love never felt so fine\n" +
                            "And I'd doubt if it was mine, all mine\n" +
                            "Not like you hold me, hold me\n" +
                            "Oh baby, love never felt so good, so good\n" +
                            "And I'd doubt if it ever could\n" +
                            "Not like you hold me, hold me\n" +
                            "And the night is gonna be just fine\n" +
                            "Gotta fly, gotta see\n" +
                            "Can't believe\n" +
                            "I can't take it\n" +
                            "'Cause baby, every time I love you\n" +
                            "It's in and out of my life, in and out, baby\n" +
                            "Tell me if you really love me\n" +
                            "It's in and out of my life, driving me crazy\n" +
                            "'Cause baby, love never felt so good (so good)\n" +
                            "Oh, it never felt so good\n" +
                            "Never felt so good\n" +
                            "Don't you know, it never felt so good\n" +
                            "Never felt so good (yeah, yeah)\n" +
                            "Alright, that's fine\n" +
                            "That's it",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 35.sp,
                    textAlign = TextAlign.Left
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun spotifyPreview(){
    spotifyView()
}
