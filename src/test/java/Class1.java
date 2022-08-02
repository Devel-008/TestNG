import org.testng.annotations.Test;
public class Class1
{

    @Test(description="This is testcase1")
    public void testcase1()
    {
        System.out.println("HR");
    }
    @Test(description="This is testcase2")
    public void testcase2()
    {
        System.out.println("Software Developer");
    }
    @Test(description="This is testcase3")
    public void testcase3()
    {
        System.out.println("QA Analyst");
    }
    @Test
    public void WebStudentLogin()
    {
        System.out.println("Student login through web");
    }
    @Test
    public void MobileStudentLogin()
    {
        System.out.println("Student login through mobile");
    }
    @Test(dependsOnMethods= {"WebStudentLogin"},priority = 1)
    public void APIStudentLogin()
    {
        System.out.println("Student login through API");
    }
}  