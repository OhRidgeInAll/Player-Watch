package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Roadhog extends Hero {

//variables unique to Roadhog
    String enemiesHooked;
    String enemiesHookedAverage;
    String enemiesHookedMostGame;
    String hookAccuracy;
    String hookAccuracyBestGame;
    String hookAttempts;
    String wholeHogKills;
    String wholeHogKillsAverage;
    String wholeHogKillsMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
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

    public Roadhog() {

        //hero's name
        super.name = "Roadhog";
        //set unique variables of roadhog
        this.enemiesHooked = "5";
        this.enemiesHookedAverage = "5";
        this.enemiesHookedMostGame = "5";
        this.hookAccuracy = "5";
        this.hookAccuracyBestGame = "5";
        this.hookAttempts = "5";
        this.wholeHogKills = "5";
        this.wholeHogKillsAverage = "5";
        this.wholeHogKillsMostGame = "5";
        this.selfHealing = "5";
        this.selfHealingAverage = "5";
        this.selfHealingMostGame = "5";
        //array list of labels for variables of roadhog
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

    @Override
    public String toString() {
        return name;
    }

}
