import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nazarenkod on 10.07.17.
 */
public class Smoke {



    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "/home/nazarenkod/git/ChatProject/src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("http://www.myfreecams.com/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath(".//*[@id='enter_desktop']")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(1);
        WebElement element = driver.findElement(By.xpath("//input[@id='username_input']"));
        element.sendKeys("sdsdsdsdsd");
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
