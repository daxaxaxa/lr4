import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Locators;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Smoke4Test implements Locators {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void additionalTest() {
        driver.get("https://www.oracle.com/");
        driver.findElement(HomePage.INDUSTRIES_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(ProductsPage.ORACLE_INDUSTRY_LAB).click();
                String pageTitle = driver.getTitle();
                Assert.assertEquals(pageTitle, "Industry Innovation Lab | Oracle");

                // Closing the Child Window.
                driver.close();
            }
        }


        // Add more actions if needed
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
