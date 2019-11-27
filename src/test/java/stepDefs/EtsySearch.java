package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EtsyHomePage;
import utilities.BrowserUtils;
import utilities.Configuration;
import utilities.Driver;

import java.io.IOException;

public class EtsySearch {
    EtsyHomePage etsyHomePage = new EtsyHomePage();
    @Given("^Navigate to home page$")
    public void navigateToHomePage() throws IOException {
        Driver.driver.get(Configuration.getProperties("EtsyUrl"));
    }

    @Then("^In search field search for \"([^\"]*)\"$")
    public void inSearchFieldSearchFor(String arg0) throws Throwable {
        etsyHomePage.searchField.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("^Choose option Free Shipping$")
    public void chooseOptionFreeShipping() {
        Actions actions = new Actions(Driver.driver);
        actions.moveToElement(etsyHomePage.freeShippingButton).perform();
        actions.click().perform();
    }

    @And("^Verify all products on the page have a free shipping text$")
    public void verifyAllProductsOnThePageHaveAFreeShippingText() {
        for (WebElement element: etsyHomePage.freeShippingLabes){
            Assert.assertTrue(element.getText().contains("FREE shipping"));
        }
    }


    @And("^User click on Over Price checkbox$")
    public void userClickOnOverPriceCheckbox() {
        WebDriverWait wait = new WebDriverWait(Driver.driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(etsyHomePage.over1000CheckBox));
        etsyHomePage.over1000CheckBox.click();
    }

    @Then("^User verifies all items prices are over that price$")
    public void userVerifiesAllItemsPricesAreOverThatPrice() {
        for(WebElement element: etsyHomePage.resultPrice){
            if(!element.getText().isEmpty()) {
                double price = Double.parseDouble(element.getText().replace(",", ""));
                System.out.println(price);
                Assert.assertTrue(price >= 1000);
            }
        }
    }
}
