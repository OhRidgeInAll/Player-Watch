package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public McCree() {

        //hero's name
        super.name = "McCree";

    }

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

    public void setDeadeyeKills(double deadeyeKills) {
        this.deadeyeKills = deadeyeKills;
    }

    public void setDeadeyeKillsAverage(double deadeyeKillsAverage) {
        this.deadeyeKillsAverage = deadeyeKillsAverage;
    }

    public void setDeadeyeKillsMostGame(double deadeyeKillsMostGame) {
        this.deadeyeKillsMostGame = deadeyeKillsMostGame;
    }

    public void setFanHammerKills(double fanHammerKills) {
        this.fanHammerKills = fanHammerKills;
    }

    public void setFanHammerKillsAverage(double fanHammerKillsAverage) {
        this.fanHammerKillsAverage = fanHammerKillsAverage;
    }

    public void setFanHammerKillsMostGame(double fanHammerKillsMostGame) {
        this.fanHammerKillsMostGame = fanHammerKillsMostGame;
    }

    @Override
    public String toString() {
        return name;
    }
}
