import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

    @Test
    public void SeleniumTest()  {
        System.out.println("Class for testing selenium with Firefox");
    }

    @Test
       public void startSelFirfox()    {
           System.setProperty("webdriver.gecko.driver","SeleniumDrivers//geckodriver");
           WebDriver driver = new FirefoxDriver();
           driver.get("http://www.yahoo.com");
       //    driver.manage().window().maximize();

        WebElement search = driver.findElement(By.cssSelector("#ybar-sbq")); //does not work!!!!!
        search.click();
        search.sendKeys("bird");
        search.sendKeys(Keys.ENTER);
    }
}

