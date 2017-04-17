package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Symmetra extends Hero {

    //variables unqiue to Symmetra
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double playersTeleported;
    double playersTeleportedAverage;
    double playersTeleportedMostGame;
    double sentryKills;
    double sentryKillsAverage;
    double sentryKillsMostGame;
    double shieldsProvided;
    double shieldProvidedAverage;
    double shieldsProvidedMostGame;
    //labels to display variables of Symmetra
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblPlayersTeleported;
    Label lblPlayersTeleportedAverage;
    Label lblPlayersTeleportedMostGame;
    Label lblSentryKills;
    Label lblSentryKillsAverage;
    Label lblSentryKillsMostGame;
    Label lblShieldsProvided;
    Label lblShieldProvidedAverage;
    Label lblShieldsProvidedMostGame;
    ArrayList<Label> symmetraLabels;

    public Symmetra() {

        //hero's name
        super.name = "Symmetra";

    }

    public void labels() {
        //array list of labels for variables of Symmetra
        symmetraLabels = new ArrayList<>();
        symmetraLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        symmetraLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        symmetraLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        symmetraLabels.add(lblPlayersTeleported = new Label("Players Teleported: " + playersTeleported));
        symmetraLabels.add(lblPlayersTeleportedAverage = new Label("Players Teleported Average: " + playersTeleportedAverage));
        symmetraLabels.add(lblPlayersTeleportedMostGame = new Label("Players Teleported Most Game: " + playersTeleportedMostGame));
        symmetraLabels.add(lblSentryKills = new Label("Sentry Kills: " + sentryKills));
        symmetraLabels.add(lblSentryKillsAverage = new Label("Sentry Kills Average: " + sentryKillsAverage));
        symmetraLabels.add(lblSentryKillsMostGame = new Label("Sentry Kills Most Game: " + sentryKillsMostGame));
        symmetraLabels.add(lblShieldsProvided = new Label("Shields Provided: " + shieldsProvided));
        symmetraLabels.add(lblShieldProvidedAverage = new Label("Shields Provided Average: " + shieldProvidedAverage));
        symmetraLabels.add(lblShieldsProvidedMostGame = new Label("Shield Provided Most Game: " + shieldsProvidedMostGame));
        super.uniqueLabels = symmetraLabels;
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

    public void setPlayersTeleported(double playersTeleported) {
        this.playersTeleported = playersTeleported;
    }

    public void setPlayersTeleportedAverage(double playersTeleportedAverage) {
        this.playersTeleportedAverage = playersTeleportedAverage;
    }

    public void setPlayersTeleportedMostGame(double playersTeleportedMostGame) {
        this.playersTeleportedMostGame = playersTeleportedMostGame;
    }

    public void setSentryKills(double sentryKills) {
        this.sentryKills = sentryKills;
    }

    public void setSentryKillsAverage(double sentryKillsAverage) {
        this.sentryKillsAverage = sentryKillsAverage;
    }

    public void setSentryKillsMostGame(double sentryKillsMostGame) {
        this.sentryKillsMostGame = sentryKillsMostGame;
    }

    public void setShieldsProvided(double shieldsProvided) {
        this.shieldsProvided = shieldsProvided;
    }

    public void setShieldProvidedAverage(double shieldProvidedAverage) {
        this.shieldProvidedAverage = shieldProvidedAverage;
    }

    public void setShieldsProvidedMostGame(double shieldsProvidedMostGame) {
        this.shieldsProvidedMostGame = shieldsProvidedMostGame;
    }

    @Override
    public String toString() {
        return name;
    }
}
