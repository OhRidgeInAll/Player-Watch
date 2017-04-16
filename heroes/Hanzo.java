package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Hanzo extends Hero {

    //variables unqiue to Hanzo
    String dragonstrikeKills;
    String dragonstrikeKillsAverage;
    String dragonstrikeKillsMostGame;
    String scatterArrowKills;
    String scatterArrowKillsAverage;
    String scatterArrowKillsMostGame;
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
        //set variables unqiue to Hanzo
        this.dragonstrikeKills = "11";
        this.dragonstrikeKillsAverage = "11";
        this.dragonstrikeKillsMostGame = "11";
        this.scatterArrowKills = "11";
        this.scatterArrowKillsAverage = "11";
        this.scatterArrowKillsMostGame = "11";
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

    @Override
    public String toString() {
        return name;
    }
}
