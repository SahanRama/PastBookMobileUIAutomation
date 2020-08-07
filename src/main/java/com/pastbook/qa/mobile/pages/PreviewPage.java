package com.pastbook.qa.mobile.pages;

import org.openqa.selenium.By;

public class PreviewPage extends BasePage{
    private By btnOpenBook = By.xpath("//button[text()='Open your book']");
    private By lblTitleOfAlbum = By.xpath("//div[@class='title']");
    private By lblWelcomeBack = By.xpath("//div[contains(text(),'Welcome back!')]");

    public boolean isOpenYourBookButtonVisible() {
        waitForElement(btnOpenBook, 60);
        return driver.findElement(btnOpenBook).isDisplayed();
    }

    public String getTitleOfThePastBook(){
        waitForElement(lblTitleOfAlbum, 60);
        return driver.findElement(lblTitleOfAlbum).getText();
    }

    public String getWelcomeMessage(){
        return driver.findElement(lblWelcomeBack).getText();
    }
}
