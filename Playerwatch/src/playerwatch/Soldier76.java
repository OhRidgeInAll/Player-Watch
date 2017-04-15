package playerwatch;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author micha
 */
public class Soldier76 extends Hero {

//variables unique to soldier
    int bioticFieldHealingDone;
    int bioticFieldsDeployed;
    int helixRocketKills;
    int helixRocketKillsAverage;
    int helixRocketKillsMostGame;
    int tacticalVisorKillsAverage;
    int tacticalVisorKillsMostGame;
    int selfHealing;
    int selfHealingAverage;
    int selfHealingMostGame;
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

        super.name = "Soldier76";
        this.soldier76Labels = new ArrayList();
        soldier76Labels.add(lblBioticFieldHealingDone = new Label("Biotic Field Healing Done: "));
        soldier76Labels.add(lblBioticFieldsDeployed = new Label("Biotic Fields Deployed: "));
        soldier76Labels.add(lblHelixRocketKills = new Label("Helix Rocket Kills: "));
        soldier76Labels.add(lblHelixRocketKillsAverage = new Label("Helix Rocket Kills Average: "));
        soldier76Labels.add(lblHelixRocketKillsMostGame = new Label("Helix Rocket"));
        soldier76Labels.add(lblTacticalVisorKillsAverage = new Label("Tactical Visor Kills Average: "));
        soldier76Labels.add(lblTacticalVisorKillsMostGame = new Label("Tactical Visor Kills Most Game: "));
        soldier76Labels.add(lblSelfHealing = new Label("Self Healing: "));
        soldier76Labels.add(lblSelfHealingAverage = new Label("Self Healing Average: "));
        soldier76Labels.add(lblSelfHealingMostGame = new Label("Self Healing Most Game: "));
        super.uniqueLabels = soldier76Labels;
        this.bioticFieldHealingDone = Integer.parseInt("1");
        this.bioticFieldsDeployed = Integer.parseInt("2");
        this.helixRocketKills = Integer.parseInt("3");
        this.helixRocketKillsAverage = Integer.parseInt("4");
        this.helixRocketKillsMostGame = Integer.parseInt("5");
        this.tacticalVisorKillsAverage = Integer.parseInt("6");
        this.tacticalVisorKillsMostGame = Integer.parseInt("7");
        this.selfHealing = Integer.parseInt("8");
        this.selfHealingAverage = Integer.parseInt("9");
        this.selfHealingMostGame = Integer.parseInt("10");
    }

    @Override
    public String toString() {
        return name;
    }

}
