package vytrack.us98.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.us98.utilities.Driver;

public class CheckBoxPage {
    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath ="(//button[@class='btn btn-default btn-small dropdown-toggle']//input)")
    public WebElement checkBox;

    @FindBy(xpath ="(//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction'])")
    public WebElement allCheckBox;
}
