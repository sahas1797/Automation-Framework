package com.wbl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private static final Logger logger = LogManager.getLogger(WelcomePage.class);

    public WebDriver driver;

    public WelcomePage(WebDriver driver){
        this.driver=driver;
    }


    public void gotoLogIn(){
        logger.info("Clicking on Login Button in welcome Page");
        driver.findElement(By.linkText("LOG IN")).click();
    }

}
