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

    public void initializeStats(Ana ana, Bastion bastion, DVa dva, Genji genji, Hanzo hanzo, Hero hero, JunkRat junkrat, Lucio lucio, McCree mccree, Mei mei, Mercy mercy, Pharah pharah, Reaper reaper, Reinhardt reinhardt, Roadhog roadhog, Soldier76 soldier76, Sombra sombra, Symmetra symmetra, Torbjorn torbjorn, Tracer tracer, Widowmaker widowmaker, Winston winston, Zarya zarya, Zenyatta zenyatta) {
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
            JSONObject usMercy = (JSONObject) usHeroQuickplay.get("mercy");
            JSONObject usMercyStats = (JSONObject) usMercy.get("hero_stats");
            JSONObject usMercyGenStats = (JSONObject) usMercy.get("general_stats");
            JSONObject usMercyAvgStats = (JSONObject) usMercy.get("average_stats");
            JSONObject usReaper = (JSONObject) usHeroQuickplay.get("reaper");
            JSONObject usReaperStats = (JSONObject) usReaper.get("hero_stats");
            JSONObject usReaperGenStats = (JSONObject) usReaper.get("general_stats");
            JSONObject usReaperAvgStats = (JSONObject) usReaper.get("average_stats");
            JSONObject usBastion = (JSONObject) usHeroQuickplay.get("bastion");
            JSONObject usBastionStats = (JSONObject) usBastion.get("hero_stats");
            JSONObject usBastionGenStats = (JSONObject) usBastion.get("general_stats");
            JSONObject usBastionAvgStats = (JSONObject) usBastion.get("average_stats");
            JSONObject usDva = (JSONObject) usHeroQuickplay.get("dva");
            JSONObject usDvaStats = (JSONObject) usDva.get("hero_stats");
            JSONObject usDvaGenStats = (JSONObject) usDva.get("general_stats");
            JSONObject usDvaAvgStats = (JSONObject) usDva.get("average_stats");
            JSONObject usGenji = (JSONObject) usHeroQuickplay.get("genji");
            JSONObject usGenjiStats = (JSONObject) usGenji.get("hero_stats");
            JSONObject usGenjiGenStats = (JSONObject) usGenji.get("general_stats");
            JSONObject usGenjiAvgStats = (JSONObject) usGenji.get("average_stats");
            JSONObject usMei = (JSONObject) usHeroQuickplay.get("mei");
            JSONObject usMeiStats = (JSONObject) usMei.get("hero_stats");
            JSONObject usMeiGenStats = (JSONObject) usMei.get("general_stats");
            JSONObject usMeiAvgStats = (JSONObject) usMei.get("average_stats");
            JSONObject usWidowmaker = (JSONObject) usHeroQuickplay.get("widowmaker");
            JSONObject usWidowmakerStats = (JSONObject) usWidowmaker.get("hero_stats");
            JSONObject usWidowmakerGenStats = (JSONObject) usWidowmaker.get("general_stats");
            JSONObject usWidowmakerAvgStats = (JSONObject) usWidowmaker.get("average_stats");
            JSONObject usSymmetra = (JSONObject) usHeroQuickplay.get("symmetra");
            JSONObject usSymmetraStats = (JSONObject) usSymmetra.get("hero_stats");
            JSONObject usSymmetraGenStats = (JSONObject) usSymmetra.get("general_stats");
            JSONObject usSymmetraAvgStats = (JSONObject) usSymmetra.get("average_stats");
            JSONObject usAna = (JSONObject) usHeroQuickplay.get("ana");
            JSONObject usAnaStats = (JSONObject) usAna.get("hero_stats");
            JSONObject usAnaGenStats = (JSONObject) usAna.get("general_stats");
            JSONObject usAnaAvgStats = (JSONObject) usAna.get("average_stats");
            JSONObject usReinhardt = (JSONObject) usHeroQuickplay.get("reinhardt");
            JSONObject usReinhardtStats = (JSONObject) usReinhardt.get("hero_stats");
            JSONObject usReinhardtGenStats = (JSONObject) usReinhardt.get("general_stats");
            JSONObject usReinhardtAvgStats = (JSONObject) usReinhardt.get("average_stats");
            JSONObject usHanzo = (JSONObject) usHeroQuickplay.get("hanzo");
            JSONObject usHanzoStats = (JSONObject) usHanzo.get("hero_stats");
            JSONObject usHanzoGenStats = (JSONObject) usHanzo.get("general_stats");
            JSONObject usHanzoAvgStats = (JSONObject) usHanzo.get("average_stats");
            JSONObject usJunkRat = (JSONObject) usHeroQuickplay.get("junkrat");
            JSONObject usJunkRatStats = (JSONObject) usJunkRat.get("hero_stats");
            JSONObject usJunkRatGenStats = (JSONObject) usJunkRat.get("general_stats");
            JSONObject usJunkRatAvgStats = (JSONObject) usJunkRat.get("average_stats");

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
            roadhog.setDeathsAverage((double) usRoadhogAvgStats.get("deaths_average"));
            roadhog.setSoloKills((double) usRoadhogGenStats.get("solo_kills"));
            roadhog.setSoloKillsAverage((double) usRoadhogAvgStats.get("solo_kills_average"));
            roadhog.setObjectiveKills((double) usRoadhogGenStats.get("objective_kills"));
            roadhog.setObjectiveKillsAverage((double) usRoadhogAvgStats.get("objective_kills_average"));
            roadhog.setWeaponAccuracy((double) usRoadhogGenStats.get("weapon_accuracy"));
            roadhog.setGamesWon((double) usRoadhogGenStats.get("games_won"));
            roadhog.setTimePlayed((double) usRoadhogGenStats.get("time_played"));
            roadhog.setCriticalHits((double) usRoadhogGenStats.get("critical_hits"));
            roadhog.setCriticalHitAccuracy((double) usRoadhogGenStats.get("critical_hit_accuracy"));

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
            //Winston General Stats
            winston.setEliminations((double) usWinstonGenStats.get("eliminations"));
            winston.setEliminationsAverage((double) usWinstonAvgStats.get("eliminations_average"));
            winston.setDeaths((double) usWinstonGenStats.get("deaths"));
            winston.setDeathsAverage((double) usWinstonAvgStats.get("deaths_average"));
            winston.setSoloKills((double) usWinstonGenStats.get("solo_kills"));
            winston.setSoloKillsAverage((double) usWinstonAvgStats.get("solo_kills_average"));
            winston.setObjectiveKills((double) usWinstonGenStats.get("objective_kills"));
            winston.setObjectiveKillsAverage((double) usWinstonAvgStats.get("objective_kills_average"));
            winston.setWeaponAccuracy(0);
            winston.setGamesWon((double) usWinstonGenStats.get("games_won"));
            winston.setTimePlayed((double) usWinstonGenStats.get("time_played"));
            winston.setCriticalHits(0);
            winston.setCriticalHitAccuracy(0);

            //Setting Zarya Values
            zarya.setDamageBlocked((double) usZaryaStats.get("damage_blocked"));
            zarya.setDamageBlockedAverage((double) usZaryaAvgStats.get("damage_blocked_average"));
            zarya.setDamageBlockedMostGame((double) usZaryaStats.get("damage_blocked_most_in_game"));
            zarya.setHighEnergyKills((double) usZaryaStats.get("high_energy_kills"));
            zarya.setHighEnergyKillsMostGame((double) usZaryaStats.get("high_energy_kills_most_in_game"));
            zarya.setHighEnergyKillsAverage((double) usZaryaAvgStats.get("high_energy_kills_average"));
            zarya.setEnergyMax((double) usZaryaStats.get("energy_maximum"));
            zarya.setDamageBlocked((double) usZaryaStats.get("damage_blocked"));
            zarya.setDamageBlockedAverage((double) usZaryaAvgStats.get("damage_blocked_average"));
            zarya.setDamageBlockedMostGame((double) usZaryaStats.get("damage_blocked_most_in_game"));
            zarya.setProjectedBarriers((double) usZaryaStats.get("projected_barriers_applied"));
            zarya.setProjectedBarriersAverage((double) usZaryaAvgStats.get("projected_barriers_applied_average"));
            zarya.setProjectedBarriersMostGame((double) usZaryaGenStats.get("projected_barriers_applied_most_in_game"));
            zarya.setGravSurgeMostGame((double) usZaryaStats.get("graviton_surge_kills_most_in_game"));
            zarya.setLifetimeGravSurgeKills((double) usZaryaStats.get("lifetime_graviton_surge_kills"));
            zarya.setGravSurgeAverage((double) usZaryaAvgStats.get("graviton_surge_kills_average"));
            zarya.setLifetimeEnergyAccumulation((double) usZaryaStats.get("lifetime_energy_accumulation"));
            //Zarya General Stats
            zarya.setEliminations((double) usZaryaGenStats.get("eliminations"));
            zarya.setEliminationsAverage((double) usZaryaAvgStats.get("eliminations_average"));
            zarya.setDeaths((double) usZaryaGenStats.get("deaths"));
            zarya.setDeathsAverage((double) usZaryaAvgStats.get("deaths_average"));
            zarya.setSoloKills((double) usZaryaGenStats.get("solo_kills"));
            zarya.setSoloKillsAverage((double) usZaryaAvgStats.get("solo_kills_average"));
            zarya.setObjectiveKills((double) usZaryaGenStats.get("objective_kills"));
            zarya.setObjectiveKillsAverage((double) usZaryaAvgStats.get("objective_kills_average"));
            zarya.setWeaponAccuracy((double) usZaryaGenStats.get("weapon_accuracy"));
            zarya.setGamesWon((double) usZaryaGenStats.get("games_won"));
            zarya.setTimePlayed((double) usZaryaGenStats.get("time_played"));
            zarya.setCriticalHits(0);
            zarya.setCriticalHitAccuracy(0);

            //Setting Zenyatta Values
            zenyatta.setTranscendenceHealing((double) usZenyattaGenStats.get("transcendence_healing"));
            zenyatta.setTranscendenceHealingBest((double) usZenyattaStats.get("transcendence_healing_best"));
            zenyatta.setSelfHealing((double) usZenyattaGenStats.get("self_healing"));
            zenyatta.setSelfHealingMostGame((double) usZenyattaGenStats.get("self_healing_most_in_game"));
            zenyatta.setSelfHealingAverage((double) usZenyattaAvgStats.get("self_healing_average"));
            //Setting Zenyatta General Values
            zenyatta.setEliminations((double) usZenyattaGenStats.get("eliminations"));
            zenyatta.setEliminationsAverage((double) usZenyattaAvgStats.get("eliminations_average"));
            zenyatta.setDeaths((double) usZenyattaGenStats.get("deaths"));
            zenyatta.setDeathsAverage((double) usZenyattaAvgStats.get("deaths_average"));
            zenyatta.setSoloKills((double) usZenyattaGenStats.get("solo_kills"));
            zenyatta.setSoloKillsAverage((double) usZenyattaAvgStats.get("solo_kills_average"));
            zenyatta.setObjectiveKills((double) usZenyattaGenStats.get("objective_kills"));
            zenyatta.setObjectiveKillsAverage((double) usZenyattaAvgStats.get("objective_kills_average"));
            zenyatta.setWeaponAccuracy((double) usZenyattaGenStats.get("weapon_accuracy"));
            zenyatta.setGamesWon((double) usZenyattaGenStats.get("games_won"));
            zenyatta.setTimePlayed((double) usZenyattaGenStats.get("time_played"));
            zenyatta.setCriticalHits((double) usZenyattaGenStats.get("critical_hits"));
            zenyatta.setCriticalHitAccuracy((double) usZenyattaGenStats.get("critical_hit_accuracy"));
            //Assigning Tracer Values
            tracer.setPulseBombKills((double) usTracerStats.get("pulse_bomb_kills"));
            tracer.setPulseBombKillsAverage((double) usTracerAvgStats.get("pulse_bomb_kills_average"));
            tracer.setPulseBombKillsMostGame((double) usTracerStats.get("pulse_bomb_kills_most_in_game"));
            tracer.setPulseBombsAttached((double) usTracerStats.get("pulse_bombs_attached"));
            tracer.setPulseBombsAttachedAverage((double) usTracerAvgStats.get("pulse_bombs_attached_average"));
            tracer.setPulseBombsMostGame((double) usTracerStats.get("pulse_bombs_attached_most_in_game"));

            //Implementing Tracer General Stats
            tracer.setEliminations((double) usTracerGenStats.get("eliminations"));
            tracer.setEliminationsAverage((double) usTracerAvgStats.get("eliminations_average"));
            tracer.setDeaths((double) usTracerGenStats.get("deaths"));
            tracer.setDeathsAverage((double) usTracerAvgStats.get("deaths_average"));
            tracer.setSoloKills((double) usTracerGenStats.get("solo_kills"));
            tracer.setSoloKillsAverage((double) usTracerAvgStats.get("solo_kills_average"));
            tracer.setObjectiveKills((double) usTracerGenStats.get("objective_kills"));
            tracer.setObjectiveKillsAverage((double) usTracerAvgStats.get("objective_kills_average"));
            tracer.setWeaponAccuracy((double) usTracerGenStats.get("weapon_accuracy"));
            tracer.setGamesWon((double) usTracerGenStats.get("games_won"));
            tracer.setTimePlayed((double) usTracerGenStats.get("time_played"));
            tracer.setCriticalHits((double) usTracerGenStats.get("critical_hits"));
            tracer.setCriticalHitAccuracy((double) usTracerGenStats.get("critical_hit_accuracy"));

            //Assigning Torbjorn Values
            torbjorn.setArmorPacksCreated((double) usTorbjornStats.get("armor_packs_created"));
            torbjorn.setArmorPacksCreatedAverage((double) usTorbjornAvgStats.get("armor_packs_created_average"));
            torbjorn.setTorbjornKills((double) usTorbjornStats.get("torbjorn_kills"));
            torbjorn.setTorbjornKillsAverage((double) usTorbjornAvgStats.get("torbjorn_kills_average"));
            torbjorn.setTorbjornKillsMostGame((double) usTorbjornStats.get("torbjorn_kills_most_in_game"));
            torbjorn.setMoltenCoreKills((double) usTorbjornStats.get("molten_core_kills"));
            torbjorn.setMoltenCoreKillsAverage((double) usTorbjornAvgStats.get("molten_core_kills_average"));
            torbjorn.setMoltenCoreKillsMostGame((double) usTorbjornStats.get("molten_core_kills_most_in_game"));
            torbjorn.setTorbjornKillsMostGame((double) usTorbjornStats.get("torbjorn_kills_most_in_game"));
            torbjorn.setTurretKills((double) usTorbjornStats.get("turret_kills"));
            torbjorn.setTurretKillsAverage((double) usTorbjornAvgStats.get("turret_kills_average"));

            //Implementing Torbjorn General Stats
            torbjorn.setEliminations((double) usTorbjornGenStats.get("eliminations"));
            torbjorn.setEliminationsAverage((double) usTorbjornAvgStats.get("eliminations_average"));
            torbjorn.setDeaths((double) usTorbjornGenStats.get("deaths"));
            torbjorn.setDeathsAverage((double) usTorbjornAvgStats.get("deaths_average"));
            torbjorn.setSoloKills((double) usTorbjornGenStats.get("solo_kills"));
            torbjorn.setSoloKillsAverage((double) usTorbjornAvgStats.get("solo_kills_average"));
            torbjorn.setObjectiveKills((double) usTorbjornGenStats.get("objective_kills"));
            torbjorn.setObjectiveKillsAverage((double) usTorbjornAvgStats.get("objective_kills_average"));
            torbjorn.setWeaponAccuracy((double) usTorbjornGenStats.get("weapon_accuracy"));
            torbjorn.setGamesWon((double) usTorbjornGenStats.get("games_won"));
            torbjorn.setTimePlayed((double) usTorbjornGenStats.get("time_played"));
            torbjorn.setCriticalHits((double) usTorbjornGenStats.get("critical_hits"));
            torbjorn.setCriticalHitAccuracy((double) usTorbjornGenStats.get("critical_hit_accuracy"));

            //Initializing Mercy Variables
            mercy.setPlayersResurrected((double) usMercyStats.get("players_resurrected"));
            mercy.setPlayersResurrectedAverage((double) usMercyAvgStats.get("players_resurrected_average"));
            mercy.setPlayersResurrectedMostGame((double) usMercyStats.get("players_resurrected_most_in_game"));
            mercy.setSelfHealing((double) usMercyGenStats.get("self_healing"));
            mercy.setSelfHealingAverage((double) usMercyAvgStats.get("self_healing_average"));
            mercy.setSelfHealingMostGame((double) usMercyGenStats.get("self_healing_most_in_game"));

            //Implementing Mercy General Stats
            mercy.setEliminations((double) usMercyGenStats.get("eliminations"));
            mercy.setBlasterKills((double) usMercyGenStats.get("blaster_kills"));
            mercy.setBlasterKillsAverage((double) usMercyAvgStats.get("blaster_kills_average"));
            mercy.setBlasterKillsMostGame((double) usMercyGenStats.get("blaster_kills_most_in_game"));
            mercy.setEliminationsAverage((double) usMercyAvgStats.get("eliminations_average"));
            mercy.setDeaths((double) usMercyGenStats.get("deaths"));
            mercy.setDeathsAverage((double) usMercyAvgStats.get("deaths_average"));
            mercy.setSoloKills((double) usMercyGenStats.get("solo_kills"));
            mercy.setSoloKillsAverage((double) usMercyAvgStats.get("solo_kills_average"));
            mercy.setObjectiveKills((double) usMercyGenStats.get("objective_kills"));
            mercy.setObjectiveKillsAverage((double) usMercyAvgStats.get("objective_kills_average"));
            mercy.setWeaponAccuracy((double) usMercyGenStats.get("weapon_accuracy"));
            mercy.setGamesWon((double) usMercyGenStats.get("games_won"));
            mercy.setTimePlayed((double) usMercyGenStats.get("time_played"));
            mercy.setCriticalHits((double) usMercyGenStats.get("critical_hits"));
            mercy.setCriticalHitAccuracy((double) usMercyGenStats.get("critical_hit_accuracy"));

            //Estabilishing Soldier76 Variables
            soldier76.setTacticalVisorKillsMostGame((double) usSoldier76Stats.get("tactical_visor_kills_most_in_game"));
            soldier76.setTacticalVisorKillsAverage((double) usSoldier76AvgStats.get("tactical_visor_kills_average"));
            soldier76.setBioticFieldsDeployed((double) usSoldier76Stats.get("biotic_fields_deployed"));
            soldier76.setBioticFieldHealingDone((double) usSoldier76Stats.get("biotic_field_healing_done"));
            soldier76.setHelixRocketKills((double) usSoldier76Stats.get("helix_rockets_kills"));
            soldier76.setHelixRocketKillsAverage((double) usSoldier76AvgStats.get("helix_rockets_kills_average"));
            soldier76.setHelixRocketKillsMostGame((double) usSoldier76Stats.get("helix_rockets_kills_most_in_game"));

            //Implementing Soldier76 General Stats
            soldier76.setEliminations((double) usSoldier76GenStats.get("eliminations"));
            soldier76.setEliminationsAverage((double) usSoldier76AvgStats.get("eliminations_average"));
            soldier76.setDeaths((double) usSoldier76GenStats.get("deaths"));
            soldier76.setDeathsAverage((double) usSoldier76AvgStats.get("deaths_average"));
            soldier76.setSoloKills((double) usSoldier76GenStats.get("solo_kills"));
            soldier76.setSoloKillsAverage((double) usSoldier76AvgStats.get("solo_kills_average"));
            soldier76.setObjectiveKills((double) usSoldier76GenStats.get("objective_kills"));
            soldier76.setObjectiveKillsAverage((double) usSoldier76AvgStats.get("objective_kills_average"));
            soldier76.setWeaponAccuracy((double) usSoldier76GenStats.get("weapon_accuracy"));
            soldier76.setGamesWon((double) usSoldier76GenStats.get("games_won"));
            soldier76.setTimePlayed((double) usSoldier76GenStats.get("time_played"));
            soldier76.setCriticalHits((double) usSoldier76GenStats.get("critical_hits"));
            soldier76.setCriticalHitAccuracy((double) usSoldier76GenStats.get("critical_hit_accuracy"));

            //Sombra 
            sombra.setEnemiesHacked((double) usSombraGenStats.get("enemies_hacked"));
            sombra.setEnemiesHackedAverage((double) usSombraAvgStats.get("enemies_hacked_average"));
            sombra.setEnemiesHackedMostGame((double) usSombraGenStats.get("enemies_hacked_most_in_game"));
            sombra.setEnemiesEmp((double) usSombraGenStats.get("enemies_empd"));
            sombra.setEnemiesEmpAverage((double) usSombraAvgStats.get("enemies_empd_average"));
            sombra.setEnemiesEmpMostGame((double) usSombraGenStats.get("enemies_empd_most_in_game"));

            //Implementing Sombra General Stats
            sombra.setEliminations((double) usSombraGenStats.get("eliminations"));
            sombra.setEliminationsAverage((double) usSombraAvgStats.get("eliminations_average"));
            sombra.setDeaths((double) usSombraGenStats.get("deaths"));
            sombra.setDeathsAverage((double) usSombraAvgStats.get("deaths_average"));
            sombra.setSoloKillsAverage((double) usSombraAvgStats.get("solo_kills_average"));
            sombra.setObjectiveKills((double) usSombraGenStats.get("objective_kills"));
            sombra.setObjectiveKillsAverage((double) usSombraAvgStats.get("objective_kills_average"));
            sombra.setWeaponAccuracy((double) usSombraGenStats.get("weapon_accuracy"));
            sombra.setTimePlayed((double) usSombraGenStats.get("time_played"));
            sombra.setCriticalHits((double) usSombraGenStats.get("critical_hits"));

            //Bastion Stats
            bastion.setReconKills((double) usBastionStats.get("recon_kills"));
            bastion.setReconKillsAverage((double) usBastionAvgStats.get("recon_kills_average"));
            bastion.setReconKillsMostGame((double) usBastionStats.get("recon_kills_most_in_game"));
            bastion.setTankKills((double) usBastionStats.get("tank_kills"));
            bastion.setTankKillsAverage((double) usBastionAvgStats.get("tank_kills_average"));
            bastion.setTankKillsMostGame((double) usBastionStats.get("tank_kills_most_in_game"));
            bastion.setSentryKills((double) usBastionStats.get("sentry_kills"));
            bastion.setSentryKillsAverage((double) usBastionAvgStats.get("sentry_kills_average"));
            bastion.setSentryKillsMostGame((double) usBastionStats.get("sentry_kills_most_in_game"));
            bastion.setSelfHealing((double) usBastionGenStats.get("self_healing"));
            bastion.setSelfHealingAverage((double) usBastionAvgStats.get("self_healing_average"));
            bastion.setSelfHealingMostGame((double) usBastionGenStats.get("self_healing_most_in_game"));

            //Implementing Bastion General Stats
            bastion.setEliminations((double) usBastionGenStats.get("eliminations"));
            bastion.setEliminationsAverage((double) usBastionAvgStats.get("eliminations_average"));
            bastion.setDeaths((double) usBastionGenStats.get("deaths"));
            bastion.setDeathsAverage((double) usBastionAvgStats.get("deaths_average"));
            bastion.setSoloKills((double) usBastionGenStats.get("solo_kills"));
            bastion.setSoloKillsAverage((double) usBastionAvgStats.get("solo_kills_average"));
            bastion.setObjectiveKills((double) usBastionGenStats.get("objective_kills"));
            bastion.setObjectiveKillsAverage((double) usBastionAvgStats.get("objective_kills_average"));
            bastion.setWeaponAccuracy((double) usBastionGenStats.get("weapon_accuracy"));
            bastion.setGamesWon((double) usBastionGenStats.get("games_won"));
            bastion.setTimePlayed((double) usBastionGenStats.get("time_played"));
            bastion.setCriticalHits((double) usBastionGenStats.get("critical_hits"));
            bastion.setCriticalHitAccuracy((double) usBastionGenStats.get("critical_hit_accuracy"));

            //Reaper Stats initialization
            reaper.setSoulsConsumed((double) usReaperStats.get("souls_consumed"));
            reaper.setSoulsConsumedAverage((double) usReaperAvgStats.get("souls_consumed_average"));
            reaper.setSoulsConsumedMostGame((double) usReaperStats.get("souls_consumed_most_in_game"));
            reaper.setDeathBlossomKills((double) usReaperStats.get("death_blossom_kills"));
            reaper.setDeathBlossomKillsAverage((double) usReaperAvgStats.get("death_blossom_kills_average"));
            reaper.setDeathBlossomKillsMostGame((double) usReaperStats.get("death_blossom_kills_most_in_game"));
            reaper.setSelfHealing((double) usReaperGenStats.get("self_healing"));
            reaper.setSelfHealingAverage((double) usReaperAvgStats.get("self_healing_average"));
            reaper.setSelfHealingMostGame((double) usReaperGenStats.get("self_healing_most_in_game"));

            //Implementing Reaper General Stats
            reaper.setEliminations((double) usReaperGenStats.get("eliminations"));
            reaper.setEliminationsAverage((double) usReaperAvgStats.get("eliminations_average"));
            reaper.setDeaths((double) usReaperGenStats.get("deaths"));
            reaper.setDeathsAverage((double) usReaperAvgStats.get("deaths_average"));
            reaper.setSoloKills((double) usReaperGenStats.get("solo_kills"));
            reaper.setSoloKillsAverage((double) usReaperAvgStats.get("solo_kills_average"));
            reaper.setObjectiveKills((double) usReaperGenStats.get("objective_kills"));
            reaper.setObjectiveKillsAverage((double) usReaperAvgStats.get("objective_kills_average"));
            reaper.setWeaponAccuracy((double) usReaperGenStats.get("weapon_accuracy"));
            reaper.setGamesWon((double) usReaperGenStats.get("games_won"));
            reaper.setTimePlayed((double) usReaperGenStats.get("time_played"));
            reaper.setCriticalHits((double) usReaperGenStats.get("critical_hits"));
            reaper.setCriticalHitAccuracy((double) usReaperGenStats.get("critical_hit_accuracy"));

            //DVa Online: Stats initialized
            dva.setMechCalled((double) usDvaStats.get("mechs_called"));
            dva.setMechCalledAverage((double) usDvaAvgStats.get("mechs_called_average"));
            dva.setMechCalledMostGame((double) usDvaStats.get("mechs_called_most_in_game"));
            dva.setSelfDestructKills((double) usDvaGenStats.get("self_destruct_kills"));
            dva.setSelfDestructKillsMostGame((double) usDvaGenStats.get("self_destruct_kills_most_in_game"));
            dva.setDamageBlocked((double) usDvaStats.get("damage_blocked"));
            dva.setDamageBlockedAverage((double) usDvaAvgStats.get("damage_blocked_average"));
            dva.setDamageBlockedMostGame((double) usDvaStats.get("damage_blocked_most_in_game"));
            dva.setMechDeaths((double) usDvaStats.get("mech_deaths"));

            //Implementing Dva General Stats
            dva.setEliminations((double) usDvaGenStats.get("eliminations"));
            dva.setEliminationsAverage((double) usDvaAvgStats.get("eliminations_average"));
            dva.setDeaths((double) usDvaGenStats.get("deaths"));
            dva.setDeathsAverage((double) usDvaAvgStats.get("deaths_average"));
            dva.setSoloKills((double) usDvaGenStats.get("solo_kills"));
            dva.setSoloKillsAverage((double) usDvaAvgStats.get("solo_kills_average"));
            dva.setObjectiveKills((double) usDvaGenStats.get("objective_kills"));
            dva.setObjectiveKillsAverage((double) usDvaAvgStats.get("objective_kills_average"));
            dva.setWeaponAccuracy((double) usDvaGenStats.get("weapon_accuracy"));
            dva.setGamesWon((double) usDvaGenStats.get("games_won"));
            dva.setTimePlayed((double) usDvaGenStats.get("time_played"));
            dva.setCriticalHits((double) usDvaGenStats.get("critical_hits"));
            dva.setCriticalHitAccuracy((double) usDvaGenStats.get("critical_hit_accuracy"));

            //Genji Stats Initialization
            genji.setDragonbladeKills((double) usGenjiStats.get("dragonblade_kills"));
            genji.setDragonbladeKillsAverage((double) usGenjiAvgStats.get("dragonblade_kills_average"));
            genji.setDragonbladeKillsMostGame((double) usGenjiStats.get("dragonblade_kills_most_in_game"));
            genji.setDragonblades((double) usGenjiStats.get("dragonblades"));
            genji.setDamageReflected((double) usGenjiStats.get("damage_reflected"));
            genji.setDamageReflectedAverage((double) usGenjiAvgStats.get("damage_reflected_average"));
            genji.setDamageReflectedMostGame((double) usGenjiStats.get("damage_reflected_most_in_game"));

            //Implementing Genji General Stats
            genji.setEliminations((double) usGenjiGenStats.get("eliminations"));
            genji.setEliminationsAverage((double) usGenjiAvgStats.get("eliminations_average"));
            genji.setDeaths((double) usGenjiGenStats.get("deaths"));
            genji.setDeathsAverage((double) usGenjiAvgStats.get("deaths_average"));
            genji.setSoloKills((double) usGenjiGenStats.get("solo_kills"));
            genji.setSoloKillsAverage((double) usGenjiAvgStats.get("solo_kills_average"));
            genji.setObjectiveKills((double) usGenjiGenStats.get("objective_kills"));
            genji.setObjectiveKillsAverage((double) usGenjiAvgStats.get("objective_kills_average"));
            genji.setWeaponAccuracy((double) usGenjiGenStats.get("weapon_accuracy"));
            genji.setGamesWon((double) usGenjiGenStats.get("games_won"));
            genji.setTimePlayed((double) usGenjiGenStats.get("time_played"));
            genji.setCriticalHits((double) usGenjiGenStats.get("critical_hits"));
            genji.setCriticalHitAccuracy((double) usGenjiGenStats.get("critical_hit_accuracy"));

            //Ana Stats initialization
            ana.setEnemiesSlept((double) usAnaGenStats.get("enemies_slept"));
            ana.setEnemiesSleptAverage((double) usAnaAvgStats.get("enemies_slept_average"));
            ana.setEnemiesSleptMostGame((double) usAnaGenStats.get("enemies_slept_most_in_game"));
            ana.setNanoBoostApplied((double) usAnaStats.get("nano_boosts_applied"));
            ana.setNanoBoostAppliedAverage((double) usAnaAvgStats.get("nano_boosts_applied_average"));
            ana.setNanoBoostAppliedMostGame((double) usAnaGenStats.get("nano_boosts_applied_most_in_game"));
            ana.setNanoBoostAssists((double) usAnaStats.get("nano_boost_assists"));
            ana.setNanoBoostAssistsAverage((double) usAnaAvgStats.get("nano_boost_assists_average"));
            ana.setNanoBoostsAssistsMostGame((double) usAnaStats.get("nano_boost_assists_most_in_game"));
            ana.setScopedAccuracy((double) usAnaStats.get("scoped_accuracy"));
            ana.setScopedAccuracyBest((double) usAnaStats.get("scoped_accuracy_best_in_game"));
            ana.setUnscopedAccuracy((double) usAnaStats.get("unscoped_accuracy"));
            ana.setUnscopedAccuracyBest((double) usAnaGenStats.get("unscoped_accuracy_best_in_game"));
            ana.setSelfHealing((double) usAnaGenStats.get("self_healing"));
            ana.setSelfHealingAverage((double) usAnaAvgStats.get("self_healing_average"));
            ana.setSelfHealingMostGame((double) usAnaGenStats.get("self_healing_most_in_game"));

            //Implementing Ana General Stats
            ana.setEliminations((double) usAnaGenStats.get("eliminations"));
            ana.setEliminationsAverage((double) usAnaAvgStats.get("eliminations_average"));
            ana.setDeaths((double) usAnaGenStats.get("deaths"));
            ana.setDeathsAverage((double) usAnaAvgStats.get("deaths_average"));
            ana.setSoloKills((double) usAnaGenStats.get("solo_kills"));
            ana.setSoloKillsAverage((double) usAnaAvgStats.get("solo_kills_average"));
            ana.setObjectiveKills((double) usAnaGenStats.get("objective_kills"));
            ana.setObjectiveKillsAverage((double) usAnaAvgStats.get("objective_kills_average"));
            ana.setWeaponAccuracy((double) usAnaGenStats.get("weapon_accuracy"));
            ana.setGamesWon((double) usAnaGenStats.get("games_won"));
            ana.setTimePlayed((double) usAnaGenStats.get("time_played"));

            //Widowmaker Stats
            widowmaker.setScopedAccuracy((double) usWidowmakerStats.get("scoped_accuracy"));
            widowmaker.setScopedAccuracyBestGame((double) usWidowmakerStats.get("scoped_accuracy_best_in_game"));
            widowmaker.setVenomMineKills((double) usWidowmakerStats.get("venom_mine_kills"));
            widowmaker.setVenomMineKillsAverage((double) usWidowmakerAvgStats.get("venom_mine_kills_average"));
            widowmaker.setVenomMineKillsMostGame((double) usWidowmakerStats.get("venom_mine_kills_most_in_game"));
            
            //Implementing Widowmaker General Stats

            widowmaker.setEliminations((double) usWidowmakerGenStats.get("eliminations"));
            widowmaker.setEliminationsAverage((double) usWidowmakerAvgStats.get("eliminations_average"));
            widowmaker.setDeaths((double) usWidowmakerGenStats.get("deaths"));
            widowmaker.setDeathsAverage((double) usWidowmakerAvgStats.get("deaths_average"));
            widowmaker.setSoloKills((double) usWidowmakerGenStats.get("solo_kills"));
            widowmaker.setSoloKillsAverage((double) usWidowmakerAvgStats.get("solo_kills_average"));
            widowmaker.setObjectiveKills((double) usWidowmakerGenStats.get("objective_kills"));
            widowmaker.setObjectiveKillsAverage((double) usWidowmakerAvgStats.get("objective_kills_average"));
            widowmaker.setWeaponAccuracy((double) usWidowmakerGenStats.get("weapon_accuracy"));
            widowmaker.setGamesWon((double) usWidowmakerGenStats.get("games_won"));
            widowmaker.setTimePlayed((double) usWidowmakerGenStats.get("time_played"));
            widowmaker.setCriticalHits((double) usWidowmakerGenStats.get("critical_hits"));
            widowmaker.setCriticalHitAccuracy((double) usWidowmakerGenStats.get("critical_hit_accuracy"));
            
            //Initializing Mei stats
            mei.setBlizzardKills((double) usMeiStats.get("blizzard_kills"));
            mei.setBlizzardKillsAverage((double) usMeiAvgStats.get("blizzard_kills_average"));
            mei.setBlizzardKillsMostGame((double) usMeiStats.get("blizzard_kills_most_in_game"));
            
            //Implementing Mei General Stats

            mei.setEliminations((double) usMeiGenStats.get("eliminations"));
            mei.setEliminationsAverage((double) usMeiAvgStats.get("eliminations_average"));
            mei.setDeaths((double) usMeiGenStats.get("deaths"));
            mei.setDeathsAverage((double) usMeiAvgStats.get("deaths_average"));
            mei.setSoloKills((double) usMeiGenStats.get("solo_kills"));
            mei.setSoloKillsAverage((double) usMeiAvgStats.get("solo_kills_average"));
            mei.setObjectiveKills((double) usMeiGenStats.get("objective_kills"));
            mei.setObjectiveKillsAverage((double) usMeiAvgStats.get("objective_kills_average"));
            mei.setWeaponAccuracy((double) usMeiGenStats.get("weapon_accuracy"));
            mei.setGamesWon((double) usMeiGenStats.get("games_won"));
            mei.setTimePlayed((double) usMeiGenStats.get("time_played"));
            mei.setCriticalHits((double) usMeiGenStats.get("critical_hits"));
            mei.setCriticalHitAccuracy((double) usMeiGenStats.get("critical_hit_accuracy"));
            
            //Symmetra Initialization
            symmetra.setPlayersTeleported((double) usSymmetraStats.get("players_teleported"));
            symmetra.setPlayersTeleportedAverage((double) usSymmetraAvgStats.get("players_teleported_average"));
            symmetra.setPlayersTeleportedMostGame((double) usSymmetraStats.get("players_teleported_most_in_game"));
            
            //Implementing Symmetra General Stats

            symmetra.setEliminations((double) usSymmetraGenStats.get("eliminations"));
            symmetra.setEliminationsAverage((double) usSymmetraAvgStats.get("eliminations_average"));
            symmetra.setDeaths((double) usSymmetraGenStats.get("deaths"));
            symmetra.setDeathsAverage((double) usSymmetraAvgStats.get("deaths_average"));
            symmetra.setSoloKills((double) usSymmetraGenStats.get("solo_kills"));
            symmetra.setSoloKillsAverage((double) usSymmetraAvgStats.get("solo_kills_average"));
            symmetra.setObjectiveKillsAverage((double) usSymmetraAvgStats.get("objective_kills_average"));
            symmetra.setGamesWon((double) usSymmetraGenStats.get("games_won"));
            symmetra.setTimePlayed((double) usSymmetraGenStats.get("time_played"));

            //Implementing Reinhardt General Stats
            reinhardt.setEliminations((double) usReinhardtGenStats.get("eliminations"));
            reinhardt.setEliminationsAverage((double) usReinhardtAvgStats.get("eliminations_average"));
            reinhardt.setDeaths((double) usReinhardtGenStats.get("deaths"));
            reinhardt.setDeathsAverage((double) usReinhardtAvgStats.get("deaths_average"));
            reinhardt.setSoloKills((double) usReinhardtGenStats.get("solo_kills"));
            reinhardt.setSoloKillsAverage((double) usReinhardtAvgStats.get("solo_kills_average"));
            reinhardt.setObjectiveKills((double) usReinhardtGenStats.get("objective_kills"));
            reinhardt.setObjectiveKillsAverage((double) usReinhardtAvgStats.get("objective_kills_average"));
            reinhardt.setGamesWon((double) usReinhardtGenStats.get("games_won"));
            reinhardt.setTimePlayed((double) usReinhardtGenStats.get("time_played"));

            //Implementing Hanzo General Stats
            hanzo.setEliminations((double) usHanzoGenStats.get("eliminations"));
            hanzo.setEliminationsAverage((double) usHanzoAvgStats.get("eliminations_average"));
            hanzo.setDeaths((double) usHanzoGenStats.get("deaths"));
            hanzo.setDeathsAverage((double) usHanzoAvgStats.get("deaths_average"));
            hanzo.setSoloKills((double) usHanzoGenStats.get("solo_kills"));
            hanzo.setSoloKillsAverage((double) usHanzoAvgStats.get("solo_kills_average"));
            hanzo.setObjectiveKills((double) usHanzoGenStats.get("objective_kills"));
            hanzo.setObjectiveKillsAverage((double) usHanzoAvgStats.get("objective_kills_average"));
            hanzo.setWeaponAccuracy((double) usHanzoGenStats.get("weapon_accuracy"));
            hanzo.setGamesWon((double) usHanzoGenStats.get("games_won"));
            hanzo.setTimePlayed((double) usHanzoGenStats.get("time_played"));
            hanzo.setCriticalHits((double) usHanzoGenStats.get("critical_hits"));
            hanzo.setCriticalHitAccuracy((double) usHanzoGenStats.get("critical_hit_accuracy"));
            
            //Implementing JunkRat General Stats
            junkrat.setEliminations((double) usJunkRatGenStats.get("eliminations"));
            junkrat.setEliminationsAverage((double) usJunkRatAvgStats.get("eliminations_average"));
            junkrat.setDeaths((double) usJunkRatGenStats.get("deaths"));
            junkrat.setDeathsAverage((double) usJunkRatAvgStats.get("deaths_average"));
            junkrat.setSoloKills((double) usJunkRatGenStats.get("solo_kills"));
            junkrat.setSoloKillsAverage((double) usJunkRatAvgStats.get("solo_kills_average"));
            junkrat.setObjectiveKills((double) usJunkRatGenStats.get("objective_kills"));
            junkrat.setObjectiveKillsAverage((double) usJunkRatAvgStats.get("objective_kills_average"));
            junkrat.setWeaponAccuracy((double) usJunkRatGenStats.get("weapon_accuracy"));
            junkrat.setGamesWon((double) usJunkRatGenStats.get("games_won"));
            junkrat.setTimePlayed((double) usJunkRatGenStats.get("time_played"));

            //Implementing McCree General Stats
//            mcCree.setEliminations((double) usMcCreeGenStats.get("eliminations"));
//            mcCree.setEliminationsAverage((double) usMcCreeAvgStats.get("eliminations_average"));
//            mcCree.setDeaths((double) usMcCreeGenStats.get("deaths"));
//            mcCree.setDeathsAverage((double) usMcCreeAvgStats.get("deaths_average"));
//            mcCree.setSoloKills((double) usMcCreeGenStats.get("solo_kills"));
//            mcCree.setSoloKillsAverage((double) usMcCreeAvgStats.get("solo_kills_average"));
//            mcCree.setObjectiveKills((double) usMcCreeGenStats.get("objective_kills"));
//            mcCree.setObjectiveKillsAverage((double) usMcCreeAvgStats.get("objective_kills_average"));
//            mcCree.setWeaponAccuracy((double) usMcCreeGenStats.get("weapon_accuracy"));
//            mcCree.setGamesWon((double) usMcCreeGenStats.get("games_won"));
//            mcCree.setTimePlayed((double) usMcCreeGenStats.get("time_played"));
//            mcCree.setCriticalHits((double) usMcCreeGenStats.get("critical_hits"));
//            mcCree.setCriticalHitAccuracy((double) usMcCreeGenStats.get("critical_hit_accuracy"));

            //Implementing Pharah General Stats
//            pharah.setEliminations((double) usPharahGenStats.get("eliminations"));
//            pharah.setEliminationsAverage((double) usPharahAvgStats.get("eliminations_average"));
//            pharah.setDeaths((double) usPharahGenStats.get("deaths"));
//            pharah.setDeathsAverage((double) usPharahAvgStats.get("deaths_average"));
//            pharah.setSoloKills((double) usPharahGenStats.get("solo_kills"));
//            pharah.setSoloKillsAverage((double) usPharahAvgStats.get("solo_kills_average"));
//            pharah.setObjectiveKills((double) usPharahGenStats.get("objective_kills"));
//            pharah.setObjectiveKillsAverage((double) usPharahAvgStats.get("objective_kills_average"));
//            pharah.setWeaponAccuracy((double) usPharahGenStats.get("weapon_accuracy"));
//            pharah.setGamesWon((double) usPharahGenStats.get("games_won"));
//            pharah.setTimePlayed((double) usPharahGenStats.get("time_played"));
//            pharah.setCriticalHits((double) usPharahGenStats.get("critical_hits"));
//            pharah.setCriticalHitAccuracy((double) usPharahGenStats.get("critical_hit_accuracy"));

            //Implementing Lucio General Stats
//            lucio.setEliminations((double) usLucioGenStats.get("eliminations"));
//            lucio.setEliminationsAverage((double) usLucioAvgStats.get("eliminations_average"));
//            lucio.setDeaths((double) usLucioGenStats.get("deaths"));
//            lucio.setDeathsAverage((double) usLucioAvgStats.get("deaths_average"));
//            lucio.setSoloKills((double) usLucioGenStats.get("solo_kills"));
//            lucio.setSoloKillsAverage((double) usLucioAvgStats.get("solo_kills_average"));
//            lucio.setObjectiveKills((double) usLucioGenStats.get("objective_kills"));
//            lucio.setObjectiveKillsAverage((double) usLucioAvgStats.get("objective_kills_average"));
//            lucio.setWeaponAccuracy((double) usLucioGenStats.get("weapon_accuracy"));
//            lucio.setGamesWon((double) usLucioGenStats.get("games_won"));
//            lucio.setTimePlayed((double) usLucioGenStats.get("time_played"));
//            lucio.setCriticalHits((double) usLucioGenStats.get("critical_hits"));
//            lucio.setCriticalHitAccuracy((double) usLucioGenStats.get("critical_hit_accuracy"));

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
