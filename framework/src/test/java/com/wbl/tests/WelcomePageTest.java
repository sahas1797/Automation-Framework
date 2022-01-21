package com.wbl.tests;

import com.wbl.pages.WelcomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WelcomePageTest {

    private static final Logger logger = LogManager.getLogger(WelcomePageTest.class);

    public WebDriver driver;

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://freecrm.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void Initializing() {
        WelcomePage w = new WelcomePage(driver);
        w.gotoLogIn();
    }
}