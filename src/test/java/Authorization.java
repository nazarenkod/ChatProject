import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nazarenkod on 12-Jul-17.
 */
public class Authorization {

// public WebDriver driver;
//    public WebDriverWait wait;

    @Test(dataProvider="Authentication")

    public void app(String sUserName, String sPassword, String sModel, String sProxy)throws  Exception{
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--proxy-server=http://" + sProxy);
        System.out.println(sProxy);
//        System.setProperty("webdriver.chrome.driver", "E:\\Git\\test\\src\\main\\resources\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        //    WebDriverWait wait = new WebDriverWait(driver,20);
//        driver.get("");
//        driver.findElement(By.id("")).clear();
//        driver.findElement(By.id("")).sendKeys(sUserName);
        System.out.println(sUserName);
//        driver.findElement(By.id("")).clear();
//        driver.findElement(By.id("")).sendKeys(sPassword);
        System.out.println(sPassword);
//        driver.findElement(By.id("")).click();
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
        //driver.get("url"+sModel);
        System.out.println(sModel);
        //Thread.sleep(500000);
        //driver.get("url"+sModel);

        //System.out.println(" Login Successfully, now it is the time to Log Off buddy.");



    }

    @DataProvider

    public Object[][] Authentication() throws Exception{
        Object[][] testObjArray = ExcelUtils.getTableArray("E:\\Git\\test\\testData\\TestData.xlsx","Sheet1");
        return (testObjArray);

    }



}