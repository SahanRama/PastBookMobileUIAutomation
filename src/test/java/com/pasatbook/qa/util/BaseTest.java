package com.pasatbook.qa.util;

import com.pastbook.qa.mobile.common.Base;
import com.pastbook.qa.mobile.util.BaseUtil;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected SoftAssert softAssert;
    protected String email;

    @BeforeClass
    public void openHomePage() {
        Base.openBrowser();
    }

    @BeforeMethod
    public void navigateToHomePage() {
        Base.navigateToHomePage();
    }

    @BeforeMethod()
    public void initializeSoftAssert() {
        this.softAssert = new SoftAssert();
    }

    @BeforeGroups("EmailGenerate")
    public void emailGenerate() {
        this.email = Base.generateEmail();
    }

    @BeforeGroups("VisualTest")
    public void startApplitools() {
        Base.startApplitools();
    }
    @AfterGroups("VisualTest")
    public void closeApplitools(){
        Base.closeApplitools();
    }

    @AfterMethod
    public void navigateToHome() {
        Base.navigateToHomePage();
    }

    @AfterSuite
    public void closeBrowser() {
        Base.tearDown();
    }
}
