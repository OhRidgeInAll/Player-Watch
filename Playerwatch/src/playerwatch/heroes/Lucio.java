package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Lucio extends Hero {

    //variables unqiue to Lucio
    String soundBarriersProvided;
    String soundBarriersProvidedAverage;
    String soundBarriersProvidedMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
    //labels to display variables of Lucio
    Label lblSoundBarriersProvided;
    Label lblSoundBarriersProvidedAverage;
    Label lblSoundBarriersProvidedMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> lucioLabels;

    public Lucio() {

        //hero's name
        super.name = "Lucio";
        //set variables unqiue to Lucio
        this.soundBarriersProvided = "lucio";
        this.soundBarriersProvidedAverage = "lucio";
        this.soundBarriersProvidedMostGame = "lucio";
        this.selfHealing = "lucio";
        this.selfHealingAverage = "lucio";
        this.selfHealingMostGame = "lucio";
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

    @Override
    public String toString() {
        return name;
    }
}
