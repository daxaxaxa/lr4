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

public class Smoke1Test implements Locators {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAIAndMachineLearningPage() {
        driver.get("https://www.oracle.com/");
        driver.findElement(Locators.HomePage.PRODUCTS_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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
                driver.findElement(Locators.ProductsPage.AI_AND_MACHINE_LEARNING_LINK).click();
                String pageTitle = driver.getTitle();
                Assert.assertEquals(pageTitle, "Artificial Intelligence (AI) | Oracle");

                // Closing the Child Window.
                driver.close();
            }
        }

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

