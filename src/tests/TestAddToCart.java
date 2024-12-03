
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.BaseOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

public class TestAddToCart {
    public AndroidDriver driver;

    @BeforeSuite
    public void TestApp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "pixel1");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
        desiredCapabilities.setCapability("appium:appActivity", "com.androidsample.generalstore.SplashActivity");
        URL remoteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        var el1 = driver.findElement(AppiumBy.id("android:id/text1"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Bangladesh\"))"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        el3.click();
        el3.sendKeys("fara");
        el3.click();
        var el4 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
        el5.click();


    }
    @Test
    public void AddCartTest() {
        var el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Air Jordan 1 Mid SE\")"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(1)"));
        el2.click();
    }
    @AfterSuite
    public void closeapp(){
        driver.removeApp("General-Store.apk");
        driver.quit();
    }
    }


