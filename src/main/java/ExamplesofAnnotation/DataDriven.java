package ExamplesofAnnotation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven extends BaseClass
{
    @Test(dataProvider = "login")
    public void Test(String email, String password) throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/login");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        System.out.println(driver.getTitle());
        String exp = "nopCommerce demo store";
        Thread.sleep(2000);
        Reporter.log("email" +email);
        Reporter.log("Password"+password);

        Assert.assertEquals(exp, driver.getTitle());

    }
    @DataProvider(name="login")
    public Object[][] data()
    {
        Object[][] logindata= new Object[3][2];
        logindata[0][0]="myemail@gmail.com";
        logindata[0][1]="123";

        logindata[1][0]="test@gmail.com";
        logindata[1][1]="test123";

        logindata[2][0]="demo@gmail.com";
        logindata[2][1]="test123";

        return logindata;
    }

}

