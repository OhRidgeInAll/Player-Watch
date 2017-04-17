package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Tracer hero
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

    /**
     * Tracer constructor, pass name to hero class
     */
    public Tracer() {

        //hero's name
        super.name = "Tracer";

    }

    /**
     * Method to generate labels for Tracer unique stats
     */
    public void labels() {
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

    /**
     * set Tracer pulseBombKills
     *
     * @param pulseBombKills
     */
    public void setPulseBombKills(double pulseBombKills) {
        this.pulseBombKills = pulseBombKills;
    }

    /**
     * set Tracer pulseBombKillsAverage
     *
     * @param pulseBombKillsAverage
     */
    public void setPulseBombKillsAverage(double pulseBombKillsAverage) {
        this.pulseBombKillsAverage = pulseBombKillsAverage;
    }

    /**
     * set Tracer pulseBombKillsMostGame
     *
     * @param pulseBombKillsMostGame
     */
    public void setPulseBombKillsMostGame(double pulseBombKillsMostGame) {
        this.pulseBombKillsMostGame = pulseBombKillsMostGame;
    }

    /**
     * set Tracer pulseBombsAttached
     *
     * @param pulseBombsAttached
     */
    public void setPulseBombsAttached(double pulseBombsAttached) {
        this.pulseBombsAttached = pulseBombsAttached;
    }

    /**
     * set Tracer pulseBombsAttachedAverage
     *
     * @param pulseBombsAttachedAverage
     */
    public void setPulseBombsAttachedAverage(double pulseBombsAttachedAverage) {
        this.pulseBombsAttachedAverage = pulseBombsAttachedAverage;
    }

    /**
     * set Tracer pulseBombsMostGame
     *
     * @param pulseBombsMostGame
     */
    public void setPulseBombsMostGame(double pulseBombsMostGame) {
        this.pulseBombsMostGame = pulseBombsMostGame;
    }

    /**
     * set Tracer selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Tracer selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Tracer selfHealingMostGame
     *
     * @param selfHealingMostGame
     */
    public void setSelfHealingMostGame(double selfHealingMostGame) {
        this.selfHealingMostGame = selfHealingMostGame;
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
