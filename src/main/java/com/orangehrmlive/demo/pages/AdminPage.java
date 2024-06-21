package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By user = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[1]/span[1]/i[1]");
    By job = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[2]/span[1]/i[1]");
    By organization = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[3]/span[1]/i[1]");

    public void UserManagement() throws InterruptedException {
        clickOnElement(user);
        Thread.sleep(1000);
    }

    public void ClickJob() throws InterruptedException {
        clickOnElement(job);
        Thread.sleep(1000);
    }

    public void ClickOrganization() {
        clickOnElement(organization);
    }
}
