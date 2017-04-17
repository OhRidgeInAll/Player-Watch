package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Pharah hero
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

    /**
     * Pharah constructor, pass name of hero
     */
    public Pharah() {

        //hero's name
        super.name = "Pharah";

    }

    /**
     * Method to generate labels of Pharah unique stats
     */
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

    /**
     * set Pharah barrageKills
     * @param barrageKills 
     */
    public void setBarrageKills(double barrageKills) {
        this.barrageKills = barrageKills;
    }

    /**
     * set Pharah barrageKillsAverage
     * @param barrageKillsAverage 
     */
    public void setBarrageKillsAverage(double barrageKillsAverage) {
        this.barrageKillsAverage = barrageKillsAverage;
    }

    /**
     * set Pharah barrageKillsMostGame
     * @param barrageKillsMostGame 
     */
    public void setBarrageKillsMostGame(double barrageKillsMostGame) {
        this.barrageKillsMostGame = barrageKillsMostGame;
    }

    /**
     * set Pharah rocketDirectHits
     * @param rocketDirectHits 
     */
    public void setRocketDirectHits(double rocketDirectHits) {
        this.rocketDirectHits = rocketDirectHits;
    }

    /**
     * set Pharah rocketDirectHitsAverage
     * @param rocketDirectHitsAverage 
     */
    public void setRocketDirectHitsAverage(double rocketDirectHitsAverage) {
        this.rocketDirectHitsAverage = rocketDirectHitsAverage;
    }

    /**
     * set Pharah rocketDirectHitsMostGame
     * @param rocketDirectHitsMostGame 
     */
    public void setRocketDirectHitsMostGame(double rocketDirectHitsMostGame) {
        this.rocketDirectHitsMostGame = rocketDirectHitsMostGame;
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
