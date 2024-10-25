
package com.example.mybrowser
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel




class BrowserViewModel : ViewModel() {
    var state by mutableStateOf(BrowserState())
        private set

    fun updateUrl(newUrl: String) {
        state = state.copy(url = newUrl)
    }

    fun updateTitle(newTitle: String) {
        state = state.copy(title = newTitle)
    }

    fun toggleFullScreen(isFull: Boolean) {
        state = state.copy(isFullScreen = isFull)
    }
}
