package com.pastbook.qa.mobile.functions;

import com.pastbook.qa.mobile.pages.BasePage;
import com.pastbook.qa.mobile.pages.HomePagePage;

public class HomePage {
    private static HomePagePage homePagePage = new HomePagePage();

    public static void navigateToSignInPopUp() {
        homePagePage.clickMenuButton();
        homePagePage.clickSignInButton();
        BasePage.switchToNewWindow();
    }
    public static void navigateToProfilePage() {
        homePagePage.clickMenuButton();
        homePagePage.clickProfileButton();
    }

    public static void signOutFromApplication() {
        homePagePage.clickMenuButton();
        homePagePage.clickSignOutButton();
    }

    public static boolean isStartNowButtonDisplay() {
        return homePagePage.isStartNowButtonDisplay();
    }

    public static boolean isHamburgerButtonDisplay() {
        return homePagePage.isHamburgerButtonDisplay();
    }

    public static String getHeaderText() {
        return homePagePage.getHeaderText();
    }

    public static void navigateToHomePage() {
        homePagePage.navigateToHomePage();
    }
    public static void closeWindow() {
        homePagePage.closeWindow();
    }



}
