package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Reaper() {

        //hero's name
        super.name = "Reaper";

    }

    public void labels(){
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

    public void setDeathBlossomKills(double deathBlossomKills) {
        this.deathBlossomKills = deathBlossomKills;
    }

    public void setDeathBlossomKillsAverage(double deathBlossomKillsAverage) {
        this.deathBlossomKillsAverage = deathBlossomKillsAverage;
    }

    public void setDeathBlossomKillsMostGame(double deathBlossomKillsMostGame) {
        this.deathBlossomKillsMostGame = deathBlossomKillsMostGame;
    }

    public void setSoulsConsumed(double soulsConsumed) {
        this.soulsConsumed = soulsConsumed;
    }

    public void setSoulsConsumedAverage(double soulsConsumedAverage) {
        this.soulsConsumedAverage = soulsConsumedAverage;
    }

    public void setSoulsConsumedMostGame(double soulsConsumedMostGame) {
        this.soulsConsumedMostGame = soulsConsumedMostGame;
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
