import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseI {
    @Test(priority = 1)
    void test()
    {
        System.out.println("Here Test Starts!!!");
    }
    @Test(priority = 2)
    void testing()
    {
        System.out.println("Testing Processing!!");
    }

    @Test(priority = 3)
    void tester()
    {
        System.out.println("Tester comes in!!!!");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 4)
    void tested()
    {
        System.out.println("~~~~~Test has been tested~~~~~");
    }

}
