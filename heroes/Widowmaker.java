package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Widowmaker extends Hero {

    //variables unqiue to Widowmaker
    String venomMineKills;
    String venomMineKillsAverage;
    String venomMineKillsMostGame;
    String reconAssistsAverage;
    String reconAssistsMostGame;
    String scopedAccuracy;
    String scopedAccuracyBestGame;
    String scopedCriticalHits;
    String scopedCriticalHitsAverage;
    String scopedCriticalHitsMostGame;
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

    public Widowmaker() {

        //hero's name
        super.name = "Widowmaker";
        //set variables unqiue to Widowmaker
        this.venomMineKills = "ven";
        this.venomMineKillsAverage = "ven";
        this.venomMineKillsMostGame = "ven";
        this.reconAssistsAverage = "ven";
        this.reconAssistsMostGame = "ven";
        this.scopedAccuracy = "ven";
        this.scopedAccuracyBestGame = "ven";
        this.scopedCriticalHits = "ven";
        this.scopedCriticalHitsAverage = "ven";
        this.scopedCriticalHitsMostGame = "ven";

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

    @Override
    public String toString() {
        return name;
    }
}
