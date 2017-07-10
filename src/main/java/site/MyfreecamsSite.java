package site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import site.pages.HomePage;

/**
 * Created by nazarenkod on 10-Jul-17.
 */

@JSite(domain = "http://www.showmyip.gr/")
public class MyfreecamsSite extends WebSite {

    @JPage()
    public static HomePage homePage;
}
