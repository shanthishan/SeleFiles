package Annotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Annotation1234 {
    WebDriver driver;

    @BeforeSuite
    public void  beforesuite()
    {
        System.out.println("openBrowser");

    }
    @Test
    public void test()
    {
        System.out.println("test");

    }
    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("Close Browser");
    }


}
