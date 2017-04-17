package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Tracer extends Hero {

    //variables unqiue to Tracer
    double pulseBombKills;
    double pulseBombKillsAverage;
    double pulseBombKillsMostGame;
    double pulseBombsAttached;
    double pulseBombsAttachedAverage;
    double pulseBombsMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels to display variables of Tracer
    Label lblPulseBombKills;
    Label lblPulseBombKillsAverage;
    Label lblPulseBombKillsMostGame;
    Label lblPulseBombsAttached;
    Label lblPulseBombsAttachedAverage;
    Label lblPulseBombsMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> tracerLabels;

    public Tracer() {

        //hero's name
        super.name = "Tracer";

    }
    
    public void labels(){
        //array list of labels for variables of Tracer
        tracerLabels = new ArrayList<>();
        tracerLabels.add(lblPulseBombKills = new Label("Pulse Bomb Kills: " + pulseBombKills));
        tracerLabels.add(lblPulseBombKillsAverage = new Label("Pulse Bomb Kills Average: " + pulseBombKillsAverage));
        tracerLabels.add(lblPulseBombKillsMostGame = new Label("Pulse Bomb Kills Most Game: " + pulseBombKillsMostGame));
        tracerLabels.add(lblPulseBombsAttached = new Label("Pulse Bombs Attached: " + pulseBombsAttached));
        tracerLabels.add(lblPulseBombsAttachedAverage = new Label("Pulse Bombs Attached Average: " + pulseBombsAttachedAverage));
        tracerLabels.add(lblPulseBombsMostGame = new Label("Pulse Bombs Most Game: " + pulseBombsMostGame));
        tracerLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        tracerLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        tracerLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = tracerLabels;
    }

    public void setPulseBombKills(double pulseBombKills) {
        this.pulseBombKills = pulseBombKills;
    }

    public void setPulseBombKillsAverage(double pulseBombKillsAverage) {
        this.pulseBombKillsAverage = pulseBombKillsAverage;
    }

    public void setPulseBombKillsMostGame(double pulseBombKillsMostGame) {
        this.pulseBombKillsMostGame = pulseBombKillsMostGame;
    }

    public void setPulseBombsAttached(double pulseBombsAttached) {
        this.pulseBombsAttached = pulseBombsAttached;
    }

    public void setPulseBombsAttachedAverage(double pulseBombsAttachedAverage) {
        this.pulseBombsAttachedAverage = pulseBombsAttachedAverage;
    }

    public void setPulseBombsMostGame(double pulseBombsMostGame) {
        this.pulseBombsMostGame = pulseBombsMostGame;
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
