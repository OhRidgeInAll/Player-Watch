package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Soldier76 extends Hero {

//variables unique to Soldier
    double bioticFieldHealingDone;
    double bioticFieldsDeployed;
    double helixRocketKills;
    double helixRocketKillsAverage;
    double helixRocketKillsMostGame;
    double tacticalVisorKillsAverage;
    double tacticalVisorKillsMostGame;
    double selfHealing;
    double selfHealingAverage;
    double selfHealingMostGame;
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

    }

    public void labels(){
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

    public void setBioticFieldHealingDone(double bioticFieldHealingDone) {
        this.bioticFieldHealingDone = bioticFieldHealingDone;
    }

    public void setBioticFieldsDeployed(double bioticFieldsDeployed) {
        this.bioticFieldsDeployed = bioticFieldsDeployed;
    }

    public void setHelixRocketKills(double helixRocketKills) {
        this.helixRocketKills = helixRocketKills;
    }

    public void setHelixRocketKillsAverage(double helixRocketKillsAverage) {
        this.helixRocketKillsAverage = helixRocketKillsAverage;
    }

    public void setHelixRocketKillsMostGame(double helixRocketKillsMostGame) {
        this.helixRocketKillsMostGame = helixRocketKillsMostGame;
    }

    public void setTacticalVisorKillsAverage(double tacticalVisorKillsAverage) {
        this.tacticalVisorKillsAverage = tacticalVisorKillsAverage;
    }

    public void setTacticalVisorKillsMostGame(double tacticalVisorKillsMostGame) {
        this.tacticalVisorKillsMostGame = tacticalVisorKillsMostGame;
    }

    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    public void setSelfHealingMostGame(double selfHealingMostGame) {
        this.selfHealingMostGame = selfHealingMostGame;
    }
    
    
    @Override
    public String toString() {
        return name;
    }

}
