package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Genji() {

        //hero's name
        super.name = "Genji";
 
    }
    
    public void labels(){
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

    public void setDamageReflected(double damageReflected) {
        this.damageReflected = damageReflected;
    }

    public void setDamageReflectedAverage(double damageReflectedAverage) {
        this.damageReflectedAverage = damageReflectedAverage;
    }

    public void setDamageReflectedMostGame(double damageReflectedMostGame) {
        this.damageReflectedMostGame = damageReflectedMostGame;
    }

    public void setDragonbladeKills(double dragonbladeKills) {
        this.dragonbladeKills = dragonbladeKills;
    }

    public void setDragonbladeKillsAverage(double dragonbladeKillsAverage) {
        this.dragonbladeKillsAverage = dragonbladeKillsAverage;
    }

    public void setDragonbladeKillsMostGame(double dragonbladeKillsMostGame) {
        this.dragonbladeKillsMostGame = dragonbladeKillsMostGame;
    }

    public void setDragonblades(double dragonblades) {
        this.dragonblades = dragonblades;
    }

    
    @Override
    public String toString() {
        return name;
    }
}
