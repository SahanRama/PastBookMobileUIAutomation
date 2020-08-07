package com.pastbook.qa.mobile.functions;

import com.pastbook.qa.mobile.pages.BasePage;

import java.util.Random;

public class Base {
private static BasePage basePage =new BasePage();

    private Base(){}

    public static void openBrowser() {
        basePage.loadBrowser();
    }
    public static void navigateToHomePage() {
        basePage.navigateToHomePage();
    }

    public static String generateEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String email = "Johnie"+ randomInt +"@mailinator.com";
        return email;
    }



}
