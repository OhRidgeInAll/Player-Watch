package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Ana extends Hero {

    //variables unique to Ana
    double enemiesSlept;
    double enemiesSleptAverage;
    double enemiesSleptMostGame;
    double healingPrevented;
    double healingPreventedAverage;
    double healingPreventedMostGame;
    double nanoBoostAssists;
    double nanoBoostAssistsAverage;
    double nanoBoostsAssistsMostGame;
    double nanoBoostApplied;
    double nanoBoostAppliedAverage;
    double nanoBoostAppliedMostGame;
    double scopedAccuracy;
    double scopedAccuracyBest;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    double unscopedAccuracy;
    double unscopedAccuracyBest;
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

    }
    public void labels(){
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

    public void setEnemiesSlept(double enemiesSlept) {
        this.enemiesSlept = enemiesSlept;
    }

    public void setEnemiesSleptAverage(double enemiesSleptAverage) {
        this.enemiesSleptAverage = enemiesSleptAverage;
    }

    public void setEnemiesSleptMostGame(double enemiesSleptMostGame) {
        this.enemiesSleptMostGame = enemiesSleptMostGame;
    }

    public void setHealingPrevented(double healingPrevented) {
        this.healingPrevented = healingPrevented;
    }

    public void setHealingPreventedAverage(double healingPreventedAverage) {
        this.healingPreventedAverage = healingPreventedAverage;
    }

    public void setHealingPreventedMostGame(double healingPreventedMostGame) {
        this.healingPreventedMostGame = healingPreventedMostGame;
    }

    public void setNanoBoostAssists(double nanoBoostAssists) {
        this.nanoBoostAssists = nanoBoostAssists;
    }

    public void setNanoBoostAssistsAverage(double nanoBoostAssistsAverage) {
        this.nanoBoostAssistsAverage = nanoBoostAssistsAverage;
    }

    public void setNanoBoostsAssistsMostGame(double nanoBoostsAssistsMostGame) {
        this.nanoBoostsAssistsMostGame = nanoBoostsAssistsMostGame;
    }

    public void setNanoBoostApplied(double nanoBoostApplied) {
        this.nanoBoostApplied = nanoBoostApplied;
    }

    public void setNanoBoostAppliedAverage(double nanoBoostAppliedAverage) {
        this.nanoBoostAppliedAverage = nanoBoostAppliedAverage;
    }

    public void setNanoBoostAppliedMostGame(double nanoBoostAppliedMostGame) {
        this.nanoBoostAppliedMostGame = nanoBoostAppliedMostGame;
    }

    public void setScopedAccuracy(double scopedAccuracy) {
        this.scopedAccuracy = scopedAccuracy;
    }

    public void setScopedAccuracyBest(double scopedAccuracyBest) {
        this.scopedAccuracyBest = scopedAccuracyBest;
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

    public void setUnscopedAccuracy(double unscopedAccuracy) {
        this.unscopedAccuracy = unscopedAccuracy;
    }

    public void setUnscopedAccuracyBest(double unscopedAccuracyBest) {
        this.unscopedAccuracyBest = unscopedAccuracyBest;
    }

    public void setAnaLabels(ArrayList<Label> anaLabels) {
        this.anaLabels = anaLabels;
    }
    

    @Override
    public String toString() {
        return name;
    }
}
