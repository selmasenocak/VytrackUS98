package vytrack.us98.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import vytrack.us98.pages.CheckBoxPage;
import vytrack.us98.utilities.Driver;

import java.util.List;

public class CheckBox_StepDefinition {
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    @Given("Click the first checkbox")
    public void click_the_first_checkbox() {
    checkBoxPage.checkBox.click();
    }
    @Then("Verify all the vehicle costs are checked")
    public void verify_all_the_vehicle_costs_are_checked() {

        List <WebElement> AllCheckboxes = (List<WebElement>) checkBoxPage.allCheckBox;

        int size = AllCheckboxes.size();
        System.out.println(size);


        for(int i = 0; i<size; i++) {


            Assert.assertTrue(checkBoxPage.allCheckBox.isSelected());

            System.out.println(AllCheckboxes);

        }



    }

}