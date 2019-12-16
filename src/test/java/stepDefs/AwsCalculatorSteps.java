package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AwsCalcHomePage;
import utilities.Configuration;
import utilities.Driver;
import utilities.ExcelUtils;

public class AwsCalculatorSteps {

    AwsCalcHomePage awsCalcHomePage = new AwsCalcHomePage();

    @Given("^User navigates to AWS calculator homepage$")
    public void user_navigates_to_AWS_calculator_homepage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("awsUrl"));
    }

    @When("^User adds (\\d+) EC(\\d+) Instances$")
    public void user_adds_EC_Instances(int numberOfInstances, int arg2) throws Throwable {
        awsCalcHomePage.ec2InstanceAdd.click();
        Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[3]")).click();
    }

    @When("^User adds (\\d+) EC(\\d+) Dedicated Hosts$")
    public void user_adds_EC_Dedicated_Hosts(int arg1, int arg2) throws Throwable {
        Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[6]")).click();
        Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[7]")).click();

    }

    @Then("^Total estimated cost has to match with prices on \"([^\"]*)\" \"([^\"]*)\" excel file$")
    public void total_estimated_cost_has_to_match_with_prices_on_excel_file(String excelName, String sheetName) throws Throwable {
        awsCalcHomePage.estimateOfMBillPart.click();
        Thread.sleep(3000);
        String totalActualAmount = awsCalcHomePage.totalAmount.getAttribute("value");
        System.out.println(totalActualAmount);

        ExcelUtils.openExcelFile(excelName,sheetName);
        String ec2Price = ExcelUtils.getValue(1,1);
        double calculatedEc2Price=Double.parseDouble(ec2Price)*2;
        String ec2Hosts = ExcelUtils.getValue(2,1);
        double calcEc2Hosts = Double.parseDouble(ec2Hosts)*2;
        double expectedTotalAmount = calcEc2Hosts+calculatedEc2Price;

        double actualTotalAmount = Double.parseDouble(totalActualAmount);

        Assert.assertEquals(expectedTotalAmount,actualTotalAmount,1);


    }
}
