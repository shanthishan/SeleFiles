package Assignment;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contextmenu extends BaseClass{
    @Test

    public void Menu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions act=new Actions(driver);
        WebElement dri= driver.findElement(By.id("hot-spot"));
        act.contextClick(dri).perform();
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
        Assert.assertEquals(alt.getText(),"You selected a context menu");
        alt.accept();

        Thread.sleep(5000);
    }
}

