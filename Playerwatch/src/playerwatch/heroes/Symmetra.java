package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Symmetra extends Hero {

    //variables unqiue to Symmetra
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String playersTeleported;
    String playersTeleportedAverage;
    String playersTeleportedMostGame;
    String sentryKills;
    String sentryKillsAverage;
    String sentryKillsMostGame;
    String shieldsProvided;
    String shieldProvidedAverage;
    String shieldsProvidedMostGame;
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
        //set variables unqiue to Symmetra
        this.damageBlocked = "nerf";
        this.damageBlockedAverage = "nerf";
        this.damageBlockedMostGame = "nerf";
        this.playersTeleported = "nerf";
        this.playersTeleportedAverage = "nerf";
        this.playersTeleportedMostGame = "nerf";
        this.sentryKills = "nerf";
        this.sentryKillsAverage = "nerf";
        this.sentryKillsMostGame = "nerf";
        this.shieldsProvided = "nerf";
        this.shieldProvidedAverage = "nerf";
        this.shieldsProvidedMostGame = "nerf";

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

    @Override
    public String toString() {
        return name;
    }
}
