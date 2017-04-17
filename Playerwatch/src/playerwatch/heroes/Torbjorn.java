package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Torbjorn hero
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

    /**
     * Torbjorn constructor, pass name to hero class
     */
    public Torbjorn() {

        //hero's name
        super.name = "Torbjorn";

    }

    /**
     * Method to generate labels for Torbjorn unique stats
     */
    public void labels() {
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

    /**
     * set Torbjorn armorPacksCreated
     *
     * @param armorPacksCreated
     */
    public void setArmorPacksCreated(double armorPacksCreated) {
        this.armorPacksCreated = armorPacksCreated;
    }

    /**
     * set Torbjorn armorPacksCreatedAverage
     *
     * @param armorPacksCreatedAverage
     */
    public void setArmorPacksCreatedAverage(double armorPacksCreatedAverage) {
        this.armorPacksCreatedAverage = armorPacksCreatedAverage;
    }

    /**
     * set Torbjorn armorPacksCreatedMostGame
     *
     * @param armorPacksCreatedMostGame
     */
    public void setArmorPacksCreatedMostGame(double armorPacksCreatedMostGame) {
        this.armorPacksCreatedMostGame = armorPacksCreatedMostGame;
    }

    /**
     * set Torbjorn moltonCoreKills
     *
     * @param moltonCoreKills
     */
    public void setMoltonCoreKills(double moltonCoreKills) {
        this.moltonCoreKills = moltonCoreKills;
    }

    /**
     * set Tobjorn moltonCoreKillsAverage
     *
     * @param moltonCoreKillsAverage
     */
    public void setMoltonCoreKillsAverage(double moltonCoreKillsAverage) {
        this.moltonCoreKillsAverage = moltonCoreKillsAverage;
    }

    /**
     * set Torbjorn moltonCoreKillsMostGame
     *
     * @param moltonCoreKillsMostGame
     */
    public void setMoltonCoreKillsMostGame(double moltonCoreKillsMostGame) {
        this.moltonCoreKillsMostGame = moltonCoreKillsMostGame;
    }

    /**
     * set Torbjorn torbjornKills
     *
     * @param torbjornKills
     */
    public void setTorbjornKills(double torbjornKills) {
        this.torbjornKills = torbjornKills;
    }

    /**
     * set Torbjorn torbjornKillsAverage
     *
     * @param torbjornKillsAverage
     */
    public void setTorbjornKillsAverage(double torbjornKillsAverage) {
        this.torbjornKillsAverage = torbjornKillsAverage;
    }

    /**
     * set Torbjorn torbjornKillsMostGame
     *
     * @param torbjornKillsMostGame
     */
    public void setTorbjornKillsMostGame(double torbjornKillsMostGame) {
        this.torbjornKillsMostGame = torbjornKillsMostGame;
    }

    /**
     * set Torbjorn turretKills
     *
     * @param turretKills
     */
    public void setTurretKills(double turretKills) {
        this.turretKills = turretKills;
    }

    /**
     * set Torbjorn turretKillsAverage
     *
     * @param turretKillsAverage
     */
    public void setTurretKillsAverage(double turretKillsAverage) {
        this.turretKillsAverage = turretKillsAverage;
    }

    /**
     * set Torbjorn turretKillsMostGame
     *
     * @param turretKillsMostGame
     */
    public void setTurretKillsMostGame(double turretKillsMostGame) {
        this.turretKillsMostGame = turretKillsMostGame;
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
