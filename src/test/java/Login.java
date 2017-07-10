import entities.User;
import org.bouncycastle.jcajce.provider.symmetric.Threefish;
import org.testng.annotations.Test;

import static site.MyfreecamsSite.homePage;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class Login extends Base {

    User user = User.builder().
            login(DataLoader.getInstance().getProperty("login")).
            password(DataLoader.getInstance().getProperty("password")).
            proxy(DataLoader.getInstance().getProperty("proxy")).
            build();


    @Test
    public void login() throws InterruptedException {

//        BaseMethod baseMethod = new BaseMethod();
//        baseMethod.loginWithProxy(user);
//        homePage.login(user);

            homePage.open();
            Thread.sleep(50000);
    }

}
