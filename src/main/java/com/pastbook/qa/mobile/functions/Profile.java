package com.pastbook.qa.mobile.functions;


import com.pastbook.qa.mobile.pages.ProfilePage;

public class Profile {
    private static ProfilePage profilePage = new ProfilePage();
    private Profile(){}

    public static void changeFirstNameAndLastName(String firstName,String lastName){
        profilePage.typeFirstName(firstName);
        profilePage.typeLastName(lastName);
        profilePage.clickSaveChangesButton();
    }

    public static String  getHeaderText(){
        return profilePage.getHeader();
    }

    public static String getSuccessMessage(){
        return profilePage.getProfileUpdateSuccessMessage();
    }

    public static void navigateToChangePassword(){
        profilePage.clickUpdatePassword();
    }
}
