import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by nazarenkod on 12-Jul-17.
 */
public class Authorization {


    @Test(dataProvider="Authentication")

    public void app(String sUserName, String sPassword, String sModel, String sProxy)throws  Exception{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--proxy-server=" + sProxy);
        System.setProperty("webdriver.chrome.driver", "/home/nazarenkod/git/ChatProject/src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.get("");
   
    }

    @DataProvider

    public Object[][] Authentication() throws Exception{
        Object[][] testObjArray = ExcelUtils.getTableArray("/home/nazarenkod/git/ChatProject/testData/TestData.xlsx","Sheet1");
        return (testObjArray);

    }



}
