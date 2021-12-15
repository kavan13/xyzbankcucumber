package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//button[@class='btn logout']")
    WebElement lcTabLogout;
    @FindBy (xpath = "//label[normalize-space()='Your Name :']")
           WebElement lcYourNameText;
    @FindBy (xpath = "//button[normalize-space()='Logout']")
           WebElement lcTabLogoutByXpath;
    @FindBy (xpath = "//button[normalize-space()='Transactions']")
           WebElement lcTabTransactions;
    @FindBy (xpath = "//button[normalize-space()='Deposit']")
           WebElement lcTabDeposit;
    @FindBy (xpath = "//button[normalize-space()='Withdrawl']")
           WebElement lcTabWithdrawl;
    @FindBy (xpath = "//input[@placeholder='amount']")
          WebElement  lcAmountInputBox;
    @FindBy (xpath = "//button[normalize-space()='Deposit']")
           WebElement lcButtonDeposit;
    @FindBy (xpath = "//span[@class='error ng-binding' and contains(text(),'Deposit Successful')]")
           WebElement lcMessageDepositSuccess;
    @FindBy (xpath = "input[placeholder='amount']")
           WebElement lcAmountWithdrawlInputBoxByCss;
    @FindBy (xpath = "button[type='submit']")
           WebElement lcButtonWithdrawalByCss;
    @FindBy (xpath = "//span[@class='error ng-binding']")
           WebElement lcMessageWithdrawalSuccessByXpath;

    public void verifyLogoutButtonDisplay(){
        isDisplayed(lcTabLogout);
    }
    public void clickOnLogoutButton(){
        clickOnElement(lcTabLogout);
        log.info("Clicking on logout link : " + lcTabLogout.toString());
    }
    public void verifyYourNameIsDisplayed(){
        isDisplayed(lcYourNameText);
        log.info("verify Your name display : " + lcYourNameText.toString());
    }
    public void clickOnDepositeButton(){
        clickOnElement(lcButtonDeposit);
        log.info("Clicking on Deposit Button : " + lcButtonDeposit.toString());
    }
    public void enterAmountYouWantToDeposit(String text){
        sendTextToElement(lcAmountInputBox,text);
        log.info("Enter Amount to deposit : " + lcAmountInputBox.toString());
    }
    public String actualSuccessMsg(){

        String message = getTextFromElement(lcMessageWithdrawalSuccessByXpath);
               return message;
    }

}
