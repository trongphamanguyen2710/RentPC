package com.example.rentpc.ui.HomeScreen

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rentpc.R
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun CardPC(){
    var isSelected by remember { mutableStateOf(false) }

    val animatedColor by animateColorAsState(
        targetValue =
            if (isSelected)
                Color.Cyan.copy(alpha = 0.2f)
            else
                Color.Gray.copy(alpha = 0.5f),
        label = "cardColor"
    )

    Card(
        modifier = Modifier
            .height(400.dp)
            .fillMaxWidth()
            .clickable {
                isSelected = !isSelected
            },
        colors = CardDefaults.cardColors(
            containerColor = animatedColor
        ),
        shape = RoundedCornerShape(dimensionResource(R.dimen.spacing_large)),
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.spacing_large)
                )
        ){
            Image(
                painter = painterResource(R.drawable.pc),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
                    .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.spacing_medium))),
                contentScale = ContentScale.FillBounds,
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = dimensionResource(R.dimen.spacing_large),
                        top = dimensionResource(R.dimen.spacing_large),
                        end = dimensionResource(R.dimen.spacing_large)
                    ),
                horizontalAlignment = Alignment.End,
            ){
                Spacer(Modifier.height(75.dp))

                Text(
                    text = "2 x 2696v3",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )

                Spacer(Modifier.height(18.dp))

                Text(
                    text = "128gb",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )

                Spacer(Modifier.height(18.dp))

                Text(
                    text = "512gb",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    text = "1070Ti",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "70.000",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )
                Spacer(Modifier.height(14.dp))

                Text(
                    text = "500.000",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )
                Spacer(Modifier.height(12.dp))

                Text(
                    text = "1.850.000",
                    style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                )
            }
        }
        Button(onClick = {}){
            Text("Thuê máy")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardPC(){
    CardPC()
}