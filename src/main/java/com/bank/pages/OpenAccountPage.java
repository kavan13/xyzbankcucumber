package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

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
         log.info("Select customer Name : " + lcDropDownCustomer.toString());
     }
     public void selectCurrency(String value){
         selectByValueFromDropDown(lcDropDownCurrency,value);
         log.info("Select Currency : " + lcDropDownCurrency.toString());
     }
     public void clickOnProcessButton() {
         clickOnElement(lcButtonProcess);
       //  log.info("Clicking on Process Button : " + lcButtonProcess.toString());
     }
     public void clickOnWithdraw(){
         clickOnElement(withdraw);
         log.info("Clicking on withdraw : " + withdraw.toString());
     }
    public void sendWithdrawAmount(String value){
         sendTextToElement(withdrawAmount,value);
        log.info("Enter Withdraw amount : " + withdrawAmount.toString());
    }

    public void clickOnWithdrawTabButton(){
         clickOnElement(withdrawBtn);
        log.info("Clicking on withdraw button : " + withdrawBtn.toString());
    }

    public String verifyMoneyWithdrawSuccessfullyMessage(){
         String message= getTextFromElement(verifyWithdarwText);
        log.info("Verify Text withdraw successfully : " + verifyWithdarwText.toString());
        return message;
    }

}
