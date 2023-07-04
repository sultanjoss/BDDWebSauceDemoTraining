package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {
    public WebDriver webDriver;

    public LogoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User is already on the last checkout page")
    public void verifyCheckoutEndPage(){
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyChekOutEndPage());
    }
    @And("User clicks the menu button")
    public void ClickBtnMenu() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnMenu();
    }
    @Then("User click logout option")
    public void ClickBtnLogout(){
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnLogout();

    }
    @Then("User returns to the login page")
    public void verifbackTologinPage(){
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyBacktoLoginPage());
    }
}
