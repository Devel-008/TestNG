import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel {
    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/ishasethia/Downloads/chromedriver");

        driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement logo = driver.findElement(By.xpath( "/html/body/div[1]/div[2]/div/img"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }
    @Test
    void homepageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/ishasethia/Downloads/chromedriver");

        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
         Thread.sleep(5000);
    }
    @Test
    void homePageTitle()
    {
        System.setProperty("webdriver.chrome.driver","/Users/ishasethia/Downloads/chromedriver");
        driver=new ChromeDriver();
    }
    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }


}
