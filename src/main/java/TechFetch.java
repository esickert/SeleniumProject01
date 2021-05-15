import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechFetch {

    @Test
    public void techFetch() {
        System.out.println("To develope selenium automation scripts");
    }

    @Test
    public void openWebPage() throws Exception {
        System.setProperty("webdriver.chrome.driver","SeleniumDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techfetch.com/Default.aspx?logout=true");
        driver.manage().window().maximize();

        WebElement candidate = driver.findElement(By.cssSelector("#ucHeaderCtrl_divCandidate > a"));
        candidate.click();
        driver.findElement(By.cssSelector("#ucHeaderCtrl_divCandidate")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#jsloginpop")).click();
// this is weird as isSelected does't seem to work!!!!
        WebElement checkBox = driver.findElement(By.cssSelector("#login > div.padtop20.ctrlblk > label > p"));
        System.out.println(checkBox.isSelected());
//        for(int i = 0; i < 2; i++)  {
            checkBox.click();
    //        System.out.println(checkBox.isSelected());
 //           checkBox.click();
 //       }

    }
}
