package ExamplesofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class addtocart extends BaseClass{

    @Test
    public void items() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement computer=driver.findElement(By.xpath("//a[text()='Computers ']"));
        WebElement desk=driver.findElement(By.xpath("(//a[text()='Desktops '])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(computer).build().perform();
        Thread.sleep(2000);

desk.click();
        driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement ram=driver.findElement(By.xpath("(//label[@class='text-prompt'])[2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ram );
       WebElement ra=driver.findElement(By.id("product_attribute_2"));
        Select se=new Select(ra);
        List<WebElement> list=se.getOptions();
        for (WebElement text:list) {
            se.selectByVisibleText("2 GB");

        }
driver.findElement(By.id("product_attribute_3_6")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       driver.findElement(By.id("add-to-cart-button-1")).click();
        Thread.sleep(50000);
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();

        // WebDriverWait wait= new WebDriverWait(driver,20);
//WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(desk));





    }
}
