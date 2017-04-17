package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Hanzo hero
 *
 * @author Michael Lyn
 */
public class Hanzo extends Hero {

    //variables unqiue to Hanzo
    double dragonstrikeKills;
    double dragonstrikeKillsAverage;
    double dragonstrikeKillsMostGame;
    double scatterArrowKills;
    double scatterArrowKillsAverage;
    double scatterArrowKillsMostGame;
    //labels to display variables of Hanzo
    Label lblDragonstrikeKills;
    Label lblDragonstrikeKillsAverage;
    Label lblDragonstrikeKillsMostGame;
    Label lblScatterArrowKills;
    Label lblScatterArrowKillsAverage;
    Label lblScatterArrowKillsMostGame;
    ArrayList<Label> hanzoLabels;

    /**
     * Hanzo constructor, pass name to hero class
     */
    public Hanzo() {

        //hero's name
        super.name = "Hanzo";

    }

    /**
     * Method to generate labels of Hanzo unique stats
     */
    public void labels() {
        //array list of labels for variables of Hanzo
        hanzoLabels = new ArrayList<>();
        hanzoLabels.add(lblDragonstrikeKills = new Label("Dragonstrike Kills: " + dragonstrikeKills));
        hanzoLabels.add(lblDragonstrikeKillsAverage = new Label("Dragonstrike Kills Average: " + dragonstrikeKillsAverage));
        hanzoLabels.add(lblDragonstrikeKillsMostGame = new Label("Dragonstrike Kills Most Game: " + dragonstrikeKillsMostGame));
        hanzoLabels.add(lblScatterArrowKills = new Label("Scatter Arrow Kills: " + scatterArrowKills));
        hanzoLabels.add(lblScatterArrowKillsAverage = new Label("Scatter Arrow Kills Average: " + scatterArrowKillsAverage));
        hanzoLabels.add(lblScatterArrowKillsMostGame = new Label("Scatter Arrow Kills Most Game: " + scatterArrowKillsMostGame));
        super.uniqueLabels = hanzoLabels;
    }

    /**
     * set Hanzo dragonstrikeKills
     *
     * @param dragonstrikeKills
     */
    public void setDragonstrikeKills(double dragonstrikeKills) {
        this.dragonstrikeKills = dragonstrikeKills;
    }

    /**
     * set Hanzo dragonstrikeKillsAverage
     *
     * @param dragonstrikeKillsAverage
     */
    public void setDragonstrikeKillsAverage(double dragonstrikeKillsAverage) {
        this.dragonstrikeKillsAverage = dragonstrikeKillsAverage;
    }

    /**
     * set Hanzo dragonstrikeKillsMostGame
     *
     * @param dragonstrikeKillsMostGame
     */
    public void setDragonstrikeKillsMostGame(double dragonstrikeKillsMostGame) {
        this.dragonstrikeKillsMostGame = dragonstrikeKillsMostGame;
    }

    /**
     * set Hanzo scatterArrowKills
     *
     * @param scatterArrowKills
     */
    public void setScatterArrowKills(double scatterArrowKills) {
        this.scatterArrowKills = scatterArrowKills;
    }

    /**
     * set Hanzo scatterArrowKillsAverage
     *
     * @param scatterArrowKillsAverage
     */
    public void setScatterArrowKillsAverage(double scatterArrowKillsAverage) {
        this.scatterArrowKillsAverage = scatterArrowKillsAverage;
    }

    /**
     * set Hanzo scatterArrowKillsMostGame
     *
     * @param scatterArrowKillsMostGame
     */
    public void setScatterArrowKillsMostGame(double scatterArrowKillsMostGame) {
        this.scatterArrowKillsMostGame = scatterArrowKillsMostGame;
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
