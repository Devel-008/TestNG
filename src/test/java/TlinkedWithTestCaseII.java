import org.testng.annotations.*;

public class TlinkedWithTestCaseII {
    @Test
    void Try()
    {
        System.out.println("Let's try!!");
    }
    @Test
    void AgainTry()
    {
        System.out.println("Let's AGAIN try!!");
    }
    @BeforeTest
    void beforeTest()
    {
        System.out.println("#########BEFORE EVERY TEST############");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("###########AFTER TEST##########");
    }

    @BeforeSuite
    void beforeSuit()
    {
        System.out.println("@@@@@@@@@@@@@@@BEFORE EVERY SUIT@@@@@@@@@@@@@@@");
    }
    @AfterSuite
    void afterSuit()
    {
        System.out.println("@@@@@@@@@@@@@@AFTER EVERY SUIT@@@@@@@@@@@@");
    }
}
