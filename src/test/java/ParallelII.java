import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelII {
    WebDriver driver;
    @Test
    void LoginTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/ishasethia/Downloads/chromedriver");
        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("Admin");

        driver.findElement(By.id("pass")).sendKeys("pass123");
        driver.findElement(By.id("loginbutton")).click();

        Assert.assertEquals(driver.getTitle(),"Log in to Facebook");
        Thread.sleep(5000);
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
