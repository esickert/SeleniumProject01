import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class SeleiumChrome {

    @Test
    public void seleniumTest()  {
        System.out.println("Class for testing Selenium with Chrome");
    }

    @Test
    public void startSelChrome() throws Exception   {
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get ("http://www.bing.com");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.cssSelector("#sb_form_q"));
        search.click();
        search.sendKeys("DOG");
        search.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("#b_results > li:nth-child(1) > h2 > a")).click();
        Thread.sleep(10000);
        assertEquals("https://en.wikipedia.org/wiki/Dog","https://en.wikipedia.org/wiki/Dog");
    }

}
