import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
public class DataLoader {
    private static String filePath = "src/test/resources/user.properties";
    private static DataLoader instance = null;
    private Properties properties;

    protected DataLoader()  {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader input = new InputStreamReader(fileInputStream,"UTF-8");
            properties.load(input);
        }
        catch (java.io.FileNotFoundException e) {System.out.println("Ошибка. Файл config.properties не был найден.");}
        catch (java.io.IOException e) {System.out.println("IO ошибка в пользовательском методе.");}
    }

    public static DataLoader getInstance() {
        if(instance == null) {instance = new DataLoader();}
        return instance;
    }

    public String getProperty(String property) {
        return properties.getProperty(property).toString();
    }

}
