package vytrack.us98.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.us98.utilities.Driver;


public class VehicleColumnsPage {
    public VehicleColumnsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="(//span[@class='title title-level-1'])[2]")
     public WebElement fleetOptions;

    @FindBy(xpath ="(//span[@class='title title-level-2'])[5]")
    public WebElement vehicleCostsOption;

    @FindBy(xpath ="(//span[@class='grid-header-cell__label'])[1]")
    public WebElement typeColumn;

    @FindBy(xpath ="(//span[@class='grid-header-cell__label'])[2]")
    public WebElement totalPriceColumn;

    @FindBy(xpath ="(//span[@class='grid-header-cell__label'])[3]")
    public WebElement dateColumn;
    }
