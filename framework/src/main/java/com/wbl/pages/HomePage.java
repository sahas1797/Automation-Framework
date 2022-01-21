package com.wbl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends WelcomePage{
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver){
        super(driver);
    }


    public void logout() throws InterruptedException {
        logger.info("Clicking the logout button");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@class='settings icon']")).click();

        driver.findElement(By.xpath("//*[@class='power icon']")).click();
        logger.info("Logged Out successfully");
    }
}
