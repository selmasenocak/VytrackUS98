package vytrack.us98.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import vytrack.us98.pages.CheckBoxPage;
import vytrack.us98.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CheckBox_StepDefinition {
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    @Given("Click the first checkbox")
    public void click_the_first_checkbox() throws InterruptedException {
        Thread.sleep(2000);

    checkBoxPage.checkBox.click();

    Thread.sleep(2000);
    }
    @Then("Verify all the vehicle costs are checked")
    public void verify_all_the_vehicle_costs_are_checked() {


        int size = checkBoxPage.allCheckBox.size();

       for(int i = 0; i<size; i++) {

            Assert.assertTrue(checkBoxPage.allCheckBox.get(i).isSelected());

        }






    }

}