package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Torbjorn extends Hero {

    //variables unqiue to Torbjorn
    double armorPacksCreated;
    double armorPacksCreatedAverage;
    double armorPacksCreatedMostGame;
    double moltonCoreKills;
    double moltonCoreKillsAverage;
    double moltonCoreKillsMostGame;
    double torbjornKills;
    double torbjornKillsAverage;
    double torbjornKillsMostGame;
    double turretKills;
    double turretKillsAverage;
    double turretKillsMostGame;
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

    }

    public void labels(){
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

    public void setArmorPacksCreated(double armorPacksCreated) {
        this.armorPacksCreated = armorPacksCreated;
    }

    public void setArmorPacksCreatedAverage(double armorPacksCreatedAverage) {
        this.armorPacksCreatedAverage = armorPacksCreatedAverage;
    }

    public void setArmorPacksCreatedMostGame(double armorPacksCreatedMostGame) {
        this.armorPacksCreatedMostGame = armorPacksCreatedMostGame;
    }

    public void setMoltonCoreKills(double moltonCoreKills) {
        this.moltonCoreKills = moltonCoreKills;
    }

    public void setMoltonCoreKillsAverage(double moltonCoreKillsAverage) {
        this.moltonCoreKillsAverage = moltonCoreKillsAverage;
    }

    public void setMoltonCoreKillsMostGame(double moltonCoreKillsMostGame) {
        this.moltonCoreKillsMostGame = moltonCoreKillsMostGame;
    }

    public void setTorbjornKills(double torbjornKills) {
        this.torbjornKills = torbjornKills;
    }

    public void setTorbjornKillsAverage(double torbjornKillsAverage) {
        this.torbjornKillsAverage = torbjornKillsAverage;
    }

    public void setTorbjornKillsMostGame(double torbjornKillsMostGame) {
        this.torbjornKillsMostGame = torbjornKillsMostGame;
    }

    public void setTurretKills(double turretKills) {
        this.turretKills = turretKills;
    }

    public void setTurretKillsAverage(double turretKillsAverage) {
        this.turretKillsAverage = turretKillsAverage;
    }

    public void setTurretKillsMostGame(double turretKillsMostGame) {
        this.turretKillsMostGame = turretKillsMostGame;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
}
