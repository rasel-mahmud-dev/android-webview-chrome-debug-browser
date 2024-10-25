
# My Browser

### Android WebView-Based Browser with Chrome Remote Inspection Enabled

## Overview
My Browser is an Android application that utilizes the WebView component to display web content. This application is designed to provide a fullscreen browsing experience with features like back and forward navigation, refresh capabilities, and an input field for URLs. The project is currently under construction, and additional features will be added in future updates.

## Features
- **Fullscreen Toggle**: Enjoy an immersive browsing experience by toggling fullscreen mode.
- **URL Input**: Users can enter a URL directly into the input field to navigate to specific websites.
- **Back and Forward Navigation**: Easily navigate through browsing history with back and forward buttons.
- **Refresh**: Refresh the current webpage with a dedicated refresh button.
- **Chrome Remote Inspection**: Debug and inspect the WebView using Chrome's remote debugging tools.

## Technologies Used
- **Jetpack Compose**: For building the UI in a declarative way.
- **WebView**: To render web pages directly within the application.
- **ViewModel**: To manage UI-related data in a lifecycle-conscious way.
- **State Management**: Utilizes Kotlin's `mutableStateOf` and `remember` for state management to ensure UI updates efficiently.

## Getting Started

### Prerequisites
- Android Studio (preferably the latest version)
- Kotlin SDK


### Screenshot
![Screenshot_2024-10-25-14-55-05-550_com.example.mybrowser.jpg](public%2FScreenshot_2024-10-25-14-55-05-550_com.example.mybrowser.jpg)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/mybrowser.git
   cd mybrowser
   ```

2. Open the project in Android Studio.

3. Ensure all dependencies are synchronized by clicking on "Sync Now" in the notification bar.

4. Run the application on an emulator or a physical device.

### Usage
- Enter a URL in the provided input field to navigate to a specific website.
- Use the back and forward buttons to navigate through your browsing history.
- Tap the refresh button to reload the current page.
- Enable Chrome Remote Inspection to debug the WebView by connecting to your device via USB and navigating to `chrome://inspect` in Chrome.

### Note
This project is currently under construction. New features and improvements will be added in upcoming releases.


## License
None