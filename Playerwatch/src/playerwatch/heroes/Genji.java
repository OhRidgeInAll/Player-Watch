package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Genji hero
 *
 * @author Michael Lyn
 */
public class Genji extends Hero {

    //variables unqiue to Genji
    double damageReflected;
    double damageReflectedAverage;
    double damageReflectedMostGame;
    double dragonbladeKills;
    double dragonbladeKillsAverage;
    double dragonbladeKillsMostGame;
    double dragonblades;
    //labels to display variables of Genji
    Label lblDamageReflected;
    Label lblDamageReflectedAverage;
    Label lblDamageReflectedMostGame;
    Label lblDragonbladeKills;
    Label lblDragonbladeKillsAverage;
    Label lblDragonbladeKillsMostGame;
    Label lblDragonblades;
    ArrayList<Label> genjiLabels;

    /**
     * Genji constructor, pass hero's name
     */
    public Genji() {

        //hero's name
        super.name = "Genji";

    }

    /**
     * Method to generate labels of Genji unique stats
     */
    public void labels() {
        //array list of labels for variables of Genji
        genjiLabels = new ArrayList<>();
        genjiLabels.add(lblDamageReflected = new Label("Damage Reflected: " + damageReflected));
        genjiLabels.add(lblDamageReflectedAverage = new Label("Damage Reflected Average: " + damageReflectedAverage));
        genjiLabels.add(lblDamageReflectedMostGame = new Label("Damage Reflected Most Game: " + damageReflectedMostGame));
        genjiLabels.add(lblDragonbladeKills = new Label("Dragonblade Kills: " + dragonbladeKills));
        genjiLabels.add(lblDragonbladeKillsAverage = new Label("Dragonblade Kills Average: " + dragonbladeKillsAverage));
        genjiLabels.add(lblDragonbladeKillsMostGame = new Label("Dragonblade Kills Most Game: " + dragonbladeKillsMostGame));
        genjiLabels.add(lblDragonblades = new Label("Dragonblades: " + dragonblades));
        super.uniqueLabels = genjiLabels;
    }

    /**
     * set Genji damageReflected
     *
     * @param damageReflected
     */
    public void setDamageReflected(double damageReflected) {
        this.damageReflected = damageReflected;
    }

    /**
     * set Genji damageReflectedAverage
     *
     * @param damageReflectedAverage
     */
    public void setDamageReflectedAverage(double damageReflectedAverage) {
        this.damageReflectedAverage = damageReflectedAverage;
    }

    /**
     * set Genji damageReflectedMostGame
     *
     * @param damageReflectedMostGame
     */
    public void setDamageReflectedMostGame(double damageReflectedMostGame) {
        this.damageReflectedMostGame = damageReflectedMostGame;
    }

    /**
     * set Genji dragonbladeKills
     *
     * @param dragonbladeKills
     */
    public void setDragonbladeKills(double dragonbladeKills) {
        this.dragonbladeKills = dragonbladeKills;
    }

    /**
     * set Genji dragonbladeKillsAverage
     *
     * @param dragonbladeKillsAverage
     */
    public void setDragonbladeKillsAverage(double dragonbladeKillsAverage) {
        this.dragonbladeKillsAverage = dragonbladeKillsAverage;
    }

    /**
     * set Genji dragonbladeKillsMostGame
     *
     * @param dragonbladeKillsMostGame
     */
    public void setDragonbladeKillsMostGame(double dragonbladeKillsMostGame) {
        this.dragonbladeKillsMostGame = dragonbladeKillsMostGame;
    }

    /**
     * set Genji dragonblades
     *
     * @param dragonblades
     */
    public void setDragonblades(double dragonblades) {
        this.dragonblades = dragonblades;
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
