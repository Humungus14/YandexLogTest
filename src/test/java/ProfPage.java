import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfPage {
    public WebDriver driver;
    public ProfPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//header/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")
    private WebElement userAccount;
    @FindBy(xpath = "//header/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/ul[1]/li[6]/a[1]")
    private WebElement logoutButton;
    public void entryMenu() {userAccount.click();}
    public void userLogout() {logoutButton.click();}
}
