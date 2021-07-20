import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechFetch  {

    @Test
    public void techFetch() {
        System.out.println("To develope selenium automation scripts using junit and maven");
    }

    @Test
    public void openWebPage()  {

        String emailAddress = "paris@gmail.com";
        String password = "Paris@123";

 /*       public class BaseClass
        {


            WebDriver driver;

            @BeforeClass
            public void setupApplication()
            {

                Reporter.log("=====Browser Session Started=====", true);

                driver=new ChromeDriver();

                driver.manage().window().maximize();

                driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");

                Reporter.log("=====Application Started=====", true);
            }


            @AfterClass
            public void closeApplication()
            {
                driver.quit();
                Reporter.log("=====Browser Session End=====", true);

            }
*/
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techfetch.com/Default.aspx?logout=true");
        driver.manage().window().maximize();
        try {
            WebElement candidate = driver.findElement(By.cssSelector("#ucHeaderCtrl_divCandidate > a"));
            candidate.click();
            driver.findElement(By.cssSelector("#ucHeaderCtrl_divCandidate")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#jsloginpop")).click();

            WebElement checkBox = driver.findElement(By.cssSelector("#login > div.padtop20.ctrlblk > label > p"));
            checkBox.click();

            driver.findElement(By.cssSelector("#txtemailid")).sendKeys (emailAddress, Keys.TAB, password, Keys.ENTER);
            driver.switchTo().frame(22);
            Thread.sleep(5000);
            driver.findElement(By.id("btnClose")).click();
            Thread.sleep(5000);
         }
        catch(Exception e)   {
            System.out.println("ERROR");
            e.printStackTrace();
         }
   //     WebElement logout = driver.findElement(By.xpath("drop7"));
   //     logout.click();
//    driver.quit();

}
}