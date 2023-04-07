package Assignment;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBox extends BaseClass{
    @Test
    public void check() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        //System.out.println("the checkBoxes are properly checked and unchecked");
        Thread.sleep(2000);
    }
}
