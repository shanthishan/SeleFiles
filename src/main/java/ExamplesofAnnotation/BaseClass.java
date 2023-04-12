package ExamplesofAnnotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    protected WebDriver driver;

    @BeforeSuite
    public void beforesuite() {
        System.out.println("Open Browser");
        WebDriverManager.edgedriver().setup();
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("Close Browser");
        driver.quit();
    }
}