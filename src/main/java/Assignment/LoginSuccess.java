package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccess extends BaseClass {
    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        WebElement text=driver.findElement(By.id("flash"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"You logged into a secure area!\n" +
                "×");

        Thread.sleep(2000);
    }
}