package com.example.fmbtm.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fmbtm.R

@Preview(showBackground = true)
@Composable
fun SkeletonCard() {
    Card(
        modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = 8.dp,
        shape = RoundedCornerShape(6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture()
            ProfileContent()
        }
    }
}

@Composable
fun ProfileContent() {
    Column(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()) {
        Text(text = "Chris", style = MaterialTheme.typography.h4)
        CompositionLocalProvider(LocalContentAlpha provides(ContentAlpha.medium)) {
            Text(text = "Active now", style = MaterialTheme.typography.body1)
        }
    }
}

@Composable
fun ProfilePicture() {
    Card(
        modifier = Modifier.padding(16.dp),
        shape = CircleShape,
        elevation = 2.dp
    ) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "profile picture",
            contentScale = ContentScale.Crop
        )
    }
}