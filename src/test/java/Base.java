import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import site.MyfreecamsSite;

import java.io.IOException;
import java.net.InetAddress;
import java.util.*;

import static com.epam.jdi.uitests.core.settings.JDISettings.driverFactory;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebBrowsers;
import static com.epam.jdi.uitests.web.settings.WebSettings.getDriver;
import static site.MyfreecamsSite.homePage;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class Base extends TestNGBase{


    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws IOException {
        WebSite.init(MyfreecamsSite.class);
        BaseMethod baseMethod = new BaseMethod();
        Proxy proxy = baseMethod.getProxy();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--proxy-server=http://" + proxy);
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.PROXY, proxy);
        WebSettings.useDriver(() -> new ChromeDriver(options));
        homePage.open();
        logger.info("Run successful");
        logger.info(proxy.getHttpProxy());



    }




    @AfterSuite(alwaysRun = true)
    public static void tearDown() throws IOException {
        //killAllRunWebBrowsers();

    }
}
