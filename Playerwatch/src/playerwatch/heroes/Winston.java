package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Winston extends Hero {

    //variables unqiue to Winston
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String jumpPackKills;
    String jumpPackKillsAverage;
    String jumpPackKillsMostGame;
    String meleeKills;
    String meleeKillsAverage;
    String meleeKillsMostGame;
    String playersKnocked;
    String playersKnockedAverage;
    String playersKnockedMostGame;
    String primalRageKills;
    String primalRageKillsAverage;
    String primalRageKillsMostGame;
    //labels to display variables of Winston
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblJumpPackKills;
    Label lblJumpPackKillsAverage;
    Label lblJumpPackKillsMostGame;
    Label lblMeleeKills;
    Label lblMeleeKillsAverage;
    Label lblMeleeKillsMostGame;
    Label lblPlayersKnocked;
    Label lblPlayersKnockedAverage;
    Label lblPlayersKnockedMostGame;
    Label lblPrimalRageKills;
    Label lblPrimalRageKillsAverage;
    Label lblPrimalRageKillsMostGame;
    ArrayList<Label> winstonLabels;

    public Winston() {

        //hero's name
        super.name = "Winston";
        //set variables unqiue to Winston
        this.damageBlocked = "ape";
        this.damageBlockedAverage = "ape";
        this.damageBlockedMostGame = "ape";
        this.jumpPackKills = "ape";
        this.jumpPackKillsAverage = "ape";
        this.jumpPackKillsMostGame = "ape";
        this.meleeKills = "ape";
        this.meleeKillsAverage = "ape";
        this.meleeKillsMostGame = "ape";
        this.playersKnocked = "ape";
        this.playersKnockedAverage = "ape";
        this.playersKnockedMostGame = "ape";
        this.primalRageKills = "ape";
        this.primalRageKillsAverage = "ape";
        this.primalRageKillsMostGame = "ape";

        //array list of labels for variables of Winston
        winstonLabels = new ArrayList<>();
        winstonLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        winstonLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        winstonLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        winstonLabels.add(lblJumpPackKills = new Label("Jump Pack Kills: " + jumpPackKills));
        winstonLabels.add(lblJumpPackKillsAverage = new Label("Jump Pack Kills Average: " + jumpPackKillsAverage));
        winstonLabels.add(lblJumpPackKillsMostGame = new Label("Jump Pack Kills Most Game: " + jumpPackKillsMostGame));
        winstonLabels.add(lblMeleeKills = new Label("Melee Kills: " + meleeKills));
        winstonLabels.add(lblMeleeKillsAverage = new Label("Melee Kills Average: " + meleeKillsAverage));
        winstonLabels.add(lblMeleeKillsMostGame = new Label("Melee Kills Most Game: " + meleeKillsMostGame));
        winstonLabels.add(lblPlayersKnocked = new Label("Players Knocked: " + playersKnocked));
        winstonLabels.add(lblPlayersKnockedAverage = new Label("Players Knocked Average: " + playersKnockedAverage));
        winstonLabels.add(lblPlayersKnockedMostGame = new Label("Players Knocked Most Game: " + playersKnockedMostGame));
        winstonLabels.add(lblPrimalRageKills = new Label("Primal Rage Kills: " + primalRageKills));
        winstonLabels.add(lblPrimalRageKillsAverage = new Label("Primal Rage Kills Average: " + primalRageKillsAverage));
        winstonLabels.add(lblPrimalRageKillsMostGame = new Label("Primal Rage Kills Most Game: " + primalRageKillsMostGame));
        super.uniqueLabels = winstonLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
