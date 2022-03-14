import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfPage profPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profPage = new ProfPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://passport.yandex.ru/auth");
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin("tester5819");
        loginPage.clickButton();
        loginPage.inputPassword("QWEasd123456");
        loginPage.clickButton();
    }
    @AfterClass
    public static void tearDown() {
        profPage.entryMenu();
        profPage.userLogout();
        driver.quit();
    }
}