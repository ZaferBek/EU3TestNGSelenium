package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork extends TestBase {

    /**
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */

//    @Test
//    public void homeworkTest(){ //My code
//        extentLogger = report.createTest("Customer contact details verification");
//
//        extentLogger.info("Login to webpage: qa1.vytrack");
//        LoginPage loginPage = new LoginPage();
//
//        extentLogger.info("Login as a Sales Manager");
//        loginPage.loginAsSalesManager();
//
//        extentLogger.info("navigate to customers ->contacts");
//        DashboardPage dashboardPage = new DashboardPage();
//        dashboardPage.navigateToModule("Customers", "Contacts");
//
//        ContactsPage contactsPage = new ContactsPage();
//        BrowserUtils.waitFor(5);
//
//        extentLogger.info("Click on email mbrackstone9@example.com");
//        contactsPage.mbrackstoneMail.click();
//
//        extentLogger.info("Verify that full name is Mariam Brackstone");
//        WebElement fullname = driver.findElement(By.xpath("//h1[text()='Mariam Brackstone']"));
//        String actualFullName = fullname.getText();
//        String expectedFullName = "Mariam Brackstone";
//        Assert.assertEquals(actualFullName, expectedFullName, "Verification of full name");
//
//        extentLogger.info("Verify that email is mbrackstone9@example.com");
//        WebElement email = driver.findElement(By.xpath("//a[text()='mbrackstone9@example.com']"));
//        String actualEmail = email.getText();
//        String expectedEmail = "mbrackstone9@example.com";
//        Assert.assertEquals(actualEmail, expectedEmail, "Verification of email");
//
//        extentLogger.info("Verify that phone number is +18982323434");
//        WebElement phoneNumber = driver.findElement(By.xpath("//a[text()='+18982323434']"));
//        String actualPhoneNumber = phoneNumber.getText();
//        String expectedPhoneNumber = "+18982323434";
//        Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber, "Verification of Phone number");
//
//    }



}
