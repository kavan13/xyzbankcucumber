package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
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

    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcTabAddCustomer);

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


    }
}
