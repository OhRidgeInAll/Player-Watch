package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Mei extends Hero {

    //variables unqiue to Mei
    String blizzardKills;
    String blizzardKillsAverage;
    String blizzardKillsMostGame;
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String enemiesFrozen;
    String enemiesFrozenAverage;
    String enemiesFrozenMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
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

    public Mei() {

        //hero's name
        super.name = "Mei";
        //set variables unqiue to Mei
        this.blizzardKills = "Bae";
        this.blizzardKillsAverage = "Bae";
        this.blizzardKillsMostGame = "Bae";
        this.damageBlocked = "Bae";
        this.damageBlockedAverage = "Bae";
        this.damageBlockedMostGame = "Bae";
        this.enemiesFrozen = "Bae";
        this.enemiesFrozenAverage = "Bae";
        this.enemiesFrozenMostGame = "Bae";
        this.selfHealing = "Bae";
        this.selfHealingAverage = "Bae";
        this.selfHealingMostGame = "Bae";
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

    @Override
    public String toString() {
        return name;
    }
}
