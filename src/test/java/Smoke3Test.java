import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Locators;
import java.util.concurrent.TimeUnit;

public class Smoke3Test implements Locators {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSignIn() {
        driver.get("https://www.oracle.com/");
        driver.findElement(Locators.HomePage.VIEW_ACCOUNTS_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SignInPage.SIGN_IN_BUTTON).click();
        driver.findElement(Locators.SignInPage.EMAIL_INPUT).sendKeys("a.margulis2002@gmail.com");
        driver.findElement(Locators.SignInPage.PASSWORD_INPUT).sendKeys("2002_Alex_2002@");
        driver.findElement(Locators.SignInPage.ACC_SING_IN_BUTTON).click();
        // Assume successful sign-in means redirecting to a new page with specific elements
        driver.findElement(Locators.HomePage.VIEW_ACCOUNTS_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(SignInPage.MY_ACC_BUTTON).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Oracle | Update Account");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

