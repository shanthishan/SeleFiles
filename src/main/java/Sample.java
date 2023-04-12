import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample {
    WebDriver driver;
    @BeforeSuite
    public void open()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
    @Test
    public void Browser()
    {
        driver.get("https://www.flipkart.com/");
    }
    @AfterSuite
    public void close()
    {
        driver.quit();
    }
}
