package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create McCree hero
 *
 * @author Michael Lyn
 */
public class McCree extends Hero {

    //variables unqiue to McCree
    double deadeyeKills;
    double deadeyeKillsAverage;
    double deadeyeKillsMostGame;
    double fanHammerKills;
    double fanHammerKillsAverage;
    double fanHammerKillsMostGame;
    //labels to display variables of McCree
    Label lblDeadeyeKills;
    Label lblDeadeyeKillsAverage;
    Label lblDeadeyeKillsMostGame;
    Label lblFanHammerKills;
    Label lblFanHammerKillsAverage;
    Label lblFanHammerKillsMostGame;
    ArrayList<Label> mcCreeLabels;

    /**
     * McCree constructor, pass name to hero class
     */
    public McCree() {

        //hero's name
        super.name = "McCree";

    }

    /**
     * Method to generate labels for McCree unique stats
     */
    public void labels() {
        //array list of labels for variables of McCree
        mcCreeLabels = new ArrayList<>();
        mcCreeLabels.add(lblDeadeyeKills = new Label("Deadeye Kills: " + deadeyeKills));
        mcCreeLabels.add(lblDeadeyeKillsAverage = new Label("Deadeye Kills Average: " + deadeyeKillsAverage));
        mcCreeLabels.add(lblDeadeyeKillsMostGame = new Label("Deadeye Kills Most Game: " + deadeyeKillsMostGame));
        mcCreeLabels.add(lblFanHammerKills = new Label("Fan Hammer Kills: " + fanHammerKills));
        mcCreeLabels.add(lblFanHammerKillsAverage = new Label("Fan Hammer Kills Average: " + fanHammerKillsAverage));
        mcCreeLabels.add(lblFanHammerKillsMostGame = new Label("Fan Hammer Kills Most Game: " + fanHammerKillsMostGame));
        super.uniqueLabels = mcCreeLabels;
    }

    /**
     * set McCree deadeyeKills
     *
     * @param deadeyeKills
     */
    public void setDeadeyeKills(double deadeyeKills) {
        this.deadeyeKills = deadeyeKills;
    }

    /**
     * set McCree deadeyeKillsAverage
     *
     * @param deadeyeKillsAverage
     */
    public void setDeadeyeKillsAverage(double deadeyeKillsAverage) {
        this.deadeyeKillsAverage = deadeyeKillsAverage;
    }

    /**
     * set McCree deadeyeKillsMostGame
     *
     * @param deadeyeKillsMostGame
     */
    public void setDeadeyeKillsMostGame(double deadeyeKillsMostGame) {
        this.deadeyeKillsMostGame = deadeyeKillsMostGame;
    }

    /**
     * set McCree fanHammerKills
     *
     * @param fanHammerKills
     */
    public void setFanHammerKills(double fanHammerKills) {
        this.fanHammerKills = fanHammerKills;
    }

    /**
     * set McCree fanHammerKillsAverage
     *
     * @param fanHammerKillsAverage
     */
    public void setFanHammerKillsAverage(double fanHammerKillsAverage) {
        this.fanHammerKillsAverage = fanHammerKillsAverage;
    }

    /**
     * set McCree fanHammerKillsMostGame
     *
     * @param fanHammerKillsMostGame
     */
    public void setFanHammerKillsMostGame(double fanHammerKillsMostGame) {
        this.fanHammerKillsMostGame = fanHammerKillsMostGame;
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
