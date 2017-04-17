package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Reinhardt extends Hero {

    //variables unqiue to Reinhardt
    String chargeKills;
    String chargeKillsAverage;
    String chargeKillsMostGame;
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String earthShatterKills;
    String earthShatterKillsAverage;
    String earthShatterKillsMostGame;
    String fireStrikeKills;
    String fireStrikeKillsAverage;
    String fireStrikeKillsMostGame;
    //labels to display variables of Reinhardt
    Label lblChargeKills;
    Label lblChargeKillsAverage;
    Label lblChargeKillsMostGame;
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblEarthShatterKills;
    Label lblEarthShatterKillsAverage;
    Label lblEarthShatterKillsMostGame;
    Label lblFireStrikeKills;
    Label lblFireStrikeKillsAverage;
    Label lblFireStrikeKillsMostGame;
    ArrayList<Label> reinhardtLabels;

    public Reinhardt() {

        //hero's name
        super.name = "Reinhardt";
        //set variables unqiue to Reinhardt
        this.chargeKills = "shield";
        this.chargeKillsAverage = "shield";
        this.chargeKillsMostGame = "shield";
        this.damageBlocked = "shield";
        this.damageBlockedAverage = "shield";
        this.damageBlockedMostGame = "shield";
        this.earthShatterKills = "shield";
        this.earthShatterKillsAverage = "shield";
        this.earthShatterKillsMostGame = "shield";
        this.fireStrikeKills = "shield";
        this.fireStrikeKillsAverage = "shield";
        this.fireStrikeKillsMostGame = "shield";

        //array list of labels for variables of Reinhardt
        reinhardtLabels = new ArrayList<>();
        reinhardtLabels.add(lblChargeKills = new Label("Charge Kills: " + chargeKills));
        reinhardtLabels.add(lblChargeKillsAverage = new Label("Charge Kills Average: " + chargeKillsAverage));
        reinhardtLabels.add(lblChargeKillsMostGame = new Label("Charge Kills Most Game: " + chargeKillsMostGame));
        reinhardtLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        reinhardtLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        reinhardtLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        reinhardtLabels.add(lblEarthShatterKills = new Label("Earth Shatter Kills: " + earthShatterKills));
        reinhardtLabels.add(lblEarthShatterKillsAverage = new Label("Earth Shatter Kills Average: " + earthShatterKillsAverage));
        reinhardtLabels.add(lblEarthShatterKillsMostGame = new Label("Earth Shatter Kills Most Game: " + earthShatterKillsMostGame));
        reinhardtLabels.add(lblFireStrikeKills = new Label("Fire Strike Kills: " + fireStrikeKills));
        reinhardtLabels.add(lblFireStrikeKillsAverage = new Label("Fire Strike Kills Average: " + fireStrikeKillsAverage));
        reinhardtLabels.add(lblFireStrikeKillsMostGame = new Label("Fire Strike Kills Most Game: " + fireStrikeKillsMostGame));
        super.uniqueLabels = reinhardtLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
