package com.example.mybrowser

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.material3.Text

import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WebView.setWebContentsDebuggingEnabled(true)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.statusBars())
            controller.hide(WindowInsetsCompat.Type.navigationBars())
        }

        setContent {
            MyBrowserApp()
        }
    }

}

@Composable
fun MyBrowserApp(viewModel: BrowserViewModel = viewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        
        CustomAppBar(
            url = viewModel.state.url,
            onUrlChange = { newUrl -> viewModel.updateUrl(newUrl) },
            onBackClick = { /* Handle back */ },
            onForwardClick = { /* Handle forward */ },
            onRefreshClick = { /* Handle refresh */ }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = viewModel.state.title)

        BrowserView(
            url = viewModel.state.url,
            modifier = Modifier.fillMaxSize(),
            onWebViewCreated = { webView ->
                // Optionally do something with the webView here
            }
        )
    }
}