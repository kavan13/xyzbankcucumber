package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//button[normalize-space()='Add Customer']")
    WebElement lcTabAddCustomer;
    @FindBy (xpath = "//button[normalize-space()='Open Account']")
           WebElement lcTabOpenAccount;
    @FindBy (xpath = "//button[normalize-space()='Customers']")
           WebElement lcTabCustomer;

    public void clickOnAddCustomer(){clickOnElement(lcTabAddCustomer);

    }
    public void clickonOpenAccountPage(){
        clickOnElement(lcTabOpenAccount);
        log.info("Clicking on Open Account : " + lcTabOpenAccount.toString());
    }
    public void clickOnCustomer(){clickOnElement(lcTabCustomer);
    }


}
