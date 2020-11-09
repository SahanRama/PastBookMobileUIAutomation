package com.pastbook.qa.mobile.functions;

import com.pastbook.qa.mobile.util.BaseUtil;
import com.pastbook.qa.mobile.pages.HomePagePage;

public class HomePage {
    private static HomePagePage homePagePage = new HomePagePage();

    public static void navigateToSignInPopUp() {
        homePagePage.clickMenuButton();
        homePagePage.clickSignInButton();
        BaseUtil.switchToNewWindow();
    }
    public static void navigateToProfilePage() {
        homePagePage.clickMenuButton();
        homePagePage.clickProfileButton();
    }
    public static void openMenu() {
        homePagePage.clickMenuButton();
    }

    public static void signOutFromApplication() {
        homePagePage.clickMenuButton();
        homePagePage.clickSignOutButton();
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

    //Verification points
    public static boolean isStartNowButtonDisplay() {
        return homePagePage.isStartNowButtonDisplay();
    }
    public static boolean isDemoButtonDisplay() {
        return homePagePage.isDemoButtonDisplay();
    }
    public static boolean isChangeLanguageButtonDisplay() {
        return homePagePage.isChangeLanguageButtonDisplay();
    }
    public static boolean isHamburgerButtonDisplay() {
        return homePagePage.isHamburgerButtonDisplay();
    }
    public static boolean isHomeLinkDisplay() {
        return homePagePage.isHomeLinkDisplay();
    }
    public static boolean isCreateBookLinkDisplay() {
        return homePagePage.isCreateBookLinkDisplay();
    }
    public static boolean isCalendarLinkDisplay() {
        return homePagePage.isCalendarLinkDisplay();
    }
    public static boolean isPosterLinkDisplay() {
        return homePagePage.isPosterLinkDisplay();
    }
    public static boolean isCreatePhotoCardsLinkDisplay() {
        return homePagePage.isCreatePhotoCardsLinkDisplay();
    }
    public static boolean isNeedHelpLinkDisplay() {
        return homePagePage.isNeedHelpLinkDisplay();
    }
    public static boolean isSignInLinkDisplay() {
        return homePagePage.isSignInLinkDisplay();
    }



}
