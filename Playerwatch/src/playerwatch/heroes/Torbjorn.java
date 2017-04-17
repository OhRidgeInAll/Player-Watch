package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Torbjorn extends Hero {

    //variables unqiue to Torbjorn
    String armorPacksCreated;
    String armorPacksCreatedAverage;
    String armorPacksCreatedMostGame;
    String moltonCoreKills;
    String moltonCoreKillsAverage;
    String moltonCoreKillsMostGame;
    String torbjornKills;
    String torbjornKillsAverage;
    String torbjornKillsMostGame;
    String turretKills;
    String turretKillsAverage;
    String turretKillsMostGame;
    //labels to display variables of Torbjorn
    Label lblArmorPacksCreated;
    Label lblArmorPacksCreatedAverage;
    Label lblArmorPacksCreatedMostGame;
    Label lblMoltonCoreKills;
    Label lblMoltonCoreKillsAverage;
    Label lblMoltonCoreKillsMostGame;
    Label lblTorbjornKills;
    Label lblTorbjornKillsAverage;
    Label lblTorbjornKillsMostGame;
    Label lblTurretKills;
    Label lblTurretKillsAverage;
    Label lblTurretKillsMostGame;
    ArrayList<Label> torbjornLabels;

    public Torbjorn() {

        //hero's name
        super.name = "Torbjorn";
        //set variables unqiue to Torbjorn
        this.armorPacksCreated = "tur";
        this.armorPacksCreatedAverage = "tur";
        this.armorPacksCreatedMostGame = "tur";
        this.moltonCoreKills = "tur";
        this.moltonCoreKillsAverage = "tur";
        this.moltonCoreKillsMostGame = "tur";
        this.torbjornKills = "tur";
        this.torbjornKillsAverage = "tur";
        this.torbjornKillsMostGame = "tur";
        this.turretKills = "tur";
        this.turretKillsAverage = "tur";
        this.turretKillsMostGame = "tur";

        //array list of labels for variables of Torbjorn
        torbjornLabels = new ArrayList<>();
        torbjornLabels.add(lblArmorPacksCreated = new Label("Armor Packs Created: " + armorPacksCreated));
        torbjornLabels.add(lblArmorPacksCreatedAverage = new Label("Armor Packs Created Average: " + armorPacksCreatedAverage));
        torbjornLabels.add(lblArmorPacksCreatedMostGame = new Label("Armor Packs Created Most Game: " + armorPacksCreatedMostGame));
        torbjornLabels.add(lblMoltonCoreKills = new Label("Molton Core Kills: " + moltonCoreKills));
        torbjornLabels.add(lblMoltonCoreKillsAverage = new Label("Molton Core Kills Average: " + moltonCoreKillsAverage));
        torbjornLabels.add(lblMoltonCoreKillsMostGame = new Label("Molton Core Kills Most Game: " + moltonCoreKillsMostGame));
        torbjornLabels.add(lblTorbjornKills = new Label("Torbjorn Kills: " + torbjornKills));
        torbjornLabels.add(lblTorbjornKillsAverage = new Label("Torbjorn Kills Average: " + torbjornKillsAverage));
        torbjornLabels.add(lblTorbjornKillsMostGame = new Label("Torbjorn Kills Most Game: " + torbjornKillsMostGame));
        torbjornLabels.add(lblTurretKills = new Label("Turret Kills: " + turretKills));
        torbjornLabels.add(lblTurretKillsAverage = new Label("Turret Kills Average: " + turretKillsAverage));
        torbjornLabels.add(lblTurretKillsMostGame = new Label("Turret Kills Most Game: " + turretKillsMostGame));
        super.uniqueLabels = torbjornLabels;
    }

    @Override
    public String toString() {
        return name;
    }
}
