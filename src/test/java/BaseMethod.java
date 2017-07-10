import com.epam.jdi.uitests.web.settings.WebSettings;
import entities.User;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class BaseMethod {
    public void loginWithProxy(User user) {

    }
    public static Proxy getProxy() {
        ArrayList<String> proxys = new ArrayList<String>();
        proxys.add("ddddd");
        proxys.add("fffff");
        proxys.add("212.237.36.234:3128");
        //List<String> valuesList = new ArrayList<String>(proxy);
        int randomIndex = new Random().nextInt(proxys.size());
        String randomValue = proxys.get(randomIndex);
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(randomValue);
        return proxy;
    }
}
