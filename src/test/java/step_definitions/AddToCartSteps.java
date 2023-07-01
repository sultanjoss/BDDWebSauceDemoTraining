package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AddToCartPage;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {
    public WebDriver webDriver;

    public AddToCartSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("The user has selected the product list with the option {string}")
    public void produkSelect(String select) {
        AddToCartPage addToCartPage = new AddToCartPage(webDriver);
        addToCartPage.selectFilterProduk(select);
    }

    @Then("User selects two items in want")
    public void inputBaju() {
        AddToCartPage addToCartpage = new AddToCartPage(webDriver);
        addToCartpage.clickAddToCartSatu();
        addToCartpage.clickAddToCartDua();
    }
    @And("User is already on shopping chart page")
    public void shoppingPage(){
        AddToCartPage addToCartPage = new AddToCartPage(webDriver);
        addToCartPage.clickShoppingPage();
    }


}
