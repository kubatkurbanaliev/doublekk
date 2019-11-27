package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ViewAllOrdersPage {

    WebDriver driver;

    public ViewAllOrdersPage(){
        this.driver= Driver.driverSetup("Chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//table[@class='SampleTable']//tr")
    public List<WebElement> orderRows;

    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement allOrdersButton;

    @FindBy(xpath = "//table[@class='SampleTable']//tr//td[2]")
    public List <WebElement> namesList;

    @FindBy(xpath = "//table[@class='SampleTable']//tr//td[1]")
    public List <WebElement> checkBoxList;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteButton;

}
