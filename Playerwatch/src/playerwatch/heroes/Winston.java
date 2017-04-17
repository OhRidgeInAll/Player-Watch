package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Winston hero
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

    /**
     * Winston constructor, pass name to hero class
     */
    public Winston() {

        //hero's name
        super.name = "Winston";

    }

    /**
     * Method to generate labels for Winston unique labels
     */
    public void labels() {
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

    /**
     * set Winston damageBlocked
     *
     * @param damageBlocked
     */
    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    /**
     * set Winston damageBlockedAverage
     *
     * @param damageBlockedAverage
     */
    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    /**
     * set Winston damageBlockedMostGame
     *
     * @param damageBlockedMostGame
     */
    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    /**
     * set Winston jumpPackKills
     *
     * @param jumpPackKills
     */
    public void setJumpPackKills(double jumpPackKills) {
        this.jumpPackKills = jumpPackKills;
    }

    /**
     * set Winston jumpPackKillsAverage
     *
     * @param jumpPackKillsAverage
     */
    public void setJumpPackKillsAverage(double jumpPackKillsAverage) {
        this.jumpPackKillsAverage = jumpPackKillsAverage;
    }

    /**
     * set Winston jumpPackKillsMostGame
     *
     * @param jumpPackKillsMostGame
     */
    public void setJumpPackKillsMostGame(double jumpPackKillsMostGame) {
        this.jumpPackKillsMostGame = jumpPackKillsMostGame;
    }

    /**
     * set Winston meleeKills
     *
     * @param meleeKills
     */
    public void setMeleeKills(double meleeKills) {
        this.meleeKills = meleeKills;
    }

    /**
     * set Winston meleeKillsAverage
     *
     * @param meleeKillsAverage
     */
    public void setMeleeKillsAverage(double meleeKillsAverage) {
        this.meleeKillsAverage = meleeKillsAverage;
    }

    /**
     * set Winston meleeKillsMostGame
     *
     * @param meleeKillsMostGame
     */
    public void setMeleeKillsMostGame(double meleeKillsMostGame) {
        this.meleeKillsMostGame = meleeKillsMostGame;
    }

    /**
     * set Winston playersKnocked
     *
     * @param playersKnocked
     */
    public void setPlayersKnocked(double playersKnocked) {
        this.playersKnocked = playersKnocked;
    }

    /**
     * set Winston playersKnockedAverage
     *
     * @param playersKnockedAverage
     */
    public void setPlayersKnockedAverage(double playersKnockedAverage) {
        this.playersKnockedAverage = playersKnockedAverage;
    }

    /**
     * set Winston playersKnockedMostGame
     *
     * @param playersKnockedMostGame
     */
    public void setPlayersKnockedMostGame(double playersKnockedMostGame) {
        this.playersKnockedMostGame = playersKnockedMostGame;
    }

    /**
     * set Winston primalRageKills
     *
     * @param primalRageKills
     */
    public void setPrimalRageKills(double primalRageKills) {
        this.primalRageKills = primalRageKills;
    }

    /**
     * set Winston primalRageKillsAverage
     *
     * @param primalRageKillsAverage
     */
    public void setPrimalRageKillsAverage(double primalRageKillsAverage) {
        this.primalRageKillsAverage = primalRageKillsAverage;
    }

    /**
     * set Winston primalRageKillsMostGame
     *
     * @param primalRageKillsMostGame
     */
    public void setPrimalRageKillsMostGame(double primalRageKillsMostGame) {
        this.primalRageKillsMostGame = primalRageKillsMostGame;
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
