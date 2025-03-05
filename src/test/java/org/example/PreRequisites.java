package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class PreRequisites {

    static WebDriver driver;
    static String webSiteURL = "https://www.saucedemo.com/v1/index.html";
    static WebDriverWait wait ;


        public void openBrowser()   {
        driver = new ChromeDriver();
        wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(webSiteURL);
    }

    public void closeBrowser() {
        driver.quit();
    }


}