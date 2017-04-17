package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create JunkRat hero
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

    /**
     * JunkRat constructor, pass name of hero
     */
    public JunkRat() {

        //hero's name
        super.name = "Junk Rat";

    }

    /**
     * Method to generate labels of Pharah unique stats
     */
    public void labels() {
        //array list of labels for variables of JunkRat
        junkRatLabels = new ArrayList<>();
        junkRatLabels.add(lblEnemiesTrapped = new Label("Enemies Trapped: " + enemiesTrapped));
        junkRatLabels.add(lblEnemiesTrappedMostGame = new Label("Enemies Trapped Most Game: " + enemiesTrappedMostGame));
        junkRatLabels.add(lblRiptireKills = new Label("Riptire Kills: " + riptireKills));
        junkRatLabels.add(lblRiptireKillsAverage = new Label("Riptire Kills Average: " + riptireKillsAverage));
        junkRatLabels.add(lblRiptireKillsMostGame = new Label("Riptire Kills Most Game: " + riptireKillsMostGame));
        super.uniqueLabels = junkRatLabels;
    }

    /**
     * set JunkRat enemiesTrapped
     *
     * @param enemiesTrapped
     */
    public void setEnemiesTrapped(double enemiesTrapped) {
        this.enemiesTrapped = enemiesTrapped;
    }

    /**
     * set JunkRat enemiesTrappedMostGame
     *
     * @param enemiesTrappedMostGame
     */
    public void setEnemiesTrappedMostGame(double enemiesTrappedMostGame) {
        this.enemiesTrappedMostGame = enemiesTrappedMostGame;
    }

    /**
     * set JunkRat riptireKills
     *
     * @param riptireKills
     */
    public void setRiptireKills(double riptireKills) {
        this.riptireKills = riptireKills;
    }

    /**
     * set JunkRat riptireKillsAverage
     *
     * @param riptireKillsAverage
     */
    public void setRiptireKillsAverage(double riptireKillsAverage) {
        this.riptireKillsAverage = riptireKillsAverage;
    }

    /**
     * set JunkRat riptireKillsMostGame
     *
     * @param riptireKillsMostGame
     */
    public void setRiptireKillsMostGame(double riptireKillsMostGame) {
        this.riptireKillsMostGame = riptireKillsMostGame;
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
