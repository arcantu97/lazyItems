package com.example.fmbtm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fmbtm.composables.SkeletonCard
import com.example.fmbtm.ui.theme.FmbtmTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FmbtmTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(topBar = { AppBar() }) {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.LightGray) {
            Column {
                SkeletonCard()
                SkeletonCard()
                SkeletonCard()
                SkeletonCard()
            }
        }
    }
}

@Composable
fun AppBar() {
    TopAppBar(
        navigationIcon = {
            Icon(
                Icons.Default.Home,
                stringResource(R.string.home_icon_value),
                Modifier.padding(horizontal = 12.dp)
            )
        },
        title = { Text(text = stringResource(R.string.home_icon_value)) }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FmbtmTheme {
        MainScreen()
    }
}