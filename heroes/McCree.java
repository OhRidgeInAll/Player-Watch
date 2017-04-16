package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class McCree extends Hero {

    //variables unqiue to McCree
    String deadeyeKills;
    String deadeyeKillsAverage;
    String deadeyeKillsMostGame;
    String fanHammerKills;
    String fanHammerKillsAverage;
    String fanHammerKillsMostGame;
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
        //set variables unqiue to McCree
        this.deadeyeKills = "Cree";
        this.deadeyeKillsAverage = "Cree";
        this.deadeyeKillsMostGame = "Cree";
        this.fanHammerKills = "Cree";
        this.fanHammerKillsAverage = "Cree";
        this.fanHammerKillsMostGame = "Cree";
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

    @Override
    public String toString() {
        return name;
    }
}
