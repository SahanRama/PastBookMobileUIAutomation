package com.pastbook.qa.mobile.functions;


import com.pastbook.qa.mobile.pages.PhotoBrowsePage;

public class PhotoBrowse {
    private static PhotoBrowsePage photoBrowsePage = new PhotoBrowsePage();
    private PhotoBrowse(){}

    public static boolean verifyOpenYouBookButtonIsDisplayed(){
       return photoBrowsePage.isOpenYourBookButtonVisible();
    }

    public static String getTitleOfPastBook(){
        return photoBrowsePage.getTitleOfThePastBook();
    }

    public static String getWelcomeMessage(){
        return photoBrowsePage.getWelcomeMessage();
    }
}
