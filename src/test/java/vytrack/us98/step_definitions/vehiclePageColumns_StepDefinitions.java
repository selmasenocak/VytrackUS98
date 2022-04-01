package vytrack.us98.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import vytrack.us98.pages.BasePage;
import vytrack.us98.pages.LogInPage;
import vytrack.us98.pages.VehicleColumnsPage;
import vytrack.us98.utilities.ConfigurationReader;
import vytrack.us98.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vehiclePageColumns_StepDefinitions {
    VehicleColumnsPage vehicleColumnsPage=new VehicleColumnsPage();
    LogInPage logInPage= new LogInPage();
    BasePage basePage = new BasePage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

    }

    @Given("user enters below {string} and {string}")
    public void user_enters_below_and(String username, String password){
        logInPage.login(username,password);
    }

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        String expectedTitle="Dashboard";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    @Given("users click the Vehicle Costs under the Fleet")
    public void users_click_the_vehicle_costs_under_the_fleet() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePage.fleetModule).perform();
        basePage.vehicleCosts.click();
    }

    @Then("users verify there are {int} columns on the table:TYPE, TOTAL PRICE, DATE")
    public void users_verify_there_are_columns_on_the_table_type_total_price_date(Integer int1) {

        List<String> expectedList = new ArrayList<>(Arrays.asList("TYPE", "TOTAL PRICE", "DATE"));

        List<WebElement> actualList = new ArrayList<>();

        actualList.add(vehicleColumnsPage.typeColumn);
        actualList.add(vehicleColumnsPage.totalPriceColumn);
        actualList.add(vehicleColumnsPage.dateColumn);



    }

}



