package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));
        dropdownElement.click();

        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());

        for (WebElement dropdownOption : dropdownOptions) {
            System.out.println(dropdownOption.getText());
        }

    }

    @Test
    public void ZaferTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//*[@id='dropdown']"));
        element.click();

        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"dropdown\"]/option"));
        System.out.println("option.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }

        Select simpleDropdown = new Select(element);
        simpleDropdown.selectByVisibleText("Option 1");
        Thread.sleep(1000);

        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
        Select yearDropdown = new Select(year);
        yearDropdown.selectByVisibleText("1981");
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select monthDropdown = new Select(month);
        monthDropdown.selectByVisibleText("April");
        Thread.sleep(1000);

        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        Select dayDropdown = new Select(day);
        dayDropdown.selectByVisibleText("27");
        Thread.sleep(1000);

        WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select stateDropdown = new Select(state);
        stateDropdown.selectByVisibleText("Pennsylvania");
        Thread.sleep(1000);

        WebElement language = driver.findElement(By.xpath("//option[@value='java']"));
        language.click();

        WebElement website = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        website.click();
        List<WebElement> webOptions = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
        for (WebElement webOption : webOptions) {
            System.out.println("webOption.getText() = " + webOption.getText());
        }

//        Select webDropdown = new Select(website);
//        webDropdown.selectByVisibleText("Google");
//        Thread.sleep(2000);

    }
}
