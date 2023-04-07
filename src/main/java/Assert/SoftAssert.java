package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
    @Test
    public void test()
    {
        String expected="login page";
        org.testng.asserts.SoftAssert sa= new org.testng.asserts.SoftAssert();
        sa.assertEquals(expected,"home page");
        //evem though error, the code will be executed
        System.out.println("end");
        String str="login page";
        Assert.assertTrue(str.contains("page"));

        //sa.assertAll();
    }
}
