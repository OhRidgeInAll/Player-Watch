package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Bastion Hero
 * 
 * @author Michael Lyn
 */
public class Bastion extends Hero {

    //variables unique to Bastion
    double reconKills;
    double reconKillsAverage;
    double reconKillsMostGame;
    double sentryKills;
    double sentryKillsAverage;
    double sentryKillsMostGame;
    double tankKills;
    double tankKillsAverage;
    double tankKillsMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
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

    /**
     * Bastion constructor, pass name to hero class
     */
    public Bastion() {
        
        //hero's name
        super.name = "Bastion";

    }
    
    /**
     * Method to generate labels of Bastion unique stats
     */
    public void labels(){
    
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

    /**
     * set Bastion reconKills
     * @param reconKills 
     */
    public void setReconKills(double reconKills) {
        this.reconKills = reconKills;
    }

    /**
     * set Bastion reconKillsAverage
     * @param reconKillsAverage 
     */
    public void setReconKillsAverage(double reconKillsAverage) {
        this.reconKillsAverage = reconKillsAverage;
    }

    /**
     * set Bastion reconKillsMostGame
     * @param reconKillsMostGame 
     */
    public void setReconKillsMostGame(double reconKillsMostGame) {
        this.reconKillsMostGame = reconKillsMostGame;
    }

    /**
     * set Bastion sentryKills
     * @param sentryKills 
     */
    public void setSentryKills(double sentryKills) {
        this.sentryKills = sentryKills;
    }

    /**
     * set Bastion sentryKillsAverage
     * @param sentryKillsAverage 
     */
    public void setSentryKillsAverage(double sentryKillsAverage) {
        this.sentryKillsAverage = sentryKillsAverage;
    }

    /**
     * set Bastion sentryKillsMostGame
     * @param sentryKillsMostGame 
     */
    public void setSentryKillsMostGame(double sentryKillsMostGame) {
        this.sentryKillsMostGame = sentryKillsMostGame;
    }

    /**
     * set Bastion tankKills
     * @param tankKills 
     */
    public void setTankKills(double tankKills) {
        this.tankKills = tankKills;
    }

    /**
     * set Bastion tankKillsAverage
     * @param tankKillsAverage 
     */
    public void setTankKillsAverage(double tankKillsAverage) {
        this.tankKillsAverage = tankKillsAverage;
    }

    /**
     * set Bastion tankKillsMostGame
     * @param tankKillsMostGame 
     */
    public void setTankKillsMostGame(double tankKillsMostGame) {
        this.tankKillsMostGame = tankKillsMostGame;
    }

    /**
     * set Bastion selfHealing
     * @param selfHealing 
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Bastion selfHealingAverage
     * @param selfHealingAverage 
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Bastion selfHealingMostGame
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
