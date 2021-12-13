package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
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

    @FindBy (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdraw;
    @FindBy (xpath = "//input[@placeholder='amount']")
    WebElement withdrawAmount;
    @FindBy (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawBtn;

    @FindBy (xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifyWithdarwText;


     public void selectCustomerName(String value){
         selectByValueFromDropDown(lcDropDownCustomer,value);

     }
     public void selectCurrency(String value){
         selectByValueFromDropDown(lcDropDownCurrency,value);

     }
     public void clickOnProcessButton() {
         clickOnElement(lcButtonProcess);

     }
     public void clickOnWithdraw(){
         clickOnElement(withdraw);

     }
    public void sendWithdrawAmount(String value){sendTextToElement(withdrawAmount,value);

    }

    public void clickOnWithdrawTabButton(){
         clickOnElement(withdrawBtn);

    }

    public String verifyMoneyWithdrawSuccessfullyMessage(){
         String message= getTextFromElement(verifyWithdarwText);
        return message;
    }

}
