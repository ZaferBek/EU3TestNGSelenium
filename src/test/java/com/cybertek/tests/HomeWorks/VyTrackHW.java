package com.cybertek.tests.HomeWorks;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTrackHW extends TestBase {

    @Test
    public void testCase1(){
        extentLogger = report.createTest("Verification of 'Options' display");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Verification of 'Options' display");
        WebElement options = driver.findElement(By.xpath("//div[@href='#']"));
        Assert.assertTrue(options.isDisplayed());
        extentLogger.info("PASSED");
    }

    @Test
    public void testCase2() throws InterruptedException {
        extentLogger = report.createTest("Verification of page number");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Verify that page number is equal to'1'");
        String expected = "1";
        String actual = calendarEventsPage.pageNumber.getAttribute("value");
        Assert.assertEquals(actual, expected, "Verification of page number");
        extentLogger.info("PASSED");
    }

    @Test
    public void testCase3(){
        extentLogger = report.createTest("Verification of view per page number");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Verify that view per page number is equal to'25'");
        String expected = "25";
        String actual = calendarEventsPage.viewPerPage.getText();
        Assert.assertEquals(actual, expected, "Verification of view per page");
        extentLogger.info("PASSED");
    }

    @Test
    public void testCase4(){
        extentLogger = report.createTest("Verification of total number of records and Calendar events");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Getting of total number of records");
        String text = calendarEventsPage.totalRecords.getText();
        String[] s = text.split(" ");
        int totalRecords = Integer.parseInt(s[2]);

        extentLogger.info("Getting of total number of pages");
        String[] page = calendarEventsPage.pageOf.getText().split(" ");
        int numberOfPages = Integer.parseInt(page[1]);

        extentLogger.info("Getting of number of view per page");
        int viewPerPage = Integer.parseInt(calendarEventsPage.viewPerPage.getText());

        calendarEventsPage.pageNumber.clear();
        calendarEventsPage.pageNumber.sendKeys(calendarEventsPage.pageOf.getText());
        calendarEventsPage.refreshButton.click();
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Verification of total number of records and Calendar events");
        int lastPageRows = calendarEventsPage.rowNumber.size();
        int expected = totalRecords;
        int actual = lastPageRows + (numberOfPages-1)*viewPerPage;
        Assert.assertEquals(actual,expected,"Verification of total number of records and Calendar events");
        extentLogger.info("PASSED");
    }

    @Test
    public void testCase5(){
        extentLogger = report.createTest("Verifivation of all calendar events selected");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Click on the top checkbox to select all");
        calendarEventsPage.selectAllCheckbox.click();

        extentLogger.info("Verify that all Calendar events are selected");
        for (WebElement element : calendarEventsPage.checkboxes) {
           Assert.assertTrue(element.isSelected());
        }
        extentLogger.info("PASSED");
    }

    @Test
    public void testCase6(){
        extentLogger = report.createTest("Verifivation of all Data display");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        extentLogger.info("Go to webpage '//qa1.vytrack.com'");
        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Navigate to Activities -> Calenddar Events");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Select 'Testers meeting'");
        calendarEventsPage.testersMeeting.click();
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        extentLogger.info("Verification of all data displayed");
        Assert.assertEquals(calendarEventsPage.title.getText(), "Testers meeting");
        Assert.assertEquals(calendarEventsPage.description.getText(), "This is a a weekly testers meeting");
        Assert.assertEquals(calendarEventsPage.start.getText(), "Nov 27, 2019, 9:30 PM");
        Assert.assertEquals(calendarEventsPage.end.getText(),"Nov 27, 2019, 10:30 PM");
        Assert.assertEquals(calendarEventsPage.allDayEvent.getText(), "No");
        Assert.assertEquals(calendarEventsPage.organizer.getText(), "Stephan Haley");
        Assert.assertEquals(calendarEventsPage.guests.getText(), "Tom Smith");
        Assert.assertEquals(calendarEventsPage.recurrence.getText(), "Weekly every 1 week on Wednesday");
        Assert.assertEquals(calendarEventsPage.callViaHangout.getText(), "No");
        extentLogger.info("PASSED");
    }

}
