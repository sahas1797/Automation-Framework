package com.wbl.tests;

import com.wbl.pages.LogInPage;
import org.testng.annotations.Test;

public class LogInPageTest extends WelcomePageTest{


        @Test
        public void Credentials() throws InterruptedException {

            LogInPage l = new LogInPage(driver);
            l.gotoEmail("pasupunoorisahas@gmail.com");
            l.gotoPassword("Freecrm@174");
            l.logIn();

        }

}
