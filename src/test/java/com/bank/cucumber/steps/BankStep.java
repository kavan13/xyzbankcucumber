package com.bank.cucumber.steps;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on bank manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new HomePage().clickOnAddCustomerButton();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname)  {
        new AddCustomerPage().enterYourFirstName(firstname);

    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname)  {
        new AddCustomerPage().enterYourLastName(lastname);
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode)  {
        new AddCustomerPage().enterYourPostalCode(postcode);
    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^pop up message display$")
    public void popUpMessageDisplay() {
        Assert.assertEquals(new HomePage().actualTextFromPopUp(), new HomePage().expectedTextFromPopUp("Customer added successfully with customer id :6"),"Popup message not matched");

    }

    @Then("^click on ok button on popup$")
    public void clickOnOkButtonOnPopup() {
        new HomePage().clickonOkfromPopup();
    }

    @When("^I click on open account tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickonOpenAccountPage();
    }



    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency)  {
      new OpenAccountPage().selectCurrency(currency);
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("^I see a pop up message display$")
    public void iSeeAPopUpMessageDisplay() {
        Assert.assertEquals(new HomePage().actualTextFromPopUp(), new HomePage().expectedTextFromPopUp("Account created successfully with account Number :1016"),"Popup message not matched");

    }

    @And("^I search for customer name \"([^\"]*)\"$")
    public void iSearchForCustomerName(String value)  {
        new OpenAccountPage().selectCustomerName(value);

    }

    @Given("^I click on customer login tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^I verify logout tab displayed$")
    public void iVerifyLogoutTabDisplayed() {
        new CustomersPage().verifyLogoutButtonDisplay();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new CustomersPage().clickOnLogoutButton();
    }

    @Then("^I see your name text displayed$")
    public void iSeeYourNameTextDisplayed() {
        new CustomersPage().verifyYourNameIsDisplayed();
    }

    @And("^I click on deposit tab$")
    public void iClickOnDepositTab() {
        new CustomersPage().clickOnDepositeButton();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount)  {
        new CustomersPage().enterAmountYouWantToDeposit(amount);
    }

    @Then("^I clcik on deposit button$")
    public void iClcikOnDepositButton() {
        new CustomersPage().clickOnDepositeButton();
    }

    @And("^I click on withdraw$")
    public void iClickOnWithdraw() {
        new OpenAccountPage().clickOnWithdraw();
    }

    @And("^I enter withdraw amount \"([^\"]*)\"$")
    public void iEnterWithdrawAmount(String value) {
        new OpenAccountPage().sendWithdrawAmount(value);
    }

    @And("^I click on withdraw button$")
    public void iClickOnWithdrawButton() {
        new OpenAccountPage().clickOnWithdrawTabButton();
    }

    @Then("^I see message transaction successful$")
    public void iSeeMessageTransactionSuccessful() {
        String expectedText = "Transaction successful";
        String actualText = new OpenAccountPage().verifyMoneyWithdrawSuccessfullyMessage();
        org.junit.Assert.assertEquals(actualText,expectedText);
    }
}
