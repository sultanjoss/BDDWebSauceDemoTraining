package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ShoppingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShoppingSteps {
    public WebDriver webDriver;

    public ShoppingSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @Then("The user removes an item that does not become purchased")
    public void verifyRemoveItem(){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        Assert.assertTrue(shoppingPage.verifRemoveItem());
        shoppingPage.clickBtnRemoveItem();
    }
    @And("The user checks out to buy the item he wants")
    public void verifyCheckOut(){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        shoppingPage.clickBtnCheckOut();
    }
    @Given("The user is already on the checkout page")
    public void verifyCheckOutPage(){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        Assert.assertTrue(shoppingPage.verifChekOutPage());
    }
    @When("User input {string} then {string} and enter {string} as zip kode")
    public void InputCheckOutPage(String fsname, String lsname, String zipkode){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        shoppingPage.setFirstName(fsname);
        shoppingPage.setLastName(lsname);
        shoppingPage.setZipKode(zipkode);
        shoppingPage.clickBtnContCheck();
    }
    @Then("User see {string} as eror text on checkout page")
    public void verifErorText(String Eror){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        Assert.assertEquals(Eror, shoppingPage.clickCheckErorText());
    }

    @Then("Verify if the tax a on the ordered item is displayed")
    public void VerifTAx(){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        Assert.assertTrue(shoppingPage.VerifikasiTax());
    }
    @And("User finish checkout")
    public void FinishCheckout(){
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        shoppingPage.clickFinishCheck();
    }


}


