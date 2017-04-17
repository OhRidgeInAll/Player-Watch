package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Reinhardt extends Hero {

    //variables unqiue to Reinhardt
    double chargeKills;
    double chargeKillsAverage;
    double chargeKillsMostGame;
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double earthShatterKills;
    double earthShatterKillsAverage;
    double earthShatterKillsMostGame;
    double fireStrikeKills;
    double fireStrikeKillsAverage;
    double fireStrikeKillsMostGame;
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

    }

    public void labels() {
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

    public void setChargeKills(double chargeKills) {
        this.chargeKills = chargeKills;
    }

    public void setChargeKillsAverage(double chargeKillsAverage) {
        this.chargeKillsAverage = chargeKillsAverage;
    }

    public void setChargeKillsMostGame(double chargeKillsMostGame) {
        this.chargeKillsMostGame = chargeKillsMostGame;
    }

    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    public void setEarthShatterKills(double earthShatterKills) {
        this.earthShatterKills = earthShatterKills;
    }

    public void setEarthShatterKillsAverage(double earthShatterKillsAverage) {
        this.earthShatterKillsAverage = earthShatterKillsAverage;
    }

    public void setEarthShatterKillsMostGame(double earthShatterKillsMostGame) {
        this.earthShatterKillsMostGame = earthShatterKillsMostGame;
    }

    public void setFireStrikeKills(double fireStrikeKills) {
        this.fireStrikeKills = fireStrikeKills;
    }

    public void setFireStrikeKillsAverage(double fireStrikeKillsAverage) {
        this.fireStrikeKillsAverage = fireStrikeKillsAverage;
    }

    public void setFireStrikeKillsMostGame(double fireStrikeKillsMostGame) {
        this.fireStrikeKillsMostGame = fireStrikeKillsMostGame;
    }

    @Override
    public String toString() {
        return name;
    }
}
