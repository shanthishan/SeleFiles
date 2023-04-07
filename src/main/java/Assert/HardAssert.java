package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert{
    @Test
    public void test()
    {
        String expected="Home page";
        Assert.assertEquals(expected,"login page","unauthorized login");
        //In Hard Assert not equal both (expected,actual) not exceuted once error appear.s2 is title of error
        //the code throw it error after the code was not executed this is hard assert.
        //the code throw an error the code will be executed this is soft assert.

        System.out.println("end");
    }
}
