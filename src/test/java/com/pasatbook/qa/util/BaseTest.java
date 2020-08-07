package com.pasatbook.qa.util;

import com.pastbook.qa.mobile.functions.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
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
}
