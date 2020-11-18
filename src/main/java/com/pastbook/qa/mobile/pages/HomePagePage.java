package com.pastbook.qa.mobile.pages;

import com.pastbook.qa.mobile.util.BaseUtil;
import org.openqa.selenium.By;

public class HomePagePage extends BaseUtil {

    private By buttonHamburger = By.xpath("//*[@class='icon-hamburger-animated']");
    private By buttonSignIn = By.xpath("//a[text()='Sign in']");
    private By buttonProfile = By.xpath("//a[text()='Profile']");
    private By buttonSignOut = By.xpath("//a[text()='Sign out']");
    private By buttonStartNow = By.xpath("//a[text()='Start now']");
    private By buttonDemo = By.xpath("//*[@id='seevideo']/span[text()=' Demo']");
    private By buttonFlag = By.xpath("//*[@class='btn-group lang-dropdown']/button");
    private By header = By.xpath("//h1");
    private By linkHome = By.xpath("//a[contains(text(),'Home')]");
    private By linkCreateBook = By.xpath("//a[contains(text(),'Create book')]");
    private By linkCreateCalender = By.xpath("//a[contains(text(),'Calendar')]");
    private By linkPoster = By.xpath("//a[contains(text(),'Poster')]");
    private By linkPhotoCard = By.xpath("//a[contains(text(),'Create Photo Cards')]");
    private By linkNeedHelp = By.xpath("//a[contains(text(),'Need help?')]");
    private By linkSignin = By.xpath("//a[contains(text(),'Sign in')]");

    //Actions
    public void clickMenuButton(){
        waitForElement(buttonHamburger,60);
        driver.findElement(buttonHamburger).click();
    }

    public void clickSignInButton(){
        waitForElement(buttonSignIn,60);
        driver.findElement(buttonSignIn).click();
        waitForSeconds(3);
    }

    public void clickProfileButton(){
        driver.findElement(buttonProfile).click();
    }

    public void clickSignOutButton(){
        waitForElement(buttonSignOut,10);
        driver.findElement(buttonSignOut).click();
    }

    public String getHeaderText(){
        waitForElement(header,10);
        return driver.findElement(header).getText();
    }


    //Verification points
    public boolean isStartNowButtonDisplay() {
        waitForElement(buttonStartNow,10);
        return isElementDisplayed(buttonStartNow);
    }
    public boolean isDemoButtonDisplay() {
        waitForElement(buttonDemo,10);
        return isElementDisplayed(buttonDemo);
    }
    public boolean isChangeLanguageButtonDisplay() {
        waitForElement(buttonFlag,10);
        return isElementDisplayed(buttonFlag);
    }
    public boolean isHamburgerButtonDisplay() {
        waitForElement(buttonHamburger,10);
        return isElementDisplayed(buttonHamburger);
    }
    public boolean isHomeLinkDisplay() {
        waitForElement(linkHome,10);
        return isElementDisplayed(linkHome);
    }
    public boolean isCreateBookLinkDisplay() {
        waitForElement(linkCreateBook,10);
        return isElementDisplayed(linkCreateBook);
    }
    public boolean isCalendarLinkDisplay() {
        waitForElement(linkCreateCalender,10);
        return isElementDisplayed(linkCreateCalender);
    }
    public boolean isPosterLinkDisplay() {
        waitForElement(linkPoster,10);
        return isElementDisplayed(linkPoster);
    }
    public boolean isCreatePhotoCardsLinkDisplay() {
        waitForElement(linkPhotoCard,10);
        return isElementDisplayed(linkPhotoCard);
    }
    public boolean isNeedHelpLinkDisplay() {
        waitForElement(linkNeedHelp,10);
        return isElementDisplayed(linkNeedHelp);
    }
    public boolean isSignInLinkDisplay() {
        waitForElement(linkSignin,10);
        return isElementDisplayed(linkSignin);
    }

    public void isHomePageProperlyDisplay(){
        waitForElement(buttonHamburger,10);
        eyes.checkWindow("Home-Page");
    }
    public void isMainMenuProperlyDisplay(){
        waitForElement(linkHome,10);
        eyes.checkWindow("Main-Menu");
    }


}
