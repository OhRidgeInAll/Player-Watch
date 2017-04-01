package playerwatch;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garrett
 */
public class Login {

    public void login(String battletag) {
        InputStream response = null;

        try {
            //url will be formatted and pulled from based on values provided
            String url = "https://api.lootbox.eu/pc/us/" + battletag + "/quickplay/allHeroes/";
            //openStream is a method from InputStream that pulls the response from the website
            response = new URL(url).openStream();
            try (Scanner scanner = new Scanner(response)) {
                while (scanner.hasNextLine()) {
                    //Perhaps using .split() as opposed to .useDelimiter would be viable as we could use regex to eliminate specific commas
                    String responseBody = scanner.useDelimiter("\",").next();
                    System.out.println(responseBody);
                }
            }
            //invalid URL format
        } catch (MalformedURLException ex) {
            Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
            //invalid return or input values
        } catch (IOException ex) {
            Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                response.close();
                //response close failchecking
            } catch (IOException ex) {
                Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
