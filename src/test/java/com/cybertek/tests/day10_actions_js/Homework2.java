package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void TestCase1(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement RegForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        RegForm.click();
        WebElement DoBinput = driver.findElement(By.xpath("//input[@name='birthday']"));
        DoBinput.sendKeys("wrong_dob");

        WebElement message = driver.findElement(By.xpath("//small[text()='The date of birth is not valid']"));
        Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void TestCase2(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement RegForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        RegForm.click();

        WebElement cplus = driver.findElement(By.xpath("//label[text()='C++']"));
        Assert.assertTrue(cplus.isDisplayed());

        WebElement java = driver.findElement(By.xpath("//label[text()='Java']"));
        Assert.assertTrue(java.isDisplayed());

        WebElement javaScript = driver.findElement(By.xpath("//label[text()='JavaScript']"));
        Assert.assertTrue(javaScript.isDisplayed());

    }

    @Test
    public void TestCase3(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement RegForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        RegForm.click();

        WebElement FirstNameInputBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstNameInputBox.sendKeys("z");

        WebElement msg = driver.findElement(By.xpath("//div[1]/div/small[2]"));
        Assert.assertTrue(msg.isDisplayed());
    }

    @Test
    public void TestCase4(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement RegForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        RegForm.click();

        WebElement LastNameInputBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastNameInputBox.sendKeys("z");

        WebElement msg = driver.findElement(By.xpath("//div[2]/div/small[2]"));
        Assert.assertTrue(msg.isDisplayed());
    }
    @Test
    public void TestCase5() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement RegForm = driver.findElement(By.xpath("//a[.='Registration Form']"));
        RegForm.click();

        WebElement FirstNameInputBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstNameInputBox.sendKeys("Zafer");

        WebElement LastNameInputBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastNameInputBox.sendKeys("Bek");

        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='username']"));
        usernameBox.sendKeys("ZaferBek");

        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailBox.sendKeys("zafer207@gmail.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordBox.sendKeys("zafer207");

        WebElement phoneBox = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneBox.sendKeys("571-111-7777");

        WebElement maleButton = driver.findElement(By.xpath("//input[@value='male']"));
        maleButton.click();

        WebElement DoB = driver.findElement(By.xpath("//input[@name='birthday']"));
        DoB.sendKeys("04/27/1981");

        WebElement departmentDropdown = driver.findElement(By.xpath("//select[@name='department']"));
        Select department = new Select(departmentDropdown);
        department.selectByVisibleText("Department of Engineering");

        WebElement JobTitleDropdown = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select job = new Select(JobTitleDropdown);
        job.selectByVisibleText("SDET");

        WebElement language = driver.findElement(By.xpath("//input[@value='java']"));
        language.click();

        WebElement signUpButton = driver.findElement(By.xpath("//*[.='Sign up']"));
        signUpButton.click();

        WebElement msj = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(msj.isDisplayed(),"Verification of success message");
    }

    @Test
    public void TestCase6(){
        driver.get("https://www.fakemail.net/");

        WebElement email = driver.findElement(By.xpath("//span[@class='animace']"));
        String emailAddress = email.getText();
        WebElement copymail = driver.findElement(By.xpath("//div[1]/a[text()='Copy']"));
        copymail.click();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up For Mailing List']"));
        signUp.click();

        WebElement fullName = driver.findElement(By.xpath("//input[@name='full_name']"));
        fullName.sendKeys("Zafer Bek");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys(emailAddress);

        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='wooden_spoon']"));
        signUpButton.click();

        Assert.assertTrue(driver.findElement(By.name("signup_message")).isDisplayed());

        driver.navigate().to("https://www.fakemail.net/");

        WebElement receivedEmail = driver.findElement(By.xpath("//td[@class='from']"));
        Assert.assertTrue(receivedEmail.getText().contains("do-not-reply@practice.cybertekschool.com"));
        receivedEmail.click();

        Assert.assertEquals(driver.findElement(By.xpath("//span[@id ='odesilatel']")).getText(), "do-not-reply@practice.cybertekschool.com");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id ='predmet']")).getText(), "Thanks for subscribing to practice.cybertekschool.com!");
    }

    @Test
    public void TestCase7(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='File Upload']")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\file.txt");
        driver.findElement(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText(), "File Uploaded!");
        Assert.assertTrue(driver.findElement(By.id("uploaded-files")).isDisplayed(),"Verification of uploaded file");
    }

    @Test
    public void TestCase8(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        driver.findElement(By.xpath("//*[@type='button']")).click();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You selected: United States of America");
    }

    @DataProvider
    public Object [][] getData() {
        Object[][] data = new Object[4][2];

        //first column = > error code
        // second column => er¬ror message
        data[0][0] = "200";
        data[0][1] = "This page returned a 200 status code";

        data[1][0] = "301";
        data[1][1] = "This page returned a 301 status code";

        data[2][0] = "404";
        data[2][1] = "This page returned a 404 status code";

        data[3][0] = "500";
        data[3][1] = "This page returned a 500 status code";

        return data;
    }

    @Test(dataProvider = "getData")
    public void statCodes(String code, String message) throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Status Codes']")).click();
        driver.findElement(By.linkText(code)).click();
        String msg = driver.findElement(By.tagName("p")).getText();
        boolean contains = msg.contains(message);
        Assert.assertTrue(contains);
    }

}
