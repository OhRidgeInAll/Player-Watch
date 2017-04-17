package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Pharah extends Hero {

    //variables unqiue to Pharah
    String barrageKills;
    String barrageKillsAverage;
    String barrageKillsMostGame;
    String rocketDirectHits;
    String rocketDirectHitsAverage;
    String rocketDirectHitsMostGame;
    //labels to display variables of Pharah
    Label lblBarrageKills;
    Label lblBarrageKillsAverage;
    Label lblBarrageKillsMostGame;
    Label lblRocketDirectHits;
    Label lblRocketDirectHitsAverage;
    Label lblRocketDirectHitsMostGame;
    ArrayList<Label> pharahLabels;

    public Pharah() {

        //hero's name
        super.name = "Pharah";
        //set variables unqiue to Pharah
        this.barrageKills = "jets";
        this.barrageKillsAverage = "jets";
        this.barrageKillsMostGame = "jets";
        this.rocketDirectHits = "jets";
        this.rocketDirectHitsAverage = "jets";
        this.rocketDirectHitsMostGame = "jets";

        //array list of labels for variables of Pharah
        pharahLabels = new ArrayList<>();
        pharahLabels.add(lblBarrageKills = new Label("Barrage Kills: " + barrageKills));
        pharahLabels.add(lblBarrageKillsAverage = new Label("Barrage Kills Average: " + barrageKillsAverage));
        pharahLabels.add(lblBarrageKillsMostGame = new Label("Barrage Kills Most Game: " + barrageKillsMostGame));
        pharahLabels.add(lblRocketDirectHits = new Label("Rocket Direct Hits: " + rocketDirectHits));
        pharahLabels.add(lblRocketDirectHitsAverage = new Label("Rocket Direct Hits Average: " + rocketDirectHitsAverage));
        pharahLabels.add(lblRocketDirectHitsMostGame = new Label("Rocket Direct Hits Most Game: " + rocketDirectHitsMostGame));
        super.uniqueLabels = pharahLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
