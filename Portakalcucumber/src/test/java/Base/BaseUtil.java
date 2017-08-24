package Base;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseUtil {
    Random r = new Random();
    public WebDriver driver;


    public String uret() {
        String SALTCHARS = "abcdefghijklmnoprstuvyz";
        StringBuilder salt = new StringBuilder();

        String output = null;
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (r.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));

            output = salt.toString();


        }
        return output;
    }}


