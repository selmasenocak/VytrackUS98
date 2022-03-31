package vytrack.us98.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vytrack.us98.utilities.Driver;

public class LogInPage {
    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement loginButton;


    public void login(String username, String password) {
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }
}