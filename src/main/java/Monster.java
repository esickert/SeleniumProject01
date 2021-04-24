import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster {

    @Test
    public void monsterPOM()    {
        System.out.println("This class is for developpment of a Page Object Model");
    }

    @Test
    public void openWebPage()  {
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.monster.com");
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > div > div:nth-child(4) > div > a > svg > path"));
        login.click();
//this does not work!!!!!!!
        WebElement user = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div/div/div/form/div/div[1]/div/fieldset[1]/input"));
        user.click();
        user.sendKeys("esickert2@gmail.com");

    }


}
