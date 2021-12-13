package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
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
    public void clickonOpenAccountPage(){clickOnElement(lcTabOpenAccount);
          }
    public void clickOnCustomer(){clickOnElement(lcTabCustomer);
    }


}
