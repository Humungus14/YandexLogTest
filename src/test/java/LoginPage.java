import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//input[@id='passp-field-login']")
    private WebElement logField;
    @FindBy(xpath = "//button[@id='passp:sign-in']")
    private WebElement logButton;
    @FindBy(xpath = "//input[@id='passp-field-passwd']")
    private WebElement passField;

    public void inputLogin(String login) {
        logField.sendKeys(login);
    }
    public void inputPassword(String password) {
        passField.sendKeys(password);
    }
    public void clickButton() {
        logButton.click();
    }
}
