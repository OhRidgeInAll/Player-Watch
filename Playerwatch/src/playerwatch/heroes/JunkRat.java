package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class JunkRat extends Hero {

    //variables unqiue to JunkRat
    String enemiesTrapped;
    String enemiesTrappedMostGame;
    String riptireKills;
    String riptireKillsAverage;
    String riptireKillsMostGame;
    //labels to display variables of JunkRat
    Label lblEnemiesTrapped;
    Label lblEnemiesTrappedMostGame;
    Label lblRiptireKills;
    Label lblRiptireKillsAverage;
    Label lblRiptireKillsMostGame;
    ArrayList<Label> junkRatLabels;

    public JunkRat() {

        //hero's name
        super.name = "Junk Rat";
        //set variables unqiue to JunkRat
        this.enemiesTrapped = "junk";
        this.enemiesTrappedMostGame = "junk";
        this.riptireKills = "junk";
        this.riptireKillsAverage = "junk";
        this.riptireKillsMostGame = "junk";
        //array list of labels for variables of JunkRat
        junkRatLabels = new ArrayList<>();
        junkRatLabels.add(lblEnemiesTrapped = new Label("Enemies Trapped: " + enemiesTrapped));
        junkRatLabels.add(lblEnemiesTrappedMostGame = new Label("Enemies Trapped Most Game: " + enemiesTrappedMostGame));
        junkRatLabels.add(lblRiptireKills = new Label("Riptire Kills: " + riptireKills));
        junkRatLabels.add(lblRiptireKillsAverage = new Label("Riptire Kills Average: " + riptireKillsAverage));
        junkRatLabels.add(lblRiptireKillsMostGame = new Label("Riptire Kills Most Game: " + riptireKillsMostGame));
        super.uniqueLabels = junkRatLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
