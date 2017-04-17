package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Soldier76 extends Hero {

//variables unique to Soldier
    String bioticFieldHealingDone;
    String bioticFieldsDeployed;
    String helixRocketKills;
    String helixRocketKillsAverage;
    String helixRocketKillsMostGame;
    String tacticalVisorKillsAverage;
    String tacticalVisorKillsMostGame;
    String selfHealing;
    String selfHealingAverage;
    String selfHealingMostGame;
     //labels to display unique variables
    Label lblBioticFieldHealingDone;
    Label lblBioticFieldsDeployed;
    Label lblHelixRocketKills;
    Label lblHelixRocketKillsAverage;
    Label lblHelixRocketKillsMostGame;
    Label lblTacticalVisorKillsAverage;
    Label lblTacticalVisorKillsMostGame;
    Label lblSelfHealing;
    Label lblSelfHealingAverage;
    Label lblSelfHealingMostGame;
    ArrayList<Label> soldier76Labels;

    public Soldier76() {

         //name of the hero
        super.name = "Soldier76";
        //set unique values of hero
        this.bioticFieldHealingDone = "1";
        this.bioticFieldsDeployed = "2";
        this.helixRocketKills = "3";
        this.helixRocketKillsAverage = "4";
        this.helixRocketKillsMostGame = "5";
        this.tacticalVisorKillsAverage = "6";
        this.tacticalVisorKillsMostGame = "7";
        this.selfHealing = "8";
        this.selfHealingAverage = "9";
        this.selfHealingMostGame = "10";
         //array list of labels for output
        this.soldier76Labels = new ArrayList<>();
        soldier76Labels.add(lblBioticFieldHealingDone = new Label("Biotic Field Healing Done: " + bioticFieldHealingDone));
        soldier76Labels.add(lblBioticFieldsDeployed = new Label("Biotic Fields Deployed: " + bioticFieldsDeployed));
        soldier76Labels.add(lblHelixRocketKills = new Label("Helix Rocket Kills: " + helixRocketKills));
        soldier76Labels.add(lblHelixRocketKillsAverage = new Label("Helix Rocket Kills Average: " + helixRocketKillsAverage));
        soldier76Labels.add(lblHelixRocketKillsMostGame = new Label("Helix Rocket Kills Most Game: " + helixRocketKillsMostGame));
        soldier76Labels.add(lblTacticalVisorKillsAverage = new Label("Tactical Visor Kills Average: " + tacticalVisorKillsAverage));
        soldier76Labels.add(lblTacticalVisorKillsMostGame = new Label("Tactical Visor Kills Most Game: " + tacticalVisorKillsMostGame));
        soldier76Labels.add(lblSelfHealing = new Label("Self Healing: " + selfHealing));
        soldier76Labels.add(lblSelfHealingAverage = new Label("Self Healing Average: " + selfHealingAverage));
        soldier76Labels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: " + selfHealingMostGame));
        super.uniqueLabels = soldier76Labels;

    }

    @Override
    public String toString() {
        return name;
    }

}
