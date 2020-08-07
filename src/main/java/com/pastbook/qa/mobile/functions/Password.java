package com.pastbook.qa.mobile.functions;


import com.pastbook.qa.mobile.pages.PasswordPage;

public class Password {
    private static PasswordPage passwordPage = new PasswordPage();

    private Password() {}

    public static String changePassword(String newPassword, String confirmPassword) {
        passwordPage.typeNewPassword(newPassword);
        passwordPage.typeConfirmPassword(confirmPassword);
        passwordPage.clickSavePasswordButton();
        String successMessage = passwordPage.getChangePasswordSuccessMessage();
        return successMessage;

    }
}
