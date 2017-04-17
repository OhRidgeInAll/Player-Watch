package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Roadhog() {
        //hero's name
        super.name = "Roadhog";

    }

    public void setEnemiesHooked(double enemiesHooked) {
        this.enemiesHooked = enemiesHooked;
    }

    public void setEnemiesHookedAverage(double enemiesHookedAverage) {
        this.enemiesHookedAverage = enemiesHookedAverage;
    }

    public void setEnemiesHookedMostGame(double enemiesHookedMostGame) {
        this.enemiesHookedMostGame = enemiesHookedMostGame;
    }

    public void setHookAccuracy(double hookAccuracy) {
        this.hookAccuracy = hookAccuracy;
    }

    public void setHookAccuracyBestGame(double hookAccuracyBestGame) {
        this.hookAccuracyBestGame = hookAccuracyBestGame;
    }

    public void setHookAttempts(double hookAttempts) {
        this.hookAttempts = hookAttempts;
    }

    public void setWholeHogKills(double wholeHogKills) {
        this.wholeHogKills = wholeHogKills;
    }

    public void setWholeHogKillsAverage(double wholeHogKillsAverage) {
        this.wholeHogKillsAverage = wholeHogKillsAverage;
    }

    public void setWholeHogKillsMostGame(double wholeHogKillsMostGame) {
        this.wholeHogKillsMostGame = wholeHogKillsMostGame;
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
