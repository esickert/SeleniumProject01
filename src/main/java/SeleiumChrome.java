import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleiumChrome {

    @Test
    public void seleniumTest()  {
        System.out.println("Class for testing Selenium Chrome");
    }

    @Test
    public void startSelChrome()    {
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get ("http://www.bing.com");
        driver.manage().window().maximize();

    }

    @Test
    public void startSelFirfox()    {
        System.setProperty("webdriver.gecko.driver","SeleniumDrivers//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.yahoo.com");
        driver.manage().window().maximize();

    }

}