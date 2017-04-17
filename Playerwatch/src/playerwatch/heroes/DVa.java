package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class DVa extends Hero {

    //variables unqiue to DVa
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double mechDeaths;
    double mechCalled;
    double mechCalledAverage;
    double mechCalledMostGame;
    double selfDestructKills;
    double selfDestructKillsAverage;
    double selfDestructKillsMostGame;
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

    }

    public void labels() {
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

    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    public void setMechDeaths(double mechDeaths) {
        this.mechDeaths = mechDeaths;
    }

    public void setMechCalled(double mechCalled) {
        this.mechCalled = mechCalled;
    }

    public void setMechCalledAverage(double mechCalledAverage) {
        this.mechCalledAverage = mechCalledAverage;
    }

    public void setMechCalledMostGame(double mechCalledMostGame) {
        this.mechCalledMostGame = mechCalledMostGame;
    }

    public void setSelfDestructKills(double selfDestructKills) {
        this.selfDestructKills = selfDestructKills;
    }

    public void setSelfDestructKillsMostGame(double selfDestructKillsMostGame) {
        this.selfDestructKillsMostGame = selfDestructKillsMostGame;
    }

    public void setDvaLabels(ArrayList<Label> dvaLabels) {
        this.dvaLabels = dvaLabels;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
