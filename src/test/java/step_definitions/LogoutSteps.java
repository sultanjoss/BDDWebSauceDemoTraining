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
    @Given("User is already on the last checkout page")
    public void verifyCheckoutEndPage() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyChekOutEndPage());
        Thread.sleep(1000);
    }
    @When("The user clicks the menu button")
    public void ClickBtnMenu() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnMenu();
        Thread.sleep(1000);
    }
    @Then("User click logout option")
    public void ClickBtnLogout() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnLogout();
        Thread.sleep(1000);
    }
    @And("The user returns to the login page")
    public void verifbackTologinPage() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyBacktoLoginPage());
        Thread.sleep(1000);
    }
}
