package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class JunkRat extends Hero {

    //variables unqiue to JunkRat
    double enemiesTrapped;
    double enemiesTrappedMostGame;
    double riptireKills;
    double riptireKillsAverage;
    double riptireKillsMostGame;
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

    }

    public void labels(){
            //array list of labels for variables of JunkRat
        junkRatLabels = new ArrayList<>();
        junkRatLabels.add(lblEnemiesTrapped = new Label("Enemies Trapped: " + enemiesTrapped));
        junkRatLabels.add(lblEnemiesTrappedMostGame = new Label("Enemies Trapped Most Game: " + enemiesTrappedMostGame));
        junkRatLabels.add(lblRiptireKills = new Label("Riptire Kills: " + riptireKills));
        junkRatLabels.add(lblRiptireKillsAverage = new Label("Riptire Kills Average: " + riptireKillsAverage));
        junkRatLabels.add(lblRiptireKillsMostGame = new Label("Riptire Kills Most Game: " + riptireKillsMostGame));
        super.uniqueLabels = junkRatLabels;
    }

    public double getEnemiesTrapped() {
        return enemiesTrapped;
    }

    public double getEnemiesTrappedMostGame() {
        return enemiesTrappedMostGame;
    }

    public double getRiptireKills() {
        return riptireKills;
    }

    public double getRiptireKillsAverage() {
        return riptireKillsAverage;
    }

    public double getRiptireKillsMostGame() {
        return riptireKillsMostGame;
    }

    public ArrayList<Label> getJunkRatLabels() {
        return junkRatLabels;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
}
