package site.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Popup;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.Frame;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.settings.WebSettings;
import entities.Model;
import entities.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

import static site.MyfreecamsSite.homePage;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class HomePage extends WebPage{

    @JFindBy(xpath = ".//*[@id='enter_desktop']") public Button confirmAgeButton;

    @JFindBy(xpath = "//input[@id='username_input']") public TextField login;

    @JFindBy(id = "password_input") public TextField password;

    @JFindBy(text= "Login") public Button loginButton;

    @JFindBy(id = "sidebar_toggle_customize" ) public Text costomizeLink;

    @FindBy(id = "top_level") public WebElement frame;

    public void login(User user) throws InterruptedException {
        homePage.getDriver().switchTo().frame(0);
//        confirmAgeButton.waitDisplayed();
//        confirmAgeButton.click();
        Thread.sleep(20000);
        homePage.refresh();
        homePage.getDriver().switchTo().frame(0);
        login.focus();
        login.waitDisplayed();
        login.sendKeys(user.getLogin());
        password.sendKeys(user.getPassword());
        loginButton.click();
        costomizeLink.waitDisplayed();
    }

    public void goToModelPage(Model model) {

        getDriver().navigate().to("http://www.myfreecams.com/?#"+ model.getNickname());
    }
}
