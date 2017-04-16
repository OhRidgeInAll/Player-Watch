package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Mercy extends Hero {

    //variables unqiue to Mercy
    String blasterKills;
    String blasterKillsAverage;
    String blasterKillsMostGame;
    String playersResurrected;
    String playersResurrectedAverage;
    String playersResurrectedMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
    //labels to display variables of Mercy
    Label lblBlasterKills;
    Label lblBlasterKillsAverage;
    Label lblBlasterKillsMostGame;
    Label lblPlayersResurrected;
    Label lblPlayersResurrectedAverage;
    Label lblPlayersResurrectedMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> mercyLabels;

    public Mercy() {

        //hero's name
        super.name = "Mercy";
        //set variables unqiue to Mercy
        this.blasterKills = "mermer";
        this.blasterKillsAverage = "mermer";
        this.blasterKillsMostGame = "mermer";
        this.playersResurrected = "mermer";
        this.playersResurrectedAverage = "mermer";
        this.playersResurrectedMostGame = "mermer";
        this.selfHealing = "mermer";
        this.selfHealingAverage = "mermer";
        this.selfHealingMostGame = "mermer";

        //array list of labels for variables of Mercy
        mercyLabels = new ArrayList<>();
        mercyLabels.add(lblBlasterKills = new Label("Blaster Kills: " + blasterKills));
        mercyLabels.add(lblBlasterKillsAverage = new Label("Blaster Kills Average: " + blasterKillsAverage));
        mercyLabels.add(lblBlasterKillsMostGame = new Label("Blaster Kills Most Game: " + blasterKillsMostGame));
        mercyLabels.add(lblPlayersResurrected = new Label("Players Resurrected: " + playersResurrected));
        mercyLabels.add(lblPlayersResurrectedAverage = new Label("Players Resurrected Average: " + playersResurrectedAverage));
        mercyLabels.add(lblPlayersResurrectedMostGame = new Label("Players Resurrected Most Game: " + playersResurrectedMostGame));
        mercyLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        mercyLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        mercyLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = mercyLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
