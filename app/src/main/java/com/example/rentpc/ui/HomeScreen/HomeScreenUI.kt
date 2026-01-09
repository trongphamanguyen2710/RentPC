package com.example.rentpc.ui.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rentpc.R
import kotlinx.coroutines.flow.MutableStateFlow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import kotlinx.coroutines.launch

@Composable
fun NavigationDrawer(
    drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "RENT PC",
                        style = MaterialTheme.typography.labelLarge.copy(
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
                HorizontalDivider()
                NavigationDrawerItem(
                    label = { Text("Thuê máy tính") },
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.rentpc),
                            contentDescription = null
                        )
                    }
                )
                NavigationDrawerItem(
                        label = { Text("Thuê cloud") },
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        painter = painterResource(R.drawable.cloud),
                        contentDescription = null
                    )
                }
                )
                NavigationDrawerItem(
                    label = { Text("Nạp tiền") },
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.payment),
                            contentDescription = null
                        )
                    }
                )
                NavigationDrawerItem(
                    label = { Text("Đăng Xuất") },
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.logout),
                            contentDescription = null
                        )
                    }
                )
            }
        }
    ) {
        Box(Modifier.fillMaxSize())
    }
}

@Composable
fun HomeScreen(){
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.spacing_medium))
    ) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            tonalElevation = 6.dp,
            shadowElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.spacing_small))
            ) {
                IconButton(onClick = {
                    scope.launch {
                        drawerState.open()
                    }
                }) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_menu_24),
                        contentDescription = null
                    )
                }
                Spacer(Modifier.weight(1f))

                Text("Số Dư: 999.999 VNĐ")

                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
            }
        }

        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_small)))

        OutlinedButton(onClick = {}) { 
            Text("Thuê PC")
        }

        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_small)))

        Divider(
            thickness = 1.dp
        )
        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_small)))
        CardPC()
    }
}

@Composable
fun AdminScreen(){
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.spacing_medium))
    ) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            tonalElevation = 6.dp,
            shadowElevation = 6.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.spacing_small))
            ) {
                IconButton(onClick = {
                    scope.launch {
                        drawerState.open()
                    }
                }) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_menu_24),
                        contentDescription = null
                    )
                }
                Spacer(Modifier.weight(1f))

                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
            }
        }

        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_small)))

        OutlinedButton(onClick = {}) {
            Text("Thêm PC")
        }

        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_small)))

        Divider(
            thickness = 1.dp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAdminScreen(){
    AdminScreen()
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun PreviewNavigationDrawer() {
    MaterialTheme {
        val drawerState = rememberDrawerState(DrawerValue.Open)

        NavigationDrawer(
            drawerState = drawerState
        )
    }
}


@Preview(showBackground = true)
@Composable
fun previewHomeScreen(){
    HomeScreen()
}