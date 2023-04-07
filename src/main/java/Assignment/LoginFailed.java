package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailed extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmi", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("123!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        WebElement text=driver.findElement(By.id("flash"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"Your username is invalid!\n" +
                "×");

        Thread.sleep(2000);

    }}

