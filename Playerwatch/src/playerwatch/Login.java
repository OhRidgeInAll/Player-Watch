package playerwatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import playerwatch.heroes.DVa;
import playerwatch.heroes.Soldier76;
import playerwatch.heroes.Ana;
import playerwatch.heroes.Bastion;
import playerwatch.heroes.Genji;
import playerwatch.heroes.Roadhog;
import playerwatch.heroes.Hero;
import playerwatch.heroes.Hanzo;
import playerwatch.heroes.JunkRat;
import playerwatch.heroes.Lucio;
import playerwatch.heroes.McCree;
import playerwatch.heroes.Mei;
import playerwatch.heroes.Mercy;
import playerwatch.heroes.Pharah;
import playerwatch.heroes.Reaper;
import playerwatch.heroes.Reinhardt;
import playerwatch.heroes.Sombra;
import playerwatch.heroes.Symmetra;
import playerwatch.heroes.Torbjorn;
import playerwatch.heroes.Tracer;
import playerwatch.heroes.Widowmaker;
import playerwatch.heroes.Winston;
import playerwatch.heroes.Zarya;
import playerwatch.heroes.Zenyatta;

/**
 *
 * @author Garrett
 */
/*
This is the major logic behind pulling the stats for the application. It pulls
from the API (by posing as a browser) and indexes the results in both a file for backup
and then passes the JSONObject to the main class.

This class was handled by Garrett
*/
public class Login {
    String battletag;

    public JSONObject login(String battletag) throws IOException, ParseException {
        this.battletag = battletag;
        InputStream response;
        
        File file = new File(battletag + "-heroes.txt");
        File genFile = new File(battletag + ".txt");

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
            try{ 
                JSONParser parser = new JSONParser();
                FileReader reader = new FileReader(battletag + ".txt");
                JSONObject root = (JSONObject) parser.parse(reader);
                return root;
            }
            catch(FileNotFoundException ex){
                
            }
            catch(ParseException ex){
                
            }
        }
        return null;
    }
    
    public void initializeStats(Ana ana, Bastion bastion, DVa dva, Genji genji, Hanzo hanzo, Hero hero, JunkRat junkrat, Lucio lucio, McCree mccree, Mei mei, Mercy mercy, Pharah pharah, Reaper reaper, Reinhardt reinhardt, Roadhog roadhog, Soldier76 soldier76, Sombra sombra, Symmetra symettra, Torbjorn torbjorn, Tracer tracer, Widowmaker widowmaker, Winston winston, Zarya zarya, Zenyatta zenyatta){
        FileReader reader = null;
        try {
            File file = new File(battletag + "-heroes.txt");
            File genFile = new File(battletag + ".txt");
            JSONParser parser = new JSONParser();
            reader = new FileReader(battletag + "-heroes.txt");
            JSONObject root = (JSONObject)parser.parse(reader);
            JSONObject us = (JSONObject)root.get("us");
            JSONObject usheroes = (JSONObject)us.get("heroes");
            JSONObject usherostats = (JSONObject)usheroes.get("stats");
            JSONObject usHeroQuickplay = (JSONObject)usherostats.get("quickplay");
            JSONObject usRoadhog = (JSONObject)usHeroQuickplay.get("roadhog");
            JSONObject usRoadhogStats = (JSONObject)usRoadhog.get("hero_stats");
            JSONObject usRoadhogAvgStats = (JSONObject)usRoadhog.get("average_stats");
            //Setting Roadhog Values
            roadhog.setEnemiesHooked((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setEnemiesHookedAverage((double)usRoadhogAvgStats.get("enemies_hooked_average"));
            roadhog.setEnemiesHookedMostGame((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setHookAccuracy((double)usRoadhogStats.get("hook_accuracy"));
            roadhog.setHookAccuracyBestGame((double)usRoadhogStats.get("hook_accuracy_best_in_game"));
            roadhog.setHookAttempts((double)usRoadhogStats.get("hooks_attempted"));
            roadhog.setWholeHogKills((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setWholeHogKillsAverage((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setWholeHogKillsMostGame((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setSelfHealing((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setSelfHealingAverage((double)usRoadhogStats.get("enemies_hooked"));
            roadhog.setSelfHealingMostGame((double)usRoadhogStats.get("enemies_hooked"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //public String

}
