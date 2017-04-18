package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Ana hero
 *
 * @author Michael Lyn
 */
public class Ana extends Hero {

    //variables unique to Ana
    double enemiesSlept;
    double enemiesSleptAverage;
    double enemiesSleptMostGame;
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

    /**
     * Ana constructor, pass name to hero class
     */
    public Ana() {

        //hero's name
        super.name = "Ana";

    }

    /**
     * Method to generate labels of Ana unique stats
     */
    public void labels() {
        //array list of labels to display variables of Ana
        this.anaLabels = new ArrayList<>();
        anaLabels.add(lblEnemiesSlept = new Label("Enemies Slept: " + enemiesSlept));
        anaLabels.add(lblEnemiesSleptAverage = new Label("Enemies Slept Average: " + enemiesSleptAverage));
        anaLabels.add(lblEnemiesSleptMostGame = new Label("Enemies Slept Most Game: " + enemiesSleptMostGame));
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

    /**
     * set Ana enemiesSlept
     *
     * @param enemiesSlept
     */
    public void setEnemiesSlept(double enemiesSlept) {
        this.enemiesSlept = enemiesSlept;
    }

    /**
     * set Ana enemiesSleptAverage
     *
     * @param enemiesSleptAverage
     */
    public void setEnemiesSleptAverage(double enemiesSleptAverage) {
        this.enemiesSleptAverage = enemiesSleptAverage;
    }

    /**
     * set Ana enemiesSleptMostGame
     *
     * @param enemiesSleptMostGame
     */
    public void setEnemiesSleptMostGame(double enemiesSleptMostGame) {
        this.enemiesSleptMostGame = enemiesSleptMostGame;
    }

    /**
     * set Ana nanoBoostAssists
     *
     * @param nanoBoostAssists
     */
    public void setNanoBoostAssists(double nanoBoostAssists) {
        this.nanoBoostAssists = nanoBoostAssists;
    }

    /**
     * set Ana nanoBoostAssistsAverage
     *
     * @param nanoBoostAssistsAverage
     */
    public void setNanoBoostAssistsAverage(double nanoBoostAssistsAverage) {
        this.nanoBoostAssistsAverage = nanoBoostAssistsAverage;
    }

    /**
     * set Ana nanoBoostsAssistsAverage
     *
     * @param nanoBoostsAssistsMostGame
     */
    public void setNanoBoostsAssistsMostGame(double nanoBoostsAssistsMostGame) {
        this.nanoBoostsAssistsMostGame = nanoBoostsAssistsMostGame;
    }

    /**
     * set Ana nanoBoostApplied
     *
     * @param nanoBoostApplied
     */
    public void setNanoBoostApplied(double nanoBoostApplied) {
        this.nanoBoostApplied = nanoBoostApplied;
    }

    /**
     * set Ana nanoBoostAppliedAverage
     *
     * @param nanoBoostAppliedAverage
     */
    public void setNanoBoostAppliedAverage(double nanoBoostAppliedAverage) {
        this.nanoBoostAppliedAverage = nanoBoostAppliedAverage;
    }

    /**
     * set Ana nanoBoostAppliedMostGame
     *
     * @param nanoBoostAppliedMostGame
     */
    public void setNanoBoostAppliedMostGame(double nanoBoostAppliedMostGame) {
        this.nanoBoostAppliedMostGame = nanoBoostAppliedMostGame;
    }

    /**
     * set Ana scopedAccuracy
     *
     * @param scopedAccuracy
     */
    public void setScopedAccuracy(double scopedAccuracy) {
        this.scopedAccuracy = scopedAccuracy;
    }

    /**
     * set Ana scopedAccuracyBest
     *
     * @param scopedAccuracyBest
     */
    public void setScopedAccuracyBest(double scopedAccuracyBest) {
        this.scopedAccuracyBest = scopedAccuracyBest;
    }

    /**
     * set Ana selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Ana selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Ana selfHealingMostGame
     *
     * @param selfHealingMostGame
     */
    public void setSelfHealingMostGame(double selfHealingMostGame) {
        this.selfHealingMostGame = selfHealingMostGame;
    }

    /**
     * set Ana unscopedAccuracy
     *
     * @param unscopedAccuracy
     */
    public void setUnscopedAccuracy(double unscopedAccuracy) {
        this.unscopedAccuracy = unscopedAccuracy;
    }

    /**
     * set Ana unscopedAccuracyBest
     *
     * @param unscopedAccuracyBest
     */
    public void setUnscopedAccuracyBest(double unscopedAccuracyBest) {
        this.unscopedAccuracyBest = unscopedAccuracyBest;
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
