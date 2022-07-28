import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Paramterized {
    @Test(expectedExceptions = ArithmeticException.class)
    public void numericTest() {
        int i = 1 / 0;
        System.out.println(i);
        System.out.println("EXCEPTION!!!");
    }

    @Test(timeOut = 500)
    public void timeTest() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method successfully tested");
    }
        @Test(invocationCount = 5,invocationTimeOut = 6000)
    public void sample() throws Exception {
            System.out.println("Hello!!");
            Thread.sleep(1000);
        }
        WebDriver driver;
    @Parameters({"browser"})
    @Test
    public void test(String browser){
        System.out.println("Running browser is :="+browser);
        if(browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/ishasethia/Downloads/chromedriver");
            driver=new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            driver=new FirefoxDriver();
        }
        else if(browser.equals("ie"))
        {
            driver=new InternetExplorerDriver();
        }
        else if(browser.equals("safari")){
            driver = new SafariDriver();
        }
        driver.get("https://www.facebook.com/login/");
    }
    @Parameters({"username","password"})
    @Test(priority = 2)
    public void loginTest(String username, String password){
        System.out.println("username:"+username+" & password: "+password);
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);

    }




}
