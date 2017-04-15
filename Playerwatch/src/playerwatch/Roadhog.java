package playerwatch;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author micha
 */
public class Roadhog extends Hero {

//variables unique to soldier
    int enemiesHooked;
    int enemiesHookedAverage;
    int enemiesHookedMostGame;
    int hookAccuracy;
    int hookAccuracyBestGame;
    int hookAttempts;
    int wholeHogKills;
    int wholeHogKillsAverage;
    int wholeHogKillsMostGame;
    int selfHealing;
    int selfHealingAverage;
    int selfHealingMostGame;
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

        super.name = "Roadhog";
        this.roadhogLabels = new ArrayList<>();
        roadhogLabels.add(lblEnemiesHooked = new Label("Enemies Hooked: "));
        roadhogLabels.add(lblEnemiesHookedAverage = new Label("Enemies Hooked Average: "));
        roadhogLabels.add(lblEnemiesHookedMostGame = new Label("Enemies Hooked Most Game: "));
        roadhogLabels.add(lblHookAccuracy = new Label("Hook Accuracy: "));
        roadhogLabels.add(lblHookAccuracyBestGame = new Label("Hook Accuracy Best Game: "));
        roadhogLabels.add(lblHookAttempts = new Label("Hook Attempts: "));
        roadhogLabels.add(lblWholeHogKills = new Label("Whole Hog Kills: "));
        roadhogLabels.add(lblWholeHogKillsAverage = new Label("Whole Hog Kills Average: "));
        roadhogLabels.add(lblWholeHogKillsMostGame = new Label("Whole Hog Kills Most Game: "));
        roadhogLabels.add(lblSelfHealing = new Label("Self Healing: "));
        roadhogLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: "));
        roadhogLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: "));
        super.uniqueLabels = roadhogLabels;
        this.enemiesHooked = Integer.parseInt("5");
        this.enemiesHookedAverage = Integer.parseInt("5");
        this.enemiesHookedMostGame = Integer.parseInt("5");
        this.hookAccuracy = Integer.parseInt("5");
        this.hookAccuracyBestGame = Integer.parseInt("5");
        this.hookAttempts = Integer.parseInt("5");
        this.wholeHogKills = Integer.parseInt("5");
        this.wholeHogKillsAverage = Integer.parseInt("5");
        this.wholeHogKillsMostGame = Integer.parseInt("5");
        this.selfHealing = Integer.parseInt("5");
        this.selfHealingAverage = Integer.parseInt("5");
        this.selfHealingMostGame = Integer.parseInt("5");
    }

    @Override
    public String toString() {
        return name;
    }

}
