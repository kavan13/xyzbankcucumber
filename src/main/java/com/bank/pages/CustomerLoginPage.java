package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "userSelect")
    WebElement lcDropDownYourName;
    @FindBy (xpath = "//button[contains(text(),'Login')]")
           WebElement lcButtonLogin;
    @FindBy (xpath = "//label[normalize-space()='Your Name :']")
           WebElement lcLabelYourName;

    public void selectYourName(int value) {
        selectByIndexFromDropDown(lcDropDownYourName,value);
    }

    public void clickOnLoginButton() {
        clickOnElement(lcButtonLogin);
        log.info("Clicking on login button : " + lcButtonLogin.toString());
    }
}
