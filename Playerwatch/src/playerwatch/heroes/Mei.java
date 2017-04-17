package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Mei hero
 *
 * @author Michael Lyn
 */
public class Mei extends Hero {

    //variables unqiue to Mei
    double blizzardKills;
    double blizzardKillsAverage;
    double blizzardKillsMostGame;
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double enemiesFrozen;
    double enemiesFrozenAverage;
    double enemiesFrozenMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels to display variables of Mei
    Label lblBlizzardKills;
    Label lblBlizzardKillsAverage;
    Label lblBlizzardKillsMostGame;
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblEnemiesFrozen;
    Label lblEnemiesFrozenAverage;
    Label lblEnemiesFrozenMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> meiLabels;

    /**
     * Mei constructor, pass name to hero class
     */
    public Mei() {

        //hero's name
        super.name = "Mei";

    }

    /**
     * Method to generate labels for Mei unique stats
     */
    public void labels() {
        //array list of labels for variables of Mei
        meiLabels = new ArrayList<>();
        meiLabels.add(lblBlizzardKills = new Label("Blizzard Kills: " + blizzardKills));
        meiLabels.add(lblBlizzardKillsAverage = new Label("Blizzard Kills Average: " + blizzardKillsAverage));
        meiLabels.add(lblBlizzardKillsMostGame = new Label("Blizzard Kills Most Game: " + blizzardKillsMostGame));
        meiLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        meiLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        meiLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        meiLabels.add(lblEnemiesFrozen = new Label("Enemies Frozen: " + enemiesFrozen));
        meiLabels.add(lblEnemiesFrozenAverage = new Label("Enemies Frozen Average: " + enemiesFrozenAverage));
        meiLabels.add(lblEnemiesFrozenMostGame = new Label("Enemies Frozen Most Game: " + enemiesFrozenMostGame));
        meiLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        meiLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        meiLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = meiLabels;
    }

    /**
     * set Mei blizzardKills
     *
     * @param blizzardKills
     */
    public void setBlizzardKills(double blizzardKills) {
        this.blizzardKills = blizzardKills;
    }

    /**
     * set Mei blizzardKillsAverage
     *
     * @param blizzardKillsAverage
     */
    public void setBlizzardKillsAverage(double blizzardKillsAverage) {
        this.blizzardKillsAverage = blizzardKillsAverage;
    }

    /**
     * set Mei blizzardKillsMostGame
     *
     * @param blizzardKillsMostGame
     */
    public void setBlizzardKillsMostGame(double blizzardKillsMostGame) {
        this.blizzardKillsMostGame = blizzardKillsMostGame;
    }

    /**
     * set Mei damageBlocked
     *
     * @param damageBlocked
     */
    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    /**
     * set Mei damageBlockedAverage
     *
     * @param damageBlockedAverage
     */
    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    /**
     * set Mei damageBlockedMostGame
     *
     * @param damageBlockedMostGame
     */
    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    /**
     * set Mei enemiesFrozen
     *
     * @param enemiesFrozen
     */
    public void setEnemiesFrozen(double enemiesFrozen) {
        this.enemiesFrozen = enemiesFrozen;
    }

    /**
     * set Mei enemiesFrozenAverage
     *
     * @param enemiesFrozenAverage
     */
    public void setEnemiesFrozenAverage(double enemiesFrozenAverage) {
        this.enemiesFrozenAverage = enemiesFrozenAverage;
    }

    /**
     * set Mei enemiesFrozenMostGame
     *
     * @param enemiesFrozenMostGame
     */
    public void setEnemiesFrozenMostGame(double enemiesFrozenMostGame) {
        this.enemiesFrozenMostGame = enemiesFrozenMostGame;
    }

    /**
     * set Mei selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Mei selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Mei selfHealingMostGame
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
