package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Hanzo() {

        //hero's name
        super.name = "Hanzo";

    }

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

    public void setDragonstrikeKills(double dragonstrikeKills) {
        this.dragonstrikeKills = dragonstrikeKills;
    }

    public void setDragonstrikeKillsAverage(double dragonstrikeKillsAverage) {
        this.dragonstrikeKillsAverage = dragonstrikeKillsAverage;
    }

    public void setDragonstrikeKillsMostGame(double dragonstrikeKillsMostGame) {
        this.dragonstrikeKillsMostGame = dragonstrikeKillsMostGame;
    }

    public void setScatterArrowKills(double scatterArrowKills) {
        this.scatterArrowKills = scatterArrowKills;
    }

    public void setScatterArrowKillsAverage(double scatterArrowKillsAverage) {
        this.scatterArrowKillsAverage = scatterArrowKillsAverage;
    }

    public void setScatterArrowKillsMostGame(double scatterArrowKillsMostGame) {
        this.scatterArrowKillsMostGame = scatterArrowKillsMostGame;
    }

    
    @Override
    public String toString() {
        return name;
    }
}
