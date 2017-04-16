package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Tracer extends Hero {

    //variables unqiue to Tracer
    String pulseBombKills;
    String pulseBombKillsAverage;
    String pulseBombKillsMostGame;
    String pulseBombsAttached;
    String pulseBombsAttachedAverage;
    String pulseBombsMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
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
        //set variables unqiue to Tracer
        this.pulseBombKills = "tracer";
        this.pulseBombKillsAverage = "tracer";
        this.pulseBombKillsMostGame = "tracer";
        this.pulseBombsAttached = "tracer";
        this.pulseBombsAttachedAverage = "tracer";
        this.pulseBombsMostGame = "tracer";
        this.selfHealing = "tracer";
        this.selfHealingAverage = "tracer";
        this.selfHealingMostGame = "tracer";

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

    @Override
    public String toString() {
        return name;
    }
}
