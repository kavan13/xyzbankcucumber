package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
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

    }
    public void enterYourLastName(String name){
        sendTextToElement(lcLastNameInputBox,name);

    }
    public void enterYourPostalCode(String name){
        sendTextToElement(lcPostCodeInputBox,name);

    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcAddCustomerButtonByCss);

    }

}
