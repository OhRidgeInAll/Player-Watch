package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Ana extends Hero {

    //variables unique to Ana
    String enemiesSlept;
    String enemiesSleptAverage;
    String enemiesSleptMostGame;
    String healingPrevented;
    String healingPreventedAverage;
    String healingPreventedMostGame;
    String nanoBoostAssists;
    String nanoBoostAssistsAverage;
    String nanoBoostsAssistsMostGame;
    String nanoBoostApplied;
    String nanoBoostAppliedAverage;
    String nanoBoostAppliedMostGame;
    String scopedAccuracy;
    String scopedAccuracyBest;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
    String unscopedAccuracy;
    String unscopedAccuracyBest;
    //labels to display variables unique to Ana
    Label lblEnemiesSlept;
    Label lblEnemiesSleptAverage;
    Label lblEnemiesSleptMostGame;
    Label lblHealingPrevented;
    Label lblHealingPreventedAverage;
    Label lblHealingPreventedMostGame;
    Label lblNanoBoostAssists;
    Label lblNanoBoostAssistsAverage;
    Label lblNanoBoostsAssistsMostGame;
    Label lblNanoBoostApplied;
    Label lblNanoBoostAppliedAverage;
    Label lblNanoBoostAppliedMostGame;
    Label lblScopedAccuracy;
    Label lblScopedAccuracyBest;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    Label lblUnscopedAccuracy;
    Label lblUnscopedAccuracyBest;
    ArrayList<Label> anaLabels;

    public Ana() {

        //hero's name
        super.name = "Ana";
        //set variables for Ana
        this.enemiesSlept = "5";
        this.enemiesSleptAverage = "5";
        this.enemiesSleptMostGame = "5";
        this.healingPrevented = "5";
        this.healingPreventedAverage = "5";
        this.healingPreventedMostGame = "5";
        this.nanoBoostAssists = "5";
        this.nanoBoostAssistsAverage = "5";
        this.nanoBoostsAssistsMostGame = "5";
        this.nanoBoostApplied = "5";
        this.nanoBoostAppliedAverage = "5";
        this.nanoBoostAppliedMostGame = "5";
        this.scopedAccuracy = "5";
        this.scopedAccuracyBest = "5";
        this.selfHealing = "5";
        this.selfHealingAverage = "5";
        this.selfHealingMostGame = "5";
        this.unscopedAccuracy = "5";
        this.unscopedAccuracyBest = "5";
        
        //array list of labels to display variables of Ana
        this.anaLabels = new ArrayList<>();
        anaLabels.add(lblEnemiesSlept = new Label("Enemies Slept: " + enemiesSlept));
        anaLabels.add(lblEnemiesSleptAverage = new Label("Enemies Slept Average: " + enemiesSleptAverage));
        anaLabels.add(lblEnemiesSleptMostGame = new Label("Enemies Slept Most Game: " + enemiesSleptMostGame));
        anaLabels.add(lblHealingPrevented = new Label("Healing Prevented: " + healingPrevented));
        anaLabels.add(lblHealingPreventedAverage = new Label("Healing Prevented Average: " + healingPreventedAverage));
        anaLabels.add(lblHealingPreventedMostGame = new Label("Healing Prevented Most Game: " + healingPreventedMostGame));
        anaLabels.add(lblNanoBoostAssists = new Label("Nano Boost Assists: " + nanoBoostAssists));
        anaLabels.add(lblNanoBoostAssistsAverage = new Label("Nano Boost Assists Average: " + nanoBoostAssistsAverage));
        anaLabels.add(lblNanoBoostsAssistsMostGame = new Label("Nano Boost Assits Most Game: " + nanoBoostsAssistsMostGame));
        anaLabels.add(lblNanoBoostApplied = new Label("Nano Boost Applied: " + nanoBoostApplied));
        anaLabels.add(lblNanoBoostAppliedAverage = new Label("Nano Boost Applied Average: " + nanoBoostAppliedAverage));
        anaLabels.add(lblNanoBoostAppliedMostGame = new Label("Nano Boost Applied Most Game: " + nanoBoostAppliedMostGame));
        anaLabels.add(lblScopedAccuracy = new Label("Scoped Accuracy: " + scopedAccuracy));
        anaLabels.add(lblScopedAccuracyBest = new Label("Scoped Accuracy Best: " + scopedAccuracyBest));
        anaLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        anaLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        anaLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        anaLabels.add(lblUnscopedAccuracy = new Label("Unscoped Accuracy: " + unscopedAccuracy));
        anaLabels.add(lblUnscopedAccuracyBest = new Label("Unscoped Accuracy Best: " + unscopedAccuracyBest));
        super.uniqueLabels = anaLabels;

    }

    @Override
    public String toString() {
        return name;
    }
}
