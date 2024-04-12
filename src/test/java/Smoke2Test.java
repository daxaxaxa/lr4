import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Locators;
import java.util.concurrent.TimeUnit;

public class Smoke2Test implements Locators {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testJavaDownloadsPage() {
        driver.get("https://www.oracle.com/");
        driver.findElement(Locators.HomePage.SEARCH_ICON).click();
        driver.findElement(Locators.HomePage.SEARCH_INPUT).sendKeys("java");
        driver.findElement(Locators.HomePage.SEARCH_INPUT).submit();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Oracle.com Search");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

