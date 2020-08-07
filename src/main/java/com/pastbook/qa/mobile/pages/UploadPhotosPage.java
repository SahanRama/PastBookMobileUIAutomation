package com.pastbook.qa.mobile.pages;
import org.openqa.selenium.By;


public class UploadPhotosPage extends HomePagePage {
    private By headerText = By.xpath("//h1/text()");
    private By btnUploadYourPictures = By.xpath("//a[@class='btn btn-lg btn-primary']");
    private By btnUploadPopUp = By.xpath("//span[@title='Upload']");
    private By imgTwoPerPage = By.xpath("//img[@title='Two per page']");
    private By btnContinue = By.xpath("//button[@style='display: inline-block;']");
    private By btnDevice = By.xpath("//div[@class='fsp-source-list__item fsp-source-list__item--active']");
    private By mobileElementPermissionView = By.id("com.android.packageinstaller:id/permission_allow_button");
    private By mobileElementFile = By.xpath("//*[@text='Files']");
    private By mobileElementImage = By.xpath("//*[@text='ARCH-1s-motorcycle.jpg']");

    public void clickUploadYourPhotosButton() {
        waitForElement(btnUploadYourPictures, 5);
        driver.findElement(btnUploadYourPictures).click();
    }

    public String getHeaderText() {
        waitForElement(headerText, 5);
        return driver.findElement(headerText).getText();
    }

    public void clickSelectFilesToUploadButton() {

        waitForElement(btnDevice, 20);
        driver.findElement(btnDevice).click();

        driver.context("NATIVE_APP");

        waitForElement(mobileElementPermissionView, 20);
        driver.findElement(mobileElementPermissionView).click();


        waitForElement(mobileElementFile, 20);
        driver.findElement(mobileElementFile).click();

        waitForElement(mobileElementImage, 20);
        driver.findElement(mobileElementImage).click();

        driver.context("CHROMIUM");

    }

    public void clickUploadFilesButtonInPopup() {
        waitForElement(btnUploadPopUp, 10);
        driver.findElement(btnUploadPopUp).click();

    }

    public void clickOnTwoImagesToAppearButtonAndContinue() {
        waitForElement(imgTwoPerPage, 60);
        driver.findElement(imgTwoPerPage).click();
        driver.findElement(btnContinue).click();

    }

}
