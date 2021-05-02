import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster {

    @Test
    public void monsterPOM()    {
        System.out.println("This class is for developpment of a Page Object Model");
    }

    @Test
    public void openWebPage() throws Exception  {
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.monster.com");
        driver.manage().window().maximize();


        WebElement login = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > div > div:nth-child(4) > div > a > svg > path"));
        login.click();
//        Thread.sleep(10000);
 //this does not work!!!!!!!
         WebElement log = driver.findElement(By.class("_3xUeAn03lYbCGauXw2kirW"));

//        login.sendKeys(Keys.TAB);



    }



}
