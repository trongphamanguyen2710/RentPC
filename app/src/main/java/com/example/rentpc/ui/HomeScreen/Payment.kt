package com.example.rentpc.ui.HomeScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import com.example.rentpc.R

enum class PaymentMethod{
    BANK,
    WALLET,
    NONE
}

@Composable
fun PaymentScreen() {
    var expanded by remember{ mutableStateOf(false)}
    var text by remember { mutableStateOf("") }
    val titleColor = if (expanded) Color.Cyan.copy(0.5f) else Color.Black

    Scaffold(modifier = Modifier.fillMaxSize()){
        paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            )

        {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded },
                shape = RoundedCornerShape(4.dp),
                colors = CardDefaults.cardColors(Color.Gray.copy(alpha = 0.7f)),
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                    )
                {
                    Row {
                        Icon(
                            painter = painterResource(R.drawable.banking),
                            contentDescription = null,
                            tint = titleColor
                        )

                        Spacer(Modifier.width(4.dp))

                        Text(
                            text = "Nạp tiền qua tài khoản ngân hàng",
                            color = titleColor,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }

                    Icon(
                        painter =painterResource(
                            if (expanded) R.drawable.minus else R.drawable.add
                        ),
                        contentDescription = null
                    )

                }
                AnimatedVisibility(
                    visible = expanded,
                    enter = expandVertically() + fadeIn(),
                    exit = shrinkVertically() + fadeOut()
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Số tiền", style = MaterialTheme.typography.bodyLarge)

                            Spacer(Modifier.width(8.dp))

                            OutlinedTextField(
                                value = text,
                                onValueChange = { it ->
                                    text = it
                                },
                                shape = RoundedCornerShape(4.dp),
                                singleLine = true,
                                placeholder = {
                                    Text("Số tiền")
                                },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                            )
                        }

                        Divider(
                            thickness = 1.dp,
                            modifier = Modifier.padding(4.dp)
                        )

                        Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Cyan.copy(0.5f))){
                            Text("Nạp")
                        }
                    }
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewPaymentScreen(){
    PaymentScreen()
}