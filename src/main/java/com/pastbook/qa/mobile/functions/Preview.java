package com.pastbook.qa.mobile.functions;


import com.pastbook.qa.mobile.pages.PreviewPage;

public class Preview {
    private static PreviewPage previewPage = new PreviewPage();
    private Preview(){}

    public static boolean verifyOpenYouBookButtonIsDisplayed(){
       return previewPage.isOpenYourBookButtonVisible();
    }

    public static String getTitleOfPastBook(){
        return previewPage.getTitleOfThePastBook();
    }

    public static String getWelcomeMessage(){
        return previewPage.getWelcomeMessage();
    }
}
