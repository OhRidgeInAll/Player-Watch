package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Solider76 hero
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

    /**
     * Soldier76 constructor, pass name to hero class
     */
    public Soldier76() {

        //name of the hero
        super.name = "Soldier76";

    }

    /**
     * Method to generate labels for Soldier76 unique stats
     */
    public void labels() {
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

    /**
     * set Soldier76 bioticFieldHealingDone
     *
     * @param bioticFieldHealingDone
     */
    public void setBioticFieldHealingDone(double bioticFieldHealingDone) {
        this.bioticFieldHealingDone = bioticFieldHealingDone;
    }

    /**
     * set Soldier76 bioticFieldsDeployed
     *
     * @param bioticFieldsDeployed
     */
    public void setBioticFieldsDeployed(double bioticFieldsDeployed) {
        this.bioticFieldsDeployed = bioticFieldsDeployed;
    }

    /**
     * set Soldier76 helixRocketKills
     *
     * @param helixRocketKills
     */
    public void setHelixRocketKills(double helixRocketKills) {
        this.helixRocketKills = helixRocketKills;
    }

    /**
     * set Soldier76 helixRocketKillsAverage
     *
     * @param helixRocketKillsAverage
     */
    public void setHelixRocketKillsAverage(double helixRocketKillsAverage) {
        this.helixRocketKillsAverage = helixRocketKillsAverage;
    }

    /**
     * set Soldier76 helixRocketKillsMostGame
     *
     * @param helixRocketKillsMostGame
     */
    public void setHelixRocketKillsMostGame(double helixRocketKillsMostGame) {
        this.helixRocketKillsMostGame = helixRocketKillsMostGame;
    }

    /**
     * set Soldier76 tacticalVisorKillsAverage
     *
     * @param tacticalVisorKillsAverage
     */
    public void setTacticalVisorKillsAverage(double tacticalVisorKillsAverage) {
        this.tacticalVisorKillsAverage = tacticalVisorKillsAverage;
    }

    /**
     * set Soldier76 tacticalVisorKillsMostGame
     *
     * @param tacticalVisorKillsMostGame
     */
    public void setTacticalVisorKillsMostGame(double tacticalVisorKillsMostGame) {
        this.tacticalVisorKillsMostGame = tacticalVisorKillsMostGame;
    }

    /**
     * set Soldier76 selfHealing
     *
     * @param selfHealing
     */
    public void setSelfHealing(double selfHealing) {
        this.selfHealing = selfHealing;
    }

    /**
     * set Soldier76 selfHealingAverage
     *
     * @param selfHealingAverage
     */
    public void setSelfHealingAverage(double selfHealingAverage) {
        this.selfHealingAverage = selfHealingAverage;
    }

    /**
     * set Soldier76 selfHealingMostGame
     *
     * @param selfHealingMostGame
     */
    public void setSelfHealingMostGame(double selfHealingMostGame) {
        this.selfHealingMostGame = selfHealingMostGame;
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
