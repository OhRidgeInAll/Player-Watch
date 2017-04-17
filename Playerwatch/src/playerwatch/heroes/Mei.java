package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Mei() {

        //hero's name
        super.name = "Mei";

    }

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

    public void setBlizzardKills(double blizzardKills) {
        this.blizzardKills = blizzardKills;
    }

    public void setBlizzardKillsAverage(double blizzardKillsAverage) {
        this.blizzardKillsAverage = blizzardKillsAverage;
    }

    public void setBlizzardKillsMostGame(double blizzardKillsMostGame) {
        this.blizzardKillsMostGame = blizzardKillsMostGame;
    }

    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    public void setEnemiesFrozen(double enemiesFrozen) {
        this.enemiesFrozen = enemiesFrozen;
    }

    public void setEnemiesFrozenAverage(double enemiesFrozenAverage) {
        this.enemiesFrozenAverage = enemiesFrozenAverage;
    }

    public void setEnemiesFrozenMostGame(double enemiesFrozenMostGame) {
        this.enemiesFrozenMostGame = enemiesFrozenMostGame;
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
