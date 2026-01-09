package com.example.rentpc.ui.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rentpc.R

@Composable
fun LoginScreen(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.spacing_large)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
        )
        OutlinedTextField(
            value = "Tên tài khoản",
            onValueChange = { },
            shape = RoundedCornerShape(12.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.user),
                    contentDescription = null,
                )
            },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = "Mật khẩu",
            onValueChange = { },
            shape = RoundedCornerShape(12.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.password),
                    contentDescription = null
                )
            },
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
            TextButton(onClick = {}) {
                Text(
                    text = "Đăng Kí Tài Khoản",
                    style = MaterialTheme.typography.labelSmall.copy(color = Color.Black)
                )
            }
            TextButton(onClick = {}) {
                Text(
                    text = "Quên Mật Khẩu",
                    style = MaterialTheme.typography.labelSmall.copy(color = Color.Black)
                )
            }
        }
        OutlinedButton(onClick = {}){
            Text("Đăng Nhập")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}