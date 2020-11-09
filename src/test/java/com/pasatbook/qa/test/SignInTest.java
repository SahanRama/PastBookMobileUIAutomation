package com.pasatbook.qa.test;

import com.pasatbook.qa.util.BaseTest;
import com.pastbook.qa.mobile.functions.*;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {


    @Test(groups = "EmailGenerate",priority = 5)
    public void verifyUserAbleToRegisterThenCreateABookAndUploadPhotosToItAndLogoutFromThatAccountAndLogInBack() {
        HomePage.navigateToSignInPopUp();
        SignIn.submitNewEmailAndNavigateToMainWindow(email);
        String newToSystemMessage = CreatePassBook.getNewToTheApplicationMessage();
        softAssert.assertTrue(newToSystemMessage.contains("Hey! It seems you have not created any PastBook yet, go ahead!"),"Welcome new user message is incorrect");
        CreatePassBook.createAPassBook("Bikes");
        UploadPhotos.uploadPhotos();
        softAssert.assertEquals(PhotoBrowse.getTitleOfPastBook(),"Bikes", "Past Book Title Mismatch ");
        HomePage.navigateToProfilePage();
        softAssert.assertEquals(Profile.getHeaderText(), "Update your Profile","Profile Page Header mismatch");
        Profile.changeFirstNameAndLastName("Johny","Doe");
        softAssert.assertTrue(Profile.getSuccessMessage().contains("Profile updated!"),"Profile Update message mismatched");
        Profile.navigateToChangePassword();
        String updatePasswordMessage = Password.changePassword("test123","test123");
        softAssert.assertTrue(updatePasswordMessage.contains("Password updated!"),"Update Password Message mismatch");
        HomePage.signOutFromApplication();
        HomePage.navigateToSignInPopUp();
        SignIn.submitUsernameAndPasswordAndLogin(email,"test123");
        softAssert.assertEquals(PhotoBrowse.getTitleOfPastBook(), "Bikes", "Past Book Title Mismatch ");
        softAssert.assertAll();
        HomePage.signOutFromApplication();
    }

    @Test(priority = 2)
    public void verifyTheErrorMessageWhenUserTryToLoginFromAInvalidPassword(){
        HomePage.navigateToSignInPopUp();
        SignIn.submitEmail("Johny449@mailinator.com");
        SignIn.submitPassword("invalidPassword");
        softAssert.assertEquals(SignIn.getErrorMessage(),"Invalid Password","Invalid Password Error message mismatch");
        HomePage.closeWindow();
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void verifySuccessfulLoginWithValidCredentials(){
        HomePage.navigateToSignInPopUp();
        SignIn.submitUsernameAndPasswordAndLogin("Johny449@mailinator.com","test123");
        softAssert.assertTrue(PhotoBrowse.verifyOpenYouBookButtonIsDisplayed(), "Open Your Book Button is not displayed");
        softAssert.assertEquals(PhotoBrowse.getTitleOfPastBook(),"Bikes", "Past Book Title Mismatch ");
        softAssert.assertAll();
        HomePage.signOutFromApplication();
    }

    @Test(priority = 1)
    public void verifyAllTheElementsAreDisplayedInSignInPopUp(){
        HomePage.navigateToSignInPopUp();
        softAssert.assertTrue(SignIn.isFacebookLoginButtonDisplay(),"Facebook Login Button is not displayed");
        softAssert.assertTrue(SignIn.isUseEmailButtonDisplay(),"Use Email link is not displayed");
        SignIn.clickUseEmailLink();
        softAssert.assertTrue(SignIn.isEmailTextBoxDisplay(),"Use Email Text Box is not displayed");
        softAssert.assertTrue(SignIn.isSubmitButtonDisplay(),"Use Email Text Box is not displayed");
        softAssert.assertAll();
        HomePage.closeWindow();

    }

    @Test(priority = 4)
    public void verifySuccessfulLoginWithFaceBookLogin(){
        HomePage.navigateToSignInPopUp();
        SignIn.loginWithFaceBook("garfieldrankin2020@gmail.com","Fkgdshk#$%#$dfssdkfha");
        softAssert.assertEquals(PhotoBrowse.getTitleOfPastBook(), "Facebook Moments", "Past Book Title Mismatch ");
        softAssert.assertAll();
        HomePage.signOutFromApplication();
    }
}
