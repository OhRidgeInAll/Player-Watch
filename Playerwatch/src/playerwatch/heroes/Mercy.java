package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Mercy extends Hero {

    //variables unqiue to Mercy
    double blasterKills;
    double blasterKillsAverage;
    double blasterKillsMostGame;
    double playersResurrected;
    double playersResurrectedAverage;
    double playersResurrectedMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
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

    }

    public void labels() {
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

    public void setBlasterKills(double blasterKills) {
        this.blasterKills = blasterKills;
    }

    public void setBlasterKillsAverage(double blasterKillsAverage) {
        this.blasterKillsAverage = blasterKillsAverage;
    }

    public void setBlasterKillsMostGame(double blasterKillsMostGame) {
        this.blasterKillsMostGame = blasterKillsMostGame;
    }

    public void setPlayersResurrected(double playersResurrected) {
        this.playersResurrected = playersResurrected;
    }

    public void setPlayersResurrectedAverage(double playersResurrectedAverage) {
        this.playersResurrectedAverage = playersResurrectedAverage;
    }

    public void setPlayersResurrectedMostGame(double playersResurrectedMostGame) {
        this.playersResurrectedMostGame = playersResurrectedMostGame;
    }

    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    public void setSelfHealingMostGame(double selfHealingMostGame) {
        this.selfHealingMostGame = selfHealingMostGame;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
