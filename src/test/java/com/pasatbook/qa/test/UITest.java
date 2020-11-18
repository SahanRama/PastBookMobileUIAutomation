package com.pasatbook.qa.test;

import com.pasatbook.qa.util.BaseTest;
import com.pastbook.qa.mobile.functions.HomePage;
import org.testng.annotations.Test;

public class UITest extends BaseTest {
    @Test(groups = "VisualTest")
    public void verifyHomePage(){
        HomePage.isHomePageProperlyDisplay();

    }
    @Test(groups = "VisualTest")
    public void verifyMainMenuAsGuestUser(){
        HomePage.openMenu();
        HomePage.isMainMenuProperlyDisplay();

    }
}
