package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyHomePage {

    WebDriver driver;

    public EtsyHomePage(){
        this.driver= Driver.driverSetup("Chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchField;

    @FindBy(xpath = "//input[@name='free_shipping']")
    public WebElement freeShippingButton;

    @FindBy(xpath = "//span[@class='text-body-smaller no-wrap']/span")
    public List<WebElement> freeShippingLabes;

    @FindBy(xpath = "//a[@data-path='Over $1,000']")
    public WebElement over1000CheckBox;

    @FindBy(xpath = "//ul[@class='responsive-listing-grid wt-grid wt-grid--block justify-content-flex-start pl-xs-0']//span[@class='currency-value']")
    public List<WebElement> resultPrice;
}
