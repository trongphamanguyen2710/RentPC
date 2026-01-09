package com.example.rentpc.ui.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.rentpc.R

@Composable
fun listPC(){
    Dialog(onDismissRequest = {}) {
        Card(
            shape = RoundedCornerShape(28.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Thuê PC",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 1.dp,
                    color = Color.Black
                )
                LazyColumn(
                    modifier = Modifier.weight(1f)
                ) {
                    item(){
                        Card(
                            onClick = {},
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(12.dp),
                            shape = RoundedCornerShape(
                                topStart = 28.dp,
                                topEnd = 28.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp
                            ),
                        ){
                            Column(){
                                Image(
                                    painter = painterResource(R.drawable.logo),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(28.dp)
                                )
                                Divider(
                                    modifier = Modifier.fillMaxWidth(),
                                    thickness = 1.dp
                                )
                                Text("DUAL 2686V4 RAM 128GB GTX 1080TI")
                                Text(". DUAL 2686V4")
                                Text(". RAM 128GB")
                                Text(". GTX 1080TI")
                            }
                        }
                    }
                }
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 1.dp,
                    color = Color.Black
                )

                Button (onClick = {}) {
                    Text("Tiếp tục")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewlistPC(){
    listPC()
}