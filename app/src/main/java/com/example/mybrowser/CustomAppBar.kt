// CustomAppBar.kt
package com.example.mybrowser

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomAppBar(
    url: String,
    onUrlChange: (String) -> Unit,
    onBackClick: () -> Unit,
    onForwardClick: () -> Unit,
    onRefreshClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF009688)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            value = url,
            onValueChange = onUrlChange,
            singleLine = true,
            modifier = Modifier
                .weight(1f)
                .padding(10.dp, 0.dp)
                .height(35.dp)
                .background(
                    color = Color(0x5BFFFFFF),
                    shape = RoundedCornerShape(20.dp)
                )
                .clip(RoundedCornerShape(20.dp)),
            textStyle = LocalTextStyle.current.copy(
                color = Color.Black,
                fontSize = 14.sp
            ),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 7.dp, horizontal = 15.dp)
                ) {
                    innerTextField()
                }
            }
        )
        IconButton(onClick = onBackClick) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }
        IconButton(onClick = onForwardClick) {
            Icon(Icons.Default.ArrowForward, contentDescription = "Forward")
        }
        IconButton(onClick = onRefreshClick) {
            Icon(Icons.Default.Refresh, contentDescription = "Refresh")
        }

    }
}
