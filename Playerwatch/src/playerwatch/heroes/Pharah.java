package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Pharah extends Hero {

    //variables unqiue to Pharah
    double barrageKills;
    double barrageKillsAverage;
    double barrageKillsMostGame;
    double rocketDirectHits;
    double rocketDirectHitsAverage;
    double rocketDirectHitsMostGame;
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

    }

    public void labels() {
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

    public void setBarrageKills(double barrageKills) {
        this.barrageKills = barrageKills;
    }

    public void setBarrageKillsAverage(double barrageKillsAverage) {
        this.barrageKillsAverage = barrageKillsAverage;
    }

    public void setBarrageKillsMostGame(double barrageKillsMostGame) {
        this.barrageKillsMostGame = barrageKillsMostGame;
    }

    public void setRocketDirectHits(double rocketDirectHits) {
        this.rocketDirectHits = rocketDirectHits;
    }

    public void setRocketDirectHitsAverage(double rocketDirectHitsAverage) {
        this.rocketDirectHitsAverage = rocketDirectHitsAverage;
    }

    public void setRocketDirectHitsMostGame(double rocketDirectHitsMostGame) {
        this.rocketDirectHitsMostGame = rocketDirectHitsMostGame;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
