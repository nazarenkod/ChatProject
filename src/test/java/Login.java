import entities.Model;
import entities.User;
import org.testng.annotations.Test;

import static site.MyfreecamsSite.framePage;
import static site.MyfreecamsSite.homePage;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class Login extends Base {


    User user = new User("slompis","teddybear");
    Model model = new Model("Alisha_eyes");


    @Test
    public void login() throws InterruptedException {
        //framePage.open();
        homePage.open();
        homePage.login(user);
        homePage.goToModelPage(model);


    }

}
