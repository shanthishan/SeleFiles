package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown extends BaseClass{
    @Test
    public void drop() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.id("dropdown"));
        Select sel=new Select(ele);
        List <WebElement> list= sel.getOptions();
        for (WebElement li:list)
        {
            sel.selectByVisibleText("Option 1");
            sel.selectByVisibleText("Option 2");
        }

        Thread.sleep(5000);


    }
}

