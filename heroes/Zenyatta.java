package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Zenyatta extends Hero {

    //variables unqiue to Zenyatta
    String transcendenceHealing;
    String transcendenceHealingBest;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
    //labels to display variables of Zenyatta
    Label lblTranscendenceHealing;
    Label lblTranscendenceHealingBest;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> zenyattaLabels;

    public Zenyatta() {

        //hero's name
        super.name = "Zenyatta";
        //set variables unqiue to Zenyatta
        this.transcendenceHealing = "ball";
        this.transcendenceHealingBest = "ball";
        this.selfHealing = "ball";
        this.selfHealingAverage = "ball";
        this.selfHealingMostGame = "ball";

        //array list of labels for variables of Zenyatta
        zenyattaLabels = new ArrayList<>();
        zenyattaLabels.add(lblTranscendenceHealing = new Label("Transcedence Healing: " + transcendenceHealing));
        zenyattaLabels.add(lblTranscendenceHealingBest = new Label("Transcendence Healing Best: " + transcendenceHealingBest));
        zenyattaLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        zenyattaLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        zenyattaLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = zenyattaLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
