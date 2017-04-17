package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Lucio hero
 *
 * @author Michael Lyn
 */
public class Lucio extends Hero {

    //variables unqiue to Lucio
    double soundBarriersProvided;
    double soundBarriersProvidedAverage;
    double soundBarriersProvidedMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels to display variables of Lucio
    Label lblSoundBarriersProvided;
    Label lblSoundBarriersProvidedAverage;
    Label lblSoundBarriersProvidedMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> lucioLabels;

    /**
     * Lucio constructor, pass name to hero class
     */
    public Lucio() {

        //hero's name
        super.name = "Lucio";

    }

    /**
     * Method to generate labels of Lucio unique stats
     */
    public void labels() {
        //array list of labels for variables of Lucio
        lucioLabels = new ArrayList<>();
        lucioLabels.add(lblSoundBarriersProvided = new Label("Sound Barriers Provided: " + soundBarriersProvided));
        lucioLabels.add(lblSoundBarriersProvidedAverage = new Label("Sound Barriers Provided Average: " + soundBarriersProvidedAverage));
        lucioLabels.add(lblSoundBarriersProvidedMostGame = new Label("Sound Barriers Provided Most Game: " + soundBarriersProvidedMostGame));
        lucioLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        lucioLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        lucioLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = lucioLabels;
    }

    /**
     * set Lucio soundBarriersProvided
     *
     * @param soundBarriersProvided
     */
    public void setSoundBarriersProvided(double soundBarriersProvided) {
        this.soundBarriersProvided = soundBarriersProvided;
    }

    /**
     * set Lucio soundBarriersProvidedAverage
     *
     * @param soundBarriersProvidedAverage
     */
    public void setSoundBarriersProvidedAverage(double soundBarriersProvidedAverage) {
        this.soundBarriersProvidedAverage = soundBarriersProvidedAverage;
    }

    /**
     * set Lucio soundBarriersProvidedMostGame
     *
     * @param soundBarriersProvidedMostGame
     */
    public void setSoundBarriersProvidedMostGame(double soundBarriersProvidedMostGame) {
        this.soundBarriersProvidedMostGame = soundBarriersProvidedMostGame;
    }

    /**
     * set Lucio selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Lucio selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Lucio selfHealingMostGame
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
