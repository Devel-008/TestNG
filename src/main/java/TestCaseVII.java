import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Assertion
/*class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message) {
        this.message = message;
    }

    // prints the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}*/
public class TestCaseVII {
    /*String message = "Manisha";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        Assert.assertEquals("Manisha ", messageUtil.printMessage());
    }*/
    @Test
    void hardAssert() {
        //hard-assert
        Assert.assertTrue(true);
        Assert.assertEquals("welcome", "welcome");
        Assert.assertEquals("hello", "hello");
        System.out.println("Successful");
    }

    @Test
    void softAssert() {
        //soft-assert
        SoftAssert s = new SoftAssert();
        System.out.println("softAssert started");
        s.assertTrue(false);
        System.out.println("softAssert executed");
    }

}
