package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //Make Browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(1000);

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mike Smith");

        //Proper way
//        WebElement emailButton = driver.findElement(By.name("email"));
//        emailButton.sendKeys("mike@gmail.com");

        //Lazy way - without saving the variable for further use
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        Thread.sleep(1000);
        driver.quit();

    }
}
