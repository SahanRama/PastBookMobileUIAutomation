package com.pastbook.qa.mobile.pages;

import com.pastbook.qa.mobile.util.LoggerUtil;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static AppiumDriver driver;
    private static String  mainWindow;

    public void loadBrowser(){

        String currentDirectory = System.getProperty("user.dir");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("chromedriverExecutable",currentDirectory+"\\src\\main\\resources\\drivers\\chromedriver.exe");
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability(CapabilityType.VERSION,"9.0");

        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AppiumDriver(url, capabilities);

        Set<String> contextNames = driver.getContextHandles();

        System.out.println(contextNames.size());

        for (String contextName : contextNames) {

            System.out.println(contextName);

            if (contextName.contains("CHROMIUM")){

                driver.context(contextName);

            }

        }

    }

    public void navigateToHomePage(){
        driver.get("https://moments.pastbook.com/");
    }

    public void waitForElement(By locator, int timeout) {
        new WebDriverWait(driver, timeout).until
                (ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static boolean isElementDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public static void waitForSeconds(int waitTimeInSeconds) {
        try {
            TimeUnit.SECONDS.sleep(waitTimeInSeconds);
        } catch (InterruptedException e) {
            LoggerUtil.logERROR("Interrupted Exception:", e);
            Thread.currentThread().interrupt();
        }
    }

    public static void switchToNewWindow(){
        String  currentWindow = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        mainWindow = currentWindow;
    }

    public void switchToMainWindow(){
        driver.switchTo().window(mainWindow);
    }

    public void closeWindow(){
        driver.close();
        driver.switchTo().window(mainWindow);
    }


}
