package vytrack.us98.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.us98.utilities.Driver;

public class BasePage {
public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}





    @FindBy(xpath = "(//span[contains(text(),'Fleet')])[1]")
    public WebElement fleetModule;


    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCosts;
}