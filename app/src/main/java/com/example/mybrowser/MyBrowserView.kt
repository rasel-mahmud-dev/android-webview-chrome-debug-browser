package com.example.mybrowser

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun BrowserView(url: String, modifier: Modifier = Modifier, onWebViewCreated: (WebView) -> Unit) {
    var currentUrl by remember { mutableStateOf(url) }

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                loadUrl(currentUrl)
                onWebViewCreated(this)
            }
        },
        modifier = modifier,
        update = { webView ->
            if (currentUrl != url) {
                currentUrl = url
                webView.loadUrl(url) // Load new URL on change
            }
        }
    )
}