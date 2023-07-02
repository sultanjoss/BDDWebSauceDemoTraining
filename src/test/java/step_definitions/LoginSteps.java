package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User already on login page")
    public void verifyLoginPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }
    @Then("User already on product page")
    public void verifyDashboard(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDshboard());
    }
    @Then("User see {string} as eror text on login page")
    public void verifErorText(String A){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(A, loginPage.textEror());
    }
}
