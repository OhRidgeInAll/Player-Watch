package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Reinhardt hero
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

    /**
     * Reinhardt constructor, pass name to hero class
     */
    public Reinhardt() {

        //hero's name
        super.name = "Reinhardt";

    }

    /**
     * Method to generate labels for Reinhardt unique stats
     */
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

    /**
     * set Reinhardt chargeKills
     *
     * @param chargeKills
     */
    public void setChargeKills(double chargeKills) {
        this.chargeKills = chargeKills;
    }

    /**
     * set Reinhardt chargeKillsAverage
     *
     * @param chargeKillsAverage
     */
    public void setChargeKillsAverage(double chargeKillsAverage) {
        this.chargeKillsAverage = chargeKillsAverage;
    }

    /**
     * set Reinhardt chargeKillsMostGame
     *
     * @param chargeKillsMostGame
     */
    public void setChargeKillsMostGame(double chargeKillsMostGame) {
        this.chargeKillsMostGame = chargeKillsMostGame;
    }

    /**
     * set Reinhardt damageBlocked
     *
     * @param damageBlocked
     */
    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    /**
     * set Reinhardt damageBlockedAverage
     *
     * @param damageBlockedAverage
     */
    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    /**
     * set Reinhardt damageBlockedMostGame
     *
     * @param damageBlockedMostGame
     */
    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    /**
     * set Reinhardt earthShatterKills
     *
     * @param earthShatterKills
     */
    public void setEarthShatterKills(double earthShatterKills) {
        this.earthShatterKills = earthShatterKills;
    }

    /**
     * set Reinhardt earthShatterKillsAverage
     *
     * @param earthShatterKillsAverage
     */
    public void setEarthShatterKillsAverage(double earthShatterKillsAverage) {
        this.earthShatterKillsAverage = earthShatterKillsAverage;
    }

    /**
     * set Reinhardt earthShatterKillsMostGame
     *
     * @param earthShatterKillsMostGame
     */
    public void setEarthShatterKillsMostGame(double earthShatterKillsMostGame) {
        this.earthShatterKillsMostGame = earthShatterKillsMostGame;
    }

    /**
     * set Reinhardt fireStrikeKills
     *
     * @param fireStrikeKills
     */
    public void setFireStrikeKills(double fireStrikeKills) {
        this.fireStrikeKills = fireStrikeKills;
    }

    /**
     * set Reinhardt fireStrikeKillsAverage
     *
     * @param fireStrikeKillsAverage
     */
    public void setFireStrikeKillsAverage(double fireStrikeKillsAverage) {
        this.fireStrikeKillsAverage = fireStrikeKillsAverage;
    }

    /**
     * set Reinhardt fireStrikeKillsMostGame
     *
     * @param fireStrikeKillsMostGame
     */
    public void setFireStrikeKillsMostGame(double fireStrikeKillsMostGame) {
        this.fireStrikeKillsMostGame = fireStrikeKillsMostGame;
    }

    /**
     * Override toString() method
     *
     * @return name - hero's name
     */
    @Override
    public String toString() {
        return name;
    }
}
