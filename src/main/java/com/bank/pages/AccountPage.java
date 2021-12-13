package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//label[contains(text(),'Customer :')]")
    WebElement lcCustomerLabel;
    @FindBy (xpath = "//select[@id='userSelect']")
           WebElement lcDropDownCustomer;
    @FindBy (xpath = "//select[@id='currency']")
           WebElement lcDropDownCurrency;
    @FindBy (xpath = "//button[contains(text(),'Process')]")
           WebElement lcButtonProcess;

    @FindBy (xpath = "//select[@id='userSelect']")
    WebElement searchCustomer1;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement loginbutton;


   public void selectCustomeFromDropDown(int value){
       selectByIndexFromDropDown(searchCustomer1,value );


   }

public void clickOnLoginButton(){
       clickOnElement(loginbutton);

}

}
