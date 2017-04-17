package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Zenyatta hero
 *
 * @author Michael Lyn
 */
public class Zenyatta extends Hero {

    //variables unqiue to Zenyatta
    double transcendenceHealing;
    double transcendenceHealingBest;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels to display variables of Zenyatta
    Label lblTranscendenceHealing;
    Label lblTranscendenceHealingBest;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> zenyattaLabels;

    /**
     * Zenyatta constructor, pass name to hero class
     */
    public Zenyatta() {

        //hero's name
        super.name = "Zenyatta";

    }

    /**
     * Method to generate labels for Zenyatta unique stats
     */
    public void labels() {
        //array list of labels for variables of Zenyatta
        zenyattaLabels = new ArrayList<>();
        zenyattaLabels.add(lblTranscendenceHealing = new Label("Transcedence Healing: " + transcendenceHealing));
        zenyattaLabels.add(lblTranscendenceHealingBest = new Label("Transcendence Healing Best: " + transcendenceHealingBest));
        zenyattaLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        zenyattaLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        zenyattaLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = zenyattaLabels;
    }

    /**
     * set Zenyatta transcendenceHealing
     *
     * @param transcendenceHealing
     */
    public void setTranscendenceHealing(double transcendenceHealing) {
        this.transcendenceHealing = transcendenceHealing;
    }

    /**
     * set Zenyatta transcendenceHealingBest
     *
     * @param transcendenceHealingBest
     */
    public void setTranscendenceHealingBest(double transcendenceHealingBest) {
        this.transcendenceHealingBest = transcendenceHealingBest;
    }

    /**
     * set Zenyatta selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Zenyatta selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Zenyatta selfHealingMostGame
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
