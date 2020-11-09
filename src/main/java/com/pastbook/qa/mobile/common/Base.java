package com.pastbook.qa.mobile.common;

import com.pastbook.qa.mobile.util.BaseUtil;

import java.util.Random;

public class Base {
private static BaseUtil baseUtil =new BaseUtil();

    private Base(){}

    public static void openBrowser() {
        baseUtil.loadBrowser();
    }
    public static void navigateToHomePage() {
        baseUtil.navigateToHomePage();
    }

    public static String generateEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String email = "Johnie"+ randomInt +"@mailinator.com";
        return email;
    }

    public static void tearDown(){
        baseUtil.tearDown();
    }



}
