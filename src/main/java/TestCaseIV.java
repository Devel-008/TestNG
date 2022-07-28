import org.testng.annotations.Test;
//prioritization
public class TestCaseIV {
    @Test(priority = 5,enabled = false )
    void test()
    {
        System.out.println("Hello test!!");
    }
    @Test(priority = 3)
    void test1()
    {
        System.out.println("Hey test 1 @@@@");
    }
    @Test(priority = -1)
    void test2()
    {
        System.out.println("Hiiii test 2 ######");
    }
    @Test(priority =4 )
    void test3()
    {
        System.out.println("Best of luck test 3  $$$$$$$$$$$");
    }
    @Test(priority =1 )
    void test4()
    {
        System.out.println("All the best test 4 %%%%%%");
    }
}
