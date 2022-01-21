package com.wbl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class LogInPage extends WelcomePage {
    private static final Logger logger = LogManager.getLogger(LogInPage.class);

    public LogInPage(WebDriver driver){

        super(driver);
    }


    public void gotoEmail(String username) throws InterruptedException {
        Thread.sleep(5000);
        logger.info("Entering the Username");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
    }

    public void gotoPassword(String pswd) throws InterruptedException {
        logger.info("Entering the Password");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pswd);
    }

    public void logIn(){
        logger.info("Clicking the Login button after entering credentials");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
    }

}
