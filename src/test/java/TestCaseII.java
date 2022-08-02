import org.testng.annotations.*;

public class TestCaseII {
    @BeforeClass
    void beforeClass(){
        System.out.println("******IM BEFORE CLASS******");
        System.out.println("========================================================================================");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("********IM AFTER CLASS**********");
    }

    @BeforeMethod
    void before() {
        System.out.println("~~~I'M BEFORE EVERYTHING~~~");
    }

    @AfterMethod
    void after() {
        System.out.println("~~I'M AFTER EVERYONE~~~~~~~ ");
        System.out.println("========================================================================================");
    }

    @Test
    void start() {
        System.out.println("TEST IN START STATE!!");
    }

    @Test
    void news() {
        System.out.println("TEST IN NEW STATE!!!");
    }
}
