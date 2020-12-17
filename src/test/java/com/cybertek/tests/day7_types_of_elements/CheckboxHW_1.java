package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxHW_1 {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkboxMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));
        Assert.assertFalse(checkboxMessage.isDisplayed(),"Verify 'Success - Check box is checked' is NOT displayed");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkbox.click();
        Assert.assertTrue(checkboxMessage.isDisplayed(), "Verify 'Success - Check box is checked' is displayed");

        Thread.sleep(2000);
        driver.quit();
    }

//    1.Open Chrome browser
//    2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
//    3.Verify “Check All” button text is “Check All”
//    4.Click to “Check All” button
//    5.Verify all check boxes are checked
//    6.Verify button text changed to “Uncheck All”
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        String actual=checkAllButton.getText();
        System.out.println("actual = " + actual);
        String expected = "Check All";

        Assert.assertTrue(actual.contains(expected));


    }
}
