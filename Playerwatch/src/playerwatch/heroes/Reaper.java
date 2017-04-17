package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Reaper hero
 *
 * @author Michael Lyn
 */
public class Reaper extends Hero {

    //variables unqiue to Reaper
    double deathBlossomKills;
    double deathBlossomKillsAverage;
    double deathBlossomKillsMostGame;
    double soulsConsumed;
    double soulsConsumedAverage;
    double soulsConsumedMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
    //labels to display variables of Reaper
    Label lblDeathBlossomKills;
    Label lblDeathBlossomKillsAverage;
    Label lblDeathBlossomKillsMostGame;
    Label lblSoulsConsumed;
    Label lblSoulsConsumedAverage;
    Label lblSoulsConsumedMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> reaperLabels;

    /**
     * Reaper constructor, pass name to hero class
     */
    public Reaper() {

        //hero's name
        super.name = "Reaper";

    }

    /**
     * Method to generate labels for Reaper unique stats
     */
    public void labels() {
        //array list of labels for variables of Reaper
        reaperLabels = new ArrayList<>();
        reaperLabels.add(lblDeathBlossomKills = new Label("Death Blossom Kills: " + deathBlossomKills));
        reaperLabels.add(lblDeathBlossomKillsAverage = new Label("Death Blossom Kills Average: " + deathBlossomKillsAverage));
        reaperLabels.add(lblDeathBlossomKillsMostGame = new Label("Death Blossom Kills Most Game: " + deathBlossomKillsMostGame));
        reaperLabels.add(lblSoulsConsumed = new Label("Souls Consumed: " + soulsConsumed));
        reaperLabels.add(lblSoulsConsumedAverage = new Label("Souls Consumed Average: " + soulsConsumedAverage));
        reaperLabels.add(lblSoulsConsumedMostGame = new Label("Souls Consumed Most Game: " + soulsConsumedMostGame));
        reaperLabels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        reaperLabels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        reaperLabels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = reaperLabels;
    }

    /**
     * set Reaper deathBlossomKills
     *
     * @param deathBlossomKills
     */
    public void setDeathBlossomKills(double deathBlossomKills) {
        this.deathBlossomKills = deathBlossomKills;
    }

    /**
     * set Reaper deathBlossomKillsAverage
     *
     * @param deathBlossomKillsAverage
     */
    public void setDeathBlossomKillsAverage(double deathBlossomKillsAverage) {
        this.deathBlossomKillsAverage = deathBlossomKillsAverage;
    }

    /**
     * set Reaper deathBlossomKillsMostGame
     *
     * @param deathBlossomKillsMostGame
     */
    public void setDeathBlossomKillsMostGame(double deathBlossomKillsMostGame) {
        this.deathBlossomKillsMostGame = deathBlossomKillsMostGame;
    }

    /**
     * set Reaper soulsConsumed
     *
     * @param soulsConsumed
     */
    public void setSoulsConsumed(double soulsConsumed) {
        this.soulsConsumed = soulsConsumed;
    }

    /**
     * set Reaper soulsConsumedAverage
     *
     * @param soulsConsumedAverage
     */
    public void setSoulsConsumedAverage(double soulsConsumedAverage) {
        this.soulsConsumedAverage = soulsConsumedAverage;
    }

    /**
     * set Reaper soulsConsumedMostGame
     *
     * @param soulsConsumedMostGame
     */
    public void setSoulsConsumedMostGame(double soulsConsumedMostGame) {
        this.soulsConsumedMostGame = soulsConsumedMostGame;
    }

    /**
     * set Reaper selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Reaper selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Reaper selfHealingMostGame
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
