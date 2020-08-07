package com.pastbook.qa.mobile.functions;

import com.pastbook.qa.mobile.pages.UploadPhotosPage;

public class UploadPhotos {
    private static UploadPhotosPage uploadPhotosPage = new UploadPhotosPage();
    private UploadPhotos(){}

    public static void uploadPhotos(){
        uploadPhotosPage.clickUploadYourPhotosButton();
        uploadPhotosPage.clickSelectFilesToUploadButton();
        uploadPhotosPage.clickUploadFilesButtonInPopup();
        uploadPhotosPage.clickOnTwoImagesToAppearButtonAndContinue();

    }
}
