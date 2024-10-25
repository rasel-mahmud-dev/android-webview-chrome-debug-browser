package com.example.mybrowser
data class BrowserState(
    var url: String = "https://www.google.com",
    var title: String = "",
    var isFullScreen: Boolean = false
)