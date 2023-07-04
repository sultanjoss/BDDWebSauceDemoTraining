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

    @When("User has selected the product list with the option {string}")
    public void produkSelect(String select) {
        AddToCartPage addToCartPage = new AddToCartPage(webDriver);
        addToCartPage.selectFilterProduk(select);
    }

    @And("User selects two products, first Test all the things T-Shirt Red and second Suce Labs Onesie")
    public void inputBaju() {
        AddToCartPage addToCartpage = new AddToCartPage(webDriver);
        addToCartpage.clickAddToCartSatu();
        addToCartpage.clickAddToCartDua();
    }
    @Then("User is already on your cart page")
    public void shoppingPage(){
        AddToCartPage addToCartPage = new AddToCartPage(webDriver);
        addToCartPage.clickShoppingPage();
    }


}
