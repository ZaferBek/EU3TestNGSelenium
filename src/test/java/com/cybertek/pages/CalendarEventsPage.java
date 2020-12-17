package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//div[@class='btn-group']//button[@data-toggle='dropdown']")
    public WebElement viewPerPage;

    @FindBy(xpath = "//label[@class='dib'][2]")
    public WebElement pageOf;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecords;

    @FindBy(xpath = "//i[@class='fa-repeat']")
    public WebElement refreshButton;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> rowNumber;

    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "//tbody/tr/td[text()='Testers meeting']")
    public WebElement testersMeeting;

    @FindBy(xpath = "//div[1]/div[1]/div/div[@class='control-label']")
    public WebElement title;

    @FindBy(xpath = "//div/p/span")
    public WebElement description;

    @FindBy(xpath = "//div[1]/div[3]/div/div[@class='control-label']")
    public WebElement start;

    @FindBy(xpath = "//div[1]/div[4]/div/div[@class='control-label']")
    public WebElement end;

    @FindBy(xpath = "//div[1]/div[5]/div/div[@class='control-label']")
    public WebElement allDayEvent;

    @FindBy(xpath = "//div[6]/div/div/div[@class='calendar-event-organizer']")
    public WebElement organizer;

    @FindBy(xpath = "//span/a")
    public WebElement guests;

    @FindBy(xpath = "//div[1]/div[8]/div/div[@class='control-label']")
    public WebElement recurrence;

    @FindBy(xpath = "//div[2]/div/div/div[@class='control-label']")
    public WebElement callViaHangout;

}