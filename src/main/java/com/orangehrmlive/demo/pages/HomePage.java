package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By displayLogo = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By userProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/i[1]");
    By logOut = By.xpath("//a[normalize-space()='Logout']");
    By pIM = By.xpath("//a[@class='oxd-main-menu-item active']");
    By leave = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[3]/a[1]/span[1]");
    By dashboard = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[8]/a[1]");

    public String displayLogoHome() {
        return getTextFromElement(displayLogo);
    }

    public void userProfileLogoClick() {
        clickOnElement(userProfileLogo);
    }

    public void LogOut() throws InterruptedException {
        mouseHoverToElementAndClick(logOut);
    }

    public void PIMClick() {
        clickOnElement(pIM);
    }

    public void leaveClick() {
        clickOnElement(leave);
    }

    public void clickDashboard() {
        clickOnElement(dashboard);
    }
}
