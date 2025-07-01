# Mobile_Automation_Project
This project demonstrates mobile test automation using Java, leveraging Selenium and Appium for interacting with mobile applications, and Android Studio for building and managing emulators.
## Technologies Used
- Selenium: Used for web automation, and its WebDriver concept extends to mobile automation via Appium.
- Appium: An open-source tool for automating native, mobile web, and hybrid applications on iOS mobile, Android mobile, and Windows desktop platforms. It drives iOS and Android apps using the WebDriver protocol.
- Android Studio: Essential for setting up and managing Android Virtual Devices (AVDs) or emulators, which are used as target devices for mobile automation.
- Java: The primary programming language used for writing test scripts.
## Project Structure
```console
Mobile_Automation_Project/
├── src/
│   └── tests/
│       ├── TestAddToCart.java
│       ├── TestBackOption.java
│       ├── TestCartPage.java
│       └── TestFirstPage.java
└── README.md
```

## Prerequisites
### Java Development Kit (JDK): 
JDK 8 or higher was installed and configured in my system's PATH.
### Android Studio: 
Android Studio was downloaded and installed. This includes the Android SDK, which is necessary for building and running emulators.
### Appium Server: 
 Node.js (which includes npm) and Appium was installed
### WebDriver for Selenium: 
ChromeDriver was used here for Android web views.
### Appium Inspector:
Appium Inspector is used here, which is a GUI for Appium, powered by Appium Server.

## Usage
To run the mobile automation tests:
### 1.Start Appium Server:
Server was ran in terminal.

### 2.Start Android Emulator:
The configured Android emulator is launched via Android Studio's AVD Manager.

### 3.Run Tests:
Different features of the emulator are tested, such as the first page, the cart page, the back option, and adding a product to the cart.










