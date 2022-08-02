import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    void setup()
    {
        String title="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String text="Search";
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.get("https://www.ebay.com/");
        String actual=d.getTitle();
        Assert.assertEquals(actual,title);
        String aactual=d.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        Assert.assertEquals(aactual,text,"FAILURE");
        d.close();


    }
}
