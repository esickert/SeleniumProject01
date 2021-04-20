import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

    @Test
    public void SeleniumTest()  {
        System.out.println("Class for testing selenium Firefox");
    }

    @Test
       public void startSelFirfox()    {
           System.setProperty("webdriver.gecko.driver","SeleniumDrivers//geckodriver");
           WebDriver driver = new FirefoxDriver();
           driver.get("http://www.yahoo.com");
       //    driver.manage().window().maximize();
      }
}
