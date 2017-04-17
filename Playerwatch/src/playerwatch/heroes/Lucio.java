package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Lucio() {

        //hero's name
        super.name = "Lucio";

    }
    
    public void labels(){
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

    public void setSoundBarriersProvided(double soundBarriersProvided) {
        this.soundBarriersProvided = soundBarriersProvided;
    }

    public void setSoundBarriersProvidedAverage(double soundBarriersProvidedAverage) {
        this.soundBarriersProvidedAverage = soundBarriersProvidedAverage;
    }

    public void setSoundBarriersProvidedMostGame(double soundBarriersProvidedMostGame) {
        this.soundBarriersProvidedMostGame = soundBarriersProvidedMostGame;
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
