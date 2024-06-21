package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardPage = By.xpath("//div[@class='oxd-topbar-header']/div[1]/span[1]/h6[1]");

    public String VerifyDashboardPage() {
        return getTextFromElement(dashboardPage);
    }

}
