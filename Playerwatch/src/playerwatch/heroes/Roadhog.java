package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Roadhog hero
 *
 * @author Michael Lyn
 */
public class Roadhog extends Hero {

//variables unique to Roadhog
    double enemiesHooked;
    double enemiesHookedAverage;
    double enemiesHookedMostGame;
    double hookAccuracy;
    double hookAccuracyBestGame;
    double hookAttempts;
    double wholeHogKills;
    double wholeHogKillsAverage;
    double wholeHogKillsMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels for variables of Roadhog
    Label lblEnemiesHooked;
    Label lblEnemiesHookedAverage;
    Label lblEnemiesHookedMostGame;
    Label lblHookAccuracy;
    Label lblHookAccuracyBestGame;
    Label lblHookAttempts;
    Label lblWholeHogKills;
    Label lblWholeHogKillsAverage;
    Label lblWholeHogKillsMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> roadhogLabels;

    /**
     * Roadhog constructor, pass name to hero class
     */
    public Roadhog() {
        //hero's name
        super.name = "Roadhog";

    }

    /**
     * Method to generate labels for Roadhog unique stats
     */
    public void labels() {
        this.roadhogLabels = new ArrayList<>();
        roadhogLabels.add(lblEnemiesHooked = new Label("Enemies Hooked: " + enemiesHooked));
        roadhogLabels.add(lblEnemiesHookedAverage = new Label("Enemies Hooked Average: " + enemiesHookedAverage));
        roadhogLabels.add(lblEnemiesHookedMostGame = new Label("Enemies Hooked Most Game: " + enemiesHookedMostGame));
        roadhogLabels.add(lblHookAccuracy = new Label("Hook Accuracy: " + hookAccuracy));
        roadhogLabels.add(lblHookAccuracyBestGame = new Label("Hook Accuracy Best Game: " + hookAccuracyBestGame));
        roadhogLabels.add(lblHookAttempts = new Label("Hook Attempts: " + hookAttempts));
        roadhogLabels.add(lblWholeHogKills = new Label("Whole Hog Kills: " + wholeHogKills));
        roadhogLabels.add(lblWholeHogKillsAverage = new Label("Whole Hog Kills Average: " + wholeHogKillsAverage));
        roadhogLabels.add(lblWholeHogKillsMostGame = new Label("Whole Hog Kills Most Game: " + wholeHogKillsMostGame));
        roadhogLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        roadhogLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        roadhogLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = roadhogLabels;
    }

    /**
     * set Roadhog enemiesHooked
     *
     * @param enemiesHooked
     */
    public void setEnemiesHooked(double enemiesHooked) {
        this.enemiesHooked = enemiesHooked;
    }

    /**
     * set Roadhog enemiesHookedAverage
     *
     * @param enemiesHookedAverage
     */
    public void setEnemiesHookedAverage(double enemiesHookedAverage) {
        this.enemiesHookedAverage = enemiesHookedAverage;
    }

    /**
     * set Roadhog enemiesHookedMostGame
     *
     * @param enemiesHookedMostGame
     */
    public void setEnemiesHookedMostGame(double enemiesHookedMostGame) {
        this.enemiesHookedMostGame = enemiesHookedMostGame;
    }

    /**
     * set Roadhog hookAccuracy
     *
     * @param hookAccuracy
     */
    public void setHookAccuracy(double hookAccuracy) {
        this.hookAccuracy = hookAccuracy;
    }

    /**
     * set Roadhog hookAccuracyBestGame
     *
     * @param hookAccuracyBestGame
     */
    public void setHookAccuracyBestGame(double hookAccuracyBestGame) {
        this.hookAccuracyBestGame = hookAccuracyBestGame;
    }

    /**
     * set Roadhog hookAttempts
     *
     * @param hookAttempts
     */
    public void setHookAttempts(double hookAttempts) {
        this.hookAttempts = hookAttempts;
    }

    /**
     * set Roadhog wholeHogKills
     *
     * @param wholeHogKills
     */
    public void setWholeHogKills(double wholeHogKills) {
        this.wholeHogKills = wholeHogKills;
    }

    /**
     * set Roadhog wholeHogKillsAverage
     *
     * @param wholeHogKillsAverage
     */
    public void setWholeHogKillsAverage(double wholeHogKillsAverage) {
        this.wholeHogKillsAverage = wholeHogKillsAverage;
    }

    /**
     * set Roadhog wholeHogKillsMostGame
     *
     * @param wholeHogKillsMostGame
     */
    public void setWholeHogKillsMostGame(double wholeHogKillsMostGame) {
        this.wholeHogKillsMostGame = wholeHogKillsMostGame;
    }

    /**
     * set Roadhog selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Roadhog selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Roadhog selfHealingMostGame
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
