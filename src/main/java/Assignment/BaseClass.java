package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    protected WebDriver driver;

    @BeforeSuite
    public void beforesuite() {
        System.out.println("Open Browser");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("Close Browser");
        driver.quit();
    }
}