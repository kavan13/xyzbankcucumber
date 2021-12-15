package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@placeholder='First Name']")
    WebElement lcFirstNameInputBox;
    @FindBy (xpath = "//input[@placeholder='Last Name']")
           WebElement lcLastNameInputBox;
    @FindBy (xpath = "//input[@placeholder='Post Code']")
           WebElement lcPostCodeInputBox;
    @FindBy (xpath = "//button[@type='submit']")
           WebElement lcAddCustomerButtonByCss;
    @FindBy (xpath = "//label[contains(text(),'First Name :')]")
           WebElement lcFirstNameLabel;


    public void enterYourFirstName(String name){
        sendTextToElement(lcFirstNameInputBox,name);
        log.info("Enter First Name : " + lcFirstNameInputBox.toString());

    }
    public void enterYourLastName(String name){
        sendTextToElement(lcLastNameInputBox,name);
        log.info("Enter Last name : " + lcLastNameInputBox.toString());
    }
    public void enterYourPostalCode(String name){
        sendTextToElement(lcPostCodeInputBox,name);
        log.info("Enter Postal Code : " + lcPostCodeInputBox.toString());
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcAddCustomerButtonByCss);
      //  log.info("Click on Add Customer : " + lcAddCustomerButtonByCss.toString());
    }

}
