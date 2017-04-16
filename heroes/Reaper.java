package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Reaper extends Hero {

    //variables unqiue to Reaper
    String deathBlossomKills;
    String deathBlossomKillsAverage;
    String deathBlossomKillsMostGame;
    String soulsConsumed;
    String soulsConsumedAverage;
    String soulsConsumedMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
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

    public Reaper() {

        //hero's name
        super.name = "Reaper";
        //set variables unqiue to Reaper
        this.deathBlossomKills = "soul";
        this.deathBlossomKillsAverage = "soul";
        this.deathBlossomKillsMostGame = "soul";
        this.soulsConsumed = "soul";
        this.soulsConsumedAverage = "soul";
        this.soulsConsumedMostGame = "soul";
        this.selfHealing = "soul";
        this.selfHealingAverage = "soul";
        this.selfHealingMostGame = "soul";

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

    @Override
    public String toString() {
        return name;
    }
}
