package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {
    public static WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilters;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement itemsatu;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement itemdua;

    @FindBy(xpath = "//a[.='2']")
    private WebElement shoppingpage;

    public void selectFilterProduk(String srot) {
        Select b = new Select(selectFilters);
        b.selectByVisibleText(srot);
    }
    public void clickShoppingPage(){
        shoppingpage.click();
    }

    public void clickAddToCartSatu() {
        itemsatu.click();
    }

    public void clickAddToCartDua() {
        itemdua.click();

    }
}
