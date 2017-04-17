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
            try {
                JSONParser parser = new JSONParser();
                FileReader reader = new FileReader(battletag + ".txt");
                JSONObject root = (JSONObject) parser.parse(reader);
                return root;
            } catch (FileNotFoundException ex) {

            } catch (ParseException ex) {

            }
        }
        return null;
    }

    public void initializeStats(Ana ana, Bastion bastion, DVa dva, Genji genji, Hanzo hanzo, Hero hero, JunkRat junkrat, Lucio lucio, McCree mccree, Mei mei, Mercy mercy, Pharah pharah, Reaper reaper, Reinhardt reinhardt, Roadhog roadhog, Soldier76 soldier76, Sombra sombra, Symmetra symettra, Torbjorn torbjorn, Tracer tracer, Widowmaker widowmaker, Winston winston, Zarya zarya, Zenyatta zenyatta) {
        FileReader reader = null;
        try {
            File file = new File(battletag + "-heroes.txt");
            File genFile = new File(battletag + ".txt");
            JSONParser parser = new JSONParser();
            reader = new FileReader(battletag + "-heroes.txt");
            JSONObject root = (JSONObject) parser.parse(reader);
            JSONObject us = (JSONObject) root.get("us");
            JSONObject usheroes = (JSONObject) us.get("heroes");
            JSONObject usherostats = (JSONObject) usheroes.get("stats");
            JSONObject usHeroQuickplay = (JSONObject) usherostats.get("quickplay");
            JSONObject usRoadhog = (JSONObject) usHeroQuickplay.get("roadhog");
            JSONObject usRoadhogStats = (JSONObject) usRoadhog.get("hero_stats");
            JSONObject usRoadhogGenStats = (JSONObject) usRoadhog.get("general_stats");
            JSONObject usRoadhogAvgStats = (JSONObject) usRoadhog.get("average_stats");
            JSONObject usZarya = (JSONObject) usHeroQuickplay.get("zarya");
            JSONObject usZaryaStats = (JSONObject) usZarya.get("hero_stats");
            JSONObject usZaryaGenStats = (JSONObject) usZarya.get("general_stats");
            JSONObject usZaryaAvgStats = (JSONObject) usZarya.get("average_stats");
            JSONObject usZenyatta = (JSONObject) usHeroQuickplay.get("zenyatta");
            JSONObject usZenyattaStats = (JSONObject) usZenyatta.get("hero_stats");
            JSONObject usZenyattaGenStats = (JSONObject) usZenyatta.get("general_stats");
            JSONObject usZenyattaAvgStats = (JSONObject) usZenyatta.get("average_stats");
            JSONObject usWinston = (JSONObject) usHeroQuickplay.get("winston");
            JSONObject usWinstonStats = (JSONObject) usWinston.get("hero_stats");
            JSONObject usWinstonGenStats = (JSONObject) usWinston.get("general_stats");
            JSONObject usWinstonAvgStats = (JSONObject) usWinston.get("average_stats");
            JSONObject usTorbjorn = (JSONObject) usHeroQuickplay.get("torbjorn");
            JSONObject usTorbjornStats = (JSONObject) usTorbjorn.get("hero_stats");
            JSONObject usTorbjornGenStats = (JSONObject) usTorbjorn.get("general_stats");
            JSONObject usTorbjornAvgStats = (JSONObject) usTorbjorn.get("average_stats");
            JSONObject usTracer = (JSONObject) usHeroQuickplay.get("tracer");
            JSONObject usTracerStats = (JSONObject) usTracer.get("hero_stats");
            JSONObject usTracerGenStats = (JSONObject) usTracer.get("general_stats");
            JSONObject usTracerAvgStats = (JSONObject) usTracer.get("average_stats");
            JSONObject usSoldier76 = (JSONObject) usHeroQuickplay.get("soldier76");
            JSONObject usSoldier76Stats = (JSONObject) usSoldier76.get("hero_stats");
            JSONObject usSoldier76GenStats = (JSONObject) usSoldier76.get("general_stats");
            JSONObject usSoldier76AvgStats = (JSONObject) usSoldier76.get("average_stats");
            JSONObject usSombra = (JSONObject) usHeroQuickplay.get("sombra");
            JSONObject usSombraStats = (JSONObject) usSombra.get("hero_stats");
            JSONObject usSombraGenStats = (JSONObject) usSombra.get("general_stats");
            JSONObject usSombraAvgStats = (JSONObject) usSombra.get("average_stats");
            
            //Setting Roadhog Values
            roadhog.setEnemiesHooked((double) usRoadhogStats.get("enemies_hooked"));
            roadhog.setEnemiesHookedAverage((double) usRoadhogAvgStats.get("enemies_hooked_average"));
            roadhog.setEnemiesHookedMostGame((double) usRoadhogStats.get("enemies_hooked_most_in_game"));
            roadhog.setHookAccuracy((double) usRoadhogStats.get("hook_accuracy"));
            roadhog.setHookAccuracyBestGame((double) usRoadhogStats.get("hook_accuracy_best_in_game"));
            roadhog.setHookAttempts((double) usRoadhogStats.get("hooks_attempted"));
            roadhog.setWholeHogKills((double) usRoadhogStats.get("whole_hog_kills"));
            roadhog.setWholeHogKillsAverage((double) usRoadhogAvgStats.get("whole_hog_kills_average"));
            roadhog.setWholeHogKillsMostGame((double) usRoadhogStats.get("whole_hog_kills_most_in_game"));
            roadhog.setSelfHealing((double) usRoadhogGenStats.get("self_healing"));
            roadhog.setSelfHealingAverage((double) usRoadhogAvgStats.get("self_healing_average"));
            roadhog.setSelfHealingMostGame((double) usRoadhogGenStats.get("self_healing_most_in_game"));
            //General Roadhog Stats
            roadhog.setEliminations((double) usRoadhogGenStats.get("eliminations"));
            roadhog.setEliminationsAverage((double) usRoadhogAvgStats.get("eliminations_average"));
            roadhog.setDeaths((double) usRoadhogGenStats.get("deaths"));
            //Setting Winston Values
            winston.setDamageBlocked((double) usWinstonStats.get("damage_blocked"));
            winston.setDamageBlockedAverage((double) usWinstonAvgStats.get("damage_blocked_average"));
            winston.setDamageBlockedMostGame((double) usWinstonStats.get("damage_blocked_most_in_game"));
            winston.setJumpPackKills((double) usWinstonStats.get("jump_pack_kills"));
            winston.setJumpPackKillsAverage((double) usWinstonAvgStats.get("jump_pack_kills_average"));
            winston.setJumpPackKillsMostGame((double) usWinstonStats.get("jump_pack_kills_most_in_game"));
            winston.setMeleeKills((double) usWinstonStats.get("melee_kills"));
            winston.setMeleeKillsAverage((double) usWinstonAvgStats.get("melee_kills_average"));
            winston.setMeleeKillsMostGame((double) usWinstonStats.get("melee_kills_most_in_game"));
            winston.setPlayersKnocked((double) usWinstonStats.get("players_knocked_back"));
            winston.setPlayersKnockedAverage((double) usWinstonAvgStats.get("players_knocked_back_average"));
            winston.setPlayersKnockedMostGame((double) usWinstonStats.get("players_knocked_back_most_in_game"));
            winston.setPrimalRageKills((double) usWinstonGenStats.get("primal_rage_kills"));
            winston.setPrimalRageKillsAverage((double) usWinstonAvgStats.get("primal_rage_kills_average"));
            winston.setPrimalRageKillsMostGame((double) usWinstonGenStats.get("primal_rage_kills_most_in_game"));
            
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
