package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//button[contains(text(),'Customer Login')]")
    WebElement lcTabCustomerLogin;
    @FindBy (xpath = "//button[contains(text(),'Bank Manager Login')]")
           WebElement lcTabBankManagerLogin;

    @FindBy (xpath = "//button[normalize-space()='Add Customer']")
           WebElement lcTabAddCustomer;


    public void clickOnBankManagerLoginButton(){
        clickOnElement(lcTabBankManagerLogin);
        log.info("Clicking on BankManager button : " + lcTabBankManagerLogin.toString());
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcTabAddCustomer);
        log.info("Clicking on Add Customer : " + lcTabAddCustomer.toString());
    }
    public String actualTextFromPopUp(){
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }

    public String expectedTextFromPopUp(String text){
        return text;
    }

    public void clickonOkfromPopup(){
        acceptAlert();
    }
    public void clickOnCustomerLogin(){
        clickOnElement(lcTabCustomerLogin);
        log.info("Clicking on Customer login : " + lcTabCustomerLogin.toString());
    }
}
