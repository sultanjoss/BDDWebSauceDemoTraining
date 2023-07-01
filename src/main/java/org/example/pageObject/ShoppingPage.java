package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    public static WebDriver driver;

    public ShoppingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement RemoveItem;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement btnRemoveItem;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement CheckOutPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement CheckInfoFirstName;

    @FindBy(id = "last-name")
    private WebElement CheckInfoLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement CheckInfoZipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContChekc;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement verifTax;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishCheckOut;

    @FindBy(css = "h3")
    private WebElement ErorText;

    public String clickCheckErorText() {
        return ErorText.getText();
    }

    public void clickFinishCheck() {
        finishCheckOut.click();
    }

    public boolean VerifikasiTax(){
        return verifTax.isDisplayed();
    }

    public void clickBtnContCheck() {
        btnContChekc.click();
    }

    public void setFirstName(String FsName) {

        CheckInfoFirstName.sendKeys(FsName);
    }
    public void setLastName(String LsName) {

        CheckInfoLastName.sendKeys(LsName);
    }
    public void setZipKode(String FsName) {

        CheckInfoZipCode.sendKeys(FsName);
    }

    public boolean verifRemoveItem(){
        return RemoveItem.isDisplayed();
    }
    public boolean verifChekOutPage() {
        return CheckOutPage.isDisplayed();
    }

    public void clickBtnRemoveItem(){
        btnRemoveItem.click();
    }
    public void clickBtnCheckOut() {
        btnCheckOut.click();
    }
}

