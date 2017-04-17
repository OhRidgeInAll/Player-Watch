package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Zenyatta() {

        //hero's name
        super.name = "Zenyatta";

    }

    public void labels(){
        //array list of labels for variables of Zenyatta
        zenyattaLabels = new ArrayList<>();
        zenyattaLabels.add(lblTranscendenceHealing = new Label("Transcedence Healing: " + transcendenceHealing));
        zenyattaLabels.add(lblTranscendenceHealingBest = new Label("Transcendence Healing Best: " + transcendenceHealingBest));
        zenyattaLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        zenyattaLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        zenyattaLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = zenyattaLabels;
    }

    public void setTranscendenceHealing(double transcendenceHealing) {
        this.transcendenceHealing = transcendenceHealing;
    }

    public void setTranscendenceHealingBest(double transcendenceHealingBest) {
        this.transcendenceHealingBest = transcendenceHealingBest;
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
