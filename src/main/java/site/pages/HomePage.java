package site.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import entities.User;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class HomePage extends WebPage{


    @JFindBy(id = "") public TextField login;

    @JFindBy(id = "") public TextField password;

    @JFindBy(id= "") public Button loginButton;

    public void login(User user) {
        login.waitDisplayed();
        login.sendKeys(user.getLogin());
        password.sendKeys(user.getPassword());
        loginButton.click();



    }

}
