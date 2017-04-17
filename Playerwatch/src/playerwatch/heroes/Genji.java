package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Genji extends Hero {

    //variables unqiue to Genji
    String damageReflected;
    String damageReflectedAverage;
    String damageReflectedMostGame;
    String dragonbladeKills;
    String dragonbladeKillsAverage;
    String dragonbladeKillsMostGame;
    String dragonblades;
    //labels to display variables of Genji
    Label lblDamageReflected;
    Label lblDamageReflectedAverage;
    Label lblDamageReflectedMostGame;
    Label lblDragonbladeKills;
    Label lblDragonbladeKillsAverage;
    Label lblDragonbladeKillsMostGame;
    Label lblDragonblades;
    ArrayList<Label> genjiLabels;

    public Genji() {

        //hero's name
        super.name = "Genji";
        //set variables unqiue to Genji
        this.damageReflected = "12";
        this.damageReflectedAverage = "12";
        this.damageReflectedMostGame = "12";
        this.dragonbladeKills = "12";
        this.dragonbladeKillsAverage = "12";
        this.dragonbladeKillsMostGame = "12";
        this.dragonblades = "12";
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

    @Override
    public String toString() {
        return name;
    }
}
