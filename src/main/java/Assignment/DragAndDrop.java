package Assignment;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass{
    @Test
    public void drop()
    {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        driver.findElement(By.id("column-a")).sendKeys("hello");

        //driver.findElement(By.xpath("(//div[@class='column'])[1]")).sendKeys("Hello",Keys.ENTER);
        //driver.findElement(By.xpath("(//div[@class='column'])[2]")).sendKeys("Selenium",Keys.ENTER);
        //WebElement src = driver.findElement(By.xpath("(//div[@class='column'])[1]")).sendKeys("Hello", Keys.ENTER);

        //WebElement des = driver.findElement(By.xpath("(//div[@class='column'])[2]")).sendKeys("selenium",Keys.ENTER);
        //Actions act=new Actions(driver);
        //act.dragAndDrop(src,des).perform();

    }}
