package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
//        //We have to enter this line every time we want to open Chrome
//        //hey webdrivermanager, can you make chrome for me ready for automation
//        WebDriverManager.chromedriver().setup();
//
//        //Webdriver represent the browser
//        //We are creating Driver for Crome browser
//        //new ChromeDriver() --> this part will open chrome browser
//        WebDriver driver=new ChromeDriver();
//
//        //.get(url) method used for navigation to page
//        driver.get("https://www.cybertekschool.com");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");


    }

}
