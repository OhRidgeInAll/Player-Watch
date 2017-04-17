package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Widowmaker hero
 *
 * @author Michael Lyn
 */
public class Widowmaker extends Hero {

    //variables unqiue to Widowmaker
    double venomMineKills;
    double venomMineKillsAverage;
    double venomMineKillsMostGame;
    double reconAssistsAverage;
    double reconAssistsMostGame;
    double scopedAccuracy;
    double scopedAccuracyBestGame;
    double scopedCriticalHits;
    double scopedCriticalHitsAverage;
    double scopedCriticalHitsMostGame;
    //labels to display variables of Widowmaker
    Label lblVenomMineKills;
    Label lblVenomMineKillsAverage;
    Label lblVenomMineKillsMostGame;
    Label lblReconAssistsAverage;
    Label lblReconAssistsMostGame;
    Label lblScopedAccuracy;
    Label lblScopedAccuracyBestGame;
    Label lblScopedCriticalHits;
    Label lblScopedCriticalHitsAverage;
    Label lblScopedCriticalHitsMostGame;
    ArrayList<Label> widowmakerLabels;

    /**
     * Widowmaker constructor, pass name to hero class
     */
    public Widowmaker() {

        //hero's name
        super.name = "Widowmaker";

    }

    /**
     * Method to generate labels for Widowmaker unique stats
     */
    public void labels() {
        //array list of labels for variables of Widowmaker
        widowmakerLabels = new ArrayList<>();
        widowmakerLabels.add(lblVenomMineKills = new Label("Venom Mine Kills: " + venomMineKills));
        widowmakerLabels.add(lblVenomMineKillsAverage = new Label("Venom Mine Kills Average: " + venomMineKillsAverage));
        widowmakerLabels.add(lblVenomMineKillsMostGame = new Label("Venom Mine Kills Most Game: " + venomMineKillsMostGame));
        widowmakerLabels.add(lblReconAssistsAverage = new Label("Recon Assists Average: " + reconAssistsAverage));
        widowmakerLabels.add(lblReconAssistsMostGame = new Label("Recon Assists Most Game: " + reconAssistsMostGame));
        widowmakerLabels.add(lblScopedAccuracy = new Label("Scoped Accuracy: " + scopedAccuracy));
        widowmakerLabels.add(lblScopedAccuracyBestGame = new Label("Scoped Accuracy Best Game: " + scopedAccuracyBestGame));
        widowmakerLabels.add(lblScopedCriticalHits = new Label("Scoped Critical Hits: " + scopedCriticalHits));
        widowmakerLabels.add(lblScopedCriticalHitsAverage = new Label("Scoped Critical Hits Average: " + scopedCriticalHitsAverage));
        widowmakerLabels.add(lblScopedCriticalHitsMostGame = new Label("Scoped Critical Hits Most Game: " + scopedCriticalHitsMostGame));
        super.uniqueLabels = widowmakerLabels;
    }

    /**
     * set Widowmaker venomMineKills
     *
     * @param venomMineKills
     */
    public void setVenomMineKills(double venomMineKills) {
        this.venomMineKills = venomMineKills;
    }

    /**
     * set Widowmaker venomMineKillsAverage
     *
     * @param venomMineKillsAverage
     */
    public void setVenomMineKillsAverage(double venomMineKillsAverage) {
        this.venomMineKillsAverage = venomMineKillsAverage;
    }

    /**
     * set Widowmaker venomMineKillsMostGame
     *
     * @param venomMineKillsMostGame
     */
    public void setVenomMineKillsMostGame(double venomMineKillsMostGame) {
        this.venomMineKillsMostGame = venomMineKillsMostGame;
    }

    /**
     * set Widowmaker reconAssistsAverage
     *
     * @param reconAssistsAverage
     */
    public void setReconAssistsAverage(double reconAssistsAverage) {
        this.reconAssistsAverage = reconAssistsAverage;
    }

    /**
     * set Widowmaker scopedAccuracy
     *
     * @param scopedAccuracy
     */
    public void setScopedAccuracy(double scopedAccuracy) {
        this.scopedAccuracy = scopedAccuracy;
    }

    /**
     * set Widowmaker scopedAccuracyBestGame
     *
     * @param scopedAccuracyBestGame
     */
    public void setScopedAccuracyBestGame(double scopedAccuracyBestGame) {
        this.scopedAccuracyBestGame = scopedAccuracyBestGame;
    }

    /**
     * set Widowmaker scopedCriticalHits
     *
     * @param scopedCriticalHits
     */
    public void setScopedCriticalHits(double scopedCriticalHits) {
        this.scopedCriticalHits = scopedCriticalHits;
    }

    /**
     * set Widowmaker scopedCriticalHitsAverage
     *
     * @param scopedCriticalHitsAverage
     */
    public void setScopedCriticalHitsAverage(double scopedCriticalHitsAverage) {
        this.scopedCriticalHitsAverage = scopedCriticalHitsAverage;
    }

    /**
     * set Widowmaker scopedCriticalHitsMostGame
     *
     * @param scopedCriticalHitsMostGame
     */
    public void setScopedCriticalHitsMostGame(double scopedCriticalHitsMostGame) {
        this.scopedCriticalHitsMostGame = scopedCriticalHitsMostGame;
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
