package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginpage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginpage.LoginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        viewSystemUsersPage.clickAddButton();
        viewSystemUsersPage.AddUser();
        viewSystemUsersPage.selectAdminRole();
        viewSystemUsersPage.enterEmp();
        viewSystemUsersPage.enterUser();
        viewSystemUsersPage.selectDisableOption();
        viewSystemUsersPage.enterPass();
        viewSystemUsersPage.enterConfirmPass();
        viewSystemUsersPage.clickOnSaveButton();
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginpage.LoginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatusDisable();
        addUserPage.ClickSearchButton();
        addUserPage.VerifyResultList();
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginpage.LoginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        viewSystemUsersPage.clickAddButton();
        viewSystemUsersPage.AddUser();
        viewSystemUsersPage.selectAdminRole();
        viewSystemUsersPage.enterEmp();
        viewSystemUsersPage.enterUser();
        viewSystemUsersPage.selectEnableOption();
        viewSystemUsersPage.enterPass();
        viewSystemUsersPage.enterConfirmPass();
        viewSystemUsersPage.clickOnSaveButton();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatusEnable();
        addUserPage.ClickSearchButton();
        addUserPage.clickOnCheckbox();
        addUserPage.ClickDeleteButton();
        addUserPage.PopUpClick();
        addUserPage.VerifyMsgCheck();
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginpage.LoginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatusDisable();
        addUserPage.SearchButtonDelete();
        addUserPage.VerifyNoRecordFound();
    }
}
