package playerwatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garrett
 */
public class Login {

    public void login(String battletag) {
        InputStream response;
        
        File file = new File(battletag + ".txt");

        try {
            URLConnection urlConnectionInstance = new URL("https://owapi.net/api/v3/u/" + battletag + "/heroes").openConnection();
            urlConnectionInstance.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
            //url will be formatted and pulled from based on values provided
            String url = "https://owapi.net/api/v3/u/Original-1425/stats/";
            //openStream is a method from InputStream that pulls the response from the website
            response = urlConnectionInstance.getInputStream();
            
                file.delete();
                
            try (Scanner scanner = new Scanner(response)) {
                while (scanner.hasNextLine()) {
                    //Perhaps using .split() as opposed to .useDelimiter would be viable as we could use regex to eliminate specific commas
                    String responseBody = scanner.next();
                    System.out.println(responseBody);
                    try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
                        writer.append(responseBody);
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.toString());
                    }
                }
            }
            //invalid URL format
        } catch (UnknownHostException ex) {
        } catch (MalformedURLException ex) {
            Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
            //invalid return or input values
        } catch (IOException ex) {
            Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }

}
