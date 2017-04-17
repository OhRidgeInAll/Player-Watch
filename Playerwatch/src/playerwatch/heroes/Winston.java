package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Winston extends Hero {

    //variables unqiue to Winston
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double jumpPackKills;
    double jumpPackKillsAverage;
    double jumpPackKillsMostGame;
    double meleeKills;
    double meleeKillsAverage;
    double meleeKillsMostGame;
    double playersKnocked;
    double playersKnockedAverage;
    double playersKnockedMostGame;
    double primalRageKills;
    double primalRageKillsAverage;
    double primalRageKillsMostGame;
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

    }

    public void labels(){
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

    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    public void setJumpPackKills(double jumpPackKills) {
        this.jumpPackKills = jumpPackKills;
    }

    public void setJumpPackKillsAverage(double jumpPackKillsAverage) {
        this.jumpPackKillsAverage = jumpPackKillsAverage;
    }

    public void setJumpPackKillsMostGame(double jumpPackKillsMostGame) {
        this.jumpPackKillsMostGame = jumpPackKillsMostGame;
    }

    public void setMeleeKills(double meleeKills) {
        this.meleeKills = meleeKills;
    }

    public void setMeleeKillsAverage(double meleeKillsAverage) {
        this.meleeKillsAverage = meleeKillsAverage;
    }

    public void setMeleeKillsMostGame(double meleeKillsMostGame) {
        this.meleeKillsMostGame = meleeKillsMostGame;
    }

    public void setPlayersKnocked(double playersKnocked) {
        this.playersKnocked = playersKnocked;
    }

    public void setPlayersKnockedAverage(double playersKnockedAverage) {
        this.playersKnockedAverage = playersKnockedAverage;
    }

    public void setPlayersKnockedMostGame(double playersKnockedMostGame) {
        this.playersKnockedMostGame = playersKnockedMostGame;
    }

    public void setPrimalRageKills(double primalRageKills) {
        this.primalRageKills = primalRageKills;
    }

    public void setPrimalRageKillsAverage(double primalRageKillsAverage) {
        this.primalRageKillsAverage = primalRageKillsAverage;
    }

    public void setPrimalRageKillsMostGame(double primalRageKillsMostGame) {
        this.primalRageKillsMostGame = primalRageKillsMostGame;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
}
