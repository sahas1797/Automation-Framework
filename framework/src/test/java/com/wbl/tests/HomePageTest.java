package com.wbl.tests;
import com.wbl.pages.HomePage;

import org.testng.annotations.Test;

public class HomePageTest extends WelcomePageTest{

    @Test
    public void signOut() throws InterruptedException {

        HomePage h= new HomePage(driver);
        h.logout();

    }




}