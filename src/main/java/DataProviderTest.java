import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dataSet",priority = 1)
    public void test(String name, String password)
    {
        System.out.println(name+"==>"+password);

    }
    @Test(priority = 2)
    public void break1()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test(dataProvider = "dataSet1",priority = 3)
    public void test1(String name, String password,String test)
    {
       System.out.println(name+"==>"+password+"==>"+test);
    }
    @DataProvider
    public Object[][] dataSet()
    {
        Object[][] dataset=new Object[4][2];
        dataset[0][0]="user1";
        dataset[0][1]="paas1";

        dataset[1][0]="user2";
        dataset[1][1]="paas2";

        dataset[2][0]="user3";
        dataset[2][1]="paas3";

        dataset[3][0]="user4";
        dataset[3][1]="paas4";
        return dataset;
    }
    @DataProvider
   public Object[][] dataSet1()
    {
        return new Object[][]{{"ABC","123","test"},{"DEF","456","test1"},{"GHI","789","test2"},{"JKL","1011","test3"}};
        /*Object[][] dataset=new Object[4][2];
        dataset[0][0]="user1";
        dataset[0][1]="paas1";

        dataset[1][0]="user2";
        dataset[1][1]="paas2";

        dataset[2][0]="user3";
        dataset[2][1]="paas3";

        dataset[3][0]="user4";
        dataset[3][1]="paas4";
        return dataset;*/
    }

}
