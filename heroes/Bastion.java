package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Bastion extends Hero {

    //variables unique to Bastion
    String reconKills;
    String reconKillsAverage;
    String reconKillsMostGame;
    String sentryKills;
    String sentryKillsAverage;
    String sentryKillsMostGame;
    String tankKills;
    String tankKillsAverage;
    String tankKillsMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
    //labels to display unique variables of Bastion
    Label lblReconKills;
    Label lblReconKillsAverage;
    Label lblReconKillsMostGame;
    Label lblSentryKills;
    Label lblSentryKillsAverage;
    Label lblSentryKillsMostGame;
    Label lblTankKills;
    Label lblTankKillsAverage;
    Label lblTankKillsMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> bastionLabels;

    public Bastion() {
        
        //hero's name
        super.name = "Bastion";
        //set unique values of Bastion
        this.reconKills = "2";
        this.reconKillsAverage = "5";
        this.reconKillsMostGame = "5";
        this.sentryKills = "5";
        this.sentryKillsAverage = "5";
        this.sentryKillsMostGame = "5";
        this.tankKills = "5";
        this.tankKillsAverage = "5";
        this.tankKillsMostGame = "5";
        this.selfHealing = "5";
        this.selfHealingAverage = "5";
        this.selfHealingMostGame = "5";
        //array list of labels for variables of Bastion
        this.bastionLabels = new ArrayList<>();
        bastionLabels.add(lblReconKills = new Label("Recon Kills: " + reconKills));
        bastionLabels.add(lblReconKillsAverage = new Label("Recon Kills Average: " + reconKillsMostGame));
        bastionLabels.add(lblReconKillsMostGame = new Label("Recon Kills Most Game: " + reconKillsMostGame));
        bastionLabels.add(lblSentryKills = new Label("Sentry Kills: " + sentryKills));
        bastionLabels.add(lblSentryKillsAverage = new Label("Sentry Kills Average: " + sentryKillsAverage));
        bastionLabels.add(lblSentryKillsMostGame = new Label("Sentry Kills Most Game: " + sentryKillsMostGame));
        bastionLabels.add(lblTankKills = new Label("Tank Kills: " + tankKills));
        bastionLabels.add(lblTankKillsAverage = new Label("Tank Kills Average: " + tankKillsAverage));
        bastionLabels.add(lblTankKillsMostGame = new Label("Tank Kills Most Game: " + tankKillsMostGame));
        bastionLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        bastionLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        bastionLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = bastionLabels;

    }

    @Override
    public String toString() {
        return name;
    }
}
