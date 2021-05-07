import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
        Thread.sleep(5000);

         WebElement log = driver.findElement(By.cssSelector("#app > div._2Li7HAeS5gwed9A6fafr_9 > div.v1kuomZmTs8WHyMwbPstA > div._1Eyqi-SXAN25ND1E9v-4WI > div > div > div > form > div > div:nth-child(1)"));
         log.click();
         WebElement username = driver.findElement(By.id("login-tab"));
         username.click();
         WebElement email = driver.findElement(By.id("email-label"));
         email.click();
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("#email")).sendKeys("esic@gmail.com", Keys.TAB);

         driver.findElement(By.cssSelector("#password")).sendKeys("@123",Keys.ENTER);
//         email.sendKeys("esickert");//this doesn't work!!!!
 //



//        login.sendKeys(Keys.TAB);



    }



}
