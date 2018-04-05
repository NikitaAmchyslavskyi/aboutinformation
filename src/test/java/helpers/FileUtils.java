package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


/**
 * Created by nikita on 04.04.2018.
 */
public class FileUtils {

    public static String baseURL;
    public static String userLogin;
    public static String userPassword;

    public static void getConfig() throws UnsupportedEncodingException {
        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("src/test/resources/config.properties");
            try {
                property.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        baseURL = property.getProperty("URL");
        userLogin = property.getProperty("USERLOGIN");
        userPassword = property.getProperty("USERPASSWORD");
    }

}
