package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ViewAllOrdersPage;
import pages.OrdersPage;

import java.util.List;
import java.util.Map;

public class AddingOrderSteps {

    ViewAllOrdersPage hP = new ViewAllOrdersPage();
    OrdersPage ordersPage = new OrdersPage();
    int orderNumber;
    int names;

    @Then("^User clicks on Order$")
    public void user_clicks_on_Order() throws Throwable {
        hP.orderButton.click();
        orderNumber=hP.orderRows.size();
    }

    @Then("^User creates new order$")
    public void user_creates_new_order(DataTable dataTable) throws Throwable {
        List<Map<String, Object>> listOfMaps = dataTable.asMaps(String.class, Object.class);
        Select select = new Select(ordersPage.productSelectButton);
        select.selectByVisibleText(listOfMaps.get(0).get("Product Name").toString());
        ordersPage.quantity.sendKeys(listOfMaps.get(0).get("Quantity").toString());
        ordersPage.customerName.sendKeys(listOfMaps.get(0).get("Customer Name").toString());
        ordersPage.street.sendKeys(listOfMaps.get(0).get("Street").toString());
        ordersPage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        ordersPage.state.sendKeys(listOfMaps.get(0).get("State").toString());
        ordersPage.zip.sendKeys(listOfMaps.get(0).get("Zip").toString());
        ordersPage.card.click();
        ordersPage.cardNumber.sendKeys(listOfMaps.get(0).get("Card Nr").toString());
        ordersPage.expirationDate.sendKeys(listOfMaps.get(0).get("Expire date (mm/yy)").toString());
        ordersPage.processButton.click();
    }

    @Then("^User verifies order is created$")
    public void user_verifies_order_is_created() throws Throwable {
        hP.allOrdersButton.click();
        Assert.assertNotEquals(orderNumber, hP.orderRows.size());
    }

    @Then("^User verifies order was not created$")
    public void userVerifiesOrderWasNotCreated() {
        hP.allOrdersButton.click();
        Assert.assertEquals(orderNumber, hP.orderRows.size());

    }

    @And("^User deletes \"([^\"]*)\" from table$")
    public void userDeletesFromTable(String name) throws Throwable {
        for (int i=0;i<hP.namesList.size();i++){
            if(hP.namesList.get(i).getText().equalsIgnoreCase(name)){
                hP.checkBoxList.get(i).click();
            }
        }
        hP.deleteButton.click();
    }

    @Then("^Validate that \"([^\"]*)\" is deleted$")
    public void validateThatIsDeleted(String name) throws Throwable {
        for (int i=0;i<hP.namesList.size();i++){
            Assert.assertFalse("The "+name+" is in the list",hP.namesList.get(i).getText().equalsIgnoreCase(name));

        }
    }
}
