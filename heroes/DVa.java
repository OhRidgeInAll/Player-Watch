package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class DVa extends Hero {

    //variables unqiue to DVa
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String mechDeaths;
    String mechCalled;
    String mechCalledAverage;
    String mechCalledMostGame;
    String selfDestructKills;
    String selfDestructKillsAverage;
    String selfDestructKillsMostGame;
    //labels to display variables of DVa
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblMechDeaths;
    Label lblMechCalled;
    Label lblMechCalledAverage;
    Label lblMechCalledMostGame;
    Label lblSelfDestructKills;
    Label lblSelfDestructKillsAverage;
    Label lblselfDestructKillsMostGame;
    ArrayList<Label> dvaLabels;

    public DVa() {

        //hero's name
        super.name = "D.Va";
        //set variables unqiue to DVa
        this.damageBlocked = "1";
        this.damageBlockedAverage = "1";
        this.damageBlockedMostGame = "1";
        this.mechDeaths = "1";
        this.mechCalled = "1";
        this.mechCalledAverage = "1";
        this.mechCalledMostGame = "1";
        this.selfDestructKills = "1";
        this.selfDestructKillsAverage = "1";
        this.selfDestructKillsMostGame = "1";
        //array list of labels for variables of DVa
        dvaLabels = new ArrayList<>();
        dvaLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        dvaLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        dvaLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        dvaLabels.add(lblMechDeaths = new Label("Mech Deaths: " + mechDeaths));
        dvaLabels.add(lblMechCalled = new Label("Mech Called: " + mechCalled));
        dvaLabels.add(lblMechCalledAverage = new Label("Mech Called Average: " + mechCalledAverage));
        dvaLabels.add(lblMechCalledMostGame = new Label("Mech Called Most Game: " + mechCalledMostGame));
        dvaLabels.add(lblSelfDestructKills = new Label("Self Destruct Kills: " + selfDestructKills));
        dvaLabels.add(lblSelfDestructKillsAverage = new Label("Self Destruct Kills Average: " + selfDestructKillsAverage));
        dvaLabels.add(lblselfDestructKillsMostGame = new Label("Self Destruct Kills Most Game: " + selfDestructKillsMostGame));
        super.uniqueLabels = dvaLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
