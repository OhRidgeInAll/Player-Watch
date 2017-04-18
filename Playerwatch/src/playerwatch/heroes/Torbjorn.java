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
    double moltenCoreKills;
    double moltenCoreKillsAverage;
    double moltenCoreKillsMostGame;
    double torbjornKills;
    double torbjornKillsAverage;
    double torbjornKillsMostGame;
    double turretKills;
    double turretKillsAverage;
    //labels to display variables of Torbjorn
    Label lblArmorPacksCreated;
    Label lblArmorPacksCreatedAverage;
    Label lblMoltenCoreKills;
    Label lblMoltenCoreKillsAverage;
    Label lblMoltenCoreKillsMostGame;
    Label lblTorbjornKills;
    Label lblTorbjornKillsAverage;
    Label lblTorbjornKillsMostGame;
    Label lblTurretKills;
    Label lblTurretKillsAverage;
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
        torbjornLabels.add(lblMoltenCoreKills = new Label("Molten Core Kills: " + moltenCoreKills));
        torbjornLabels.add(lblMoltenCoreKillsAverage = new Label("Molten Core Kills Average: " + moltenCoreKillsAverage));
        torbjornLabels.add(lblMoltenCoreKillsMostGame = new Label("Molten Core Kills Most Game: " + moltenCoreKillsMostGame));
        torbjornLabels.add(lblTorbjornKills = new Label("Torbjorn Kills: " + torbjornKills));
        torbjornLabels.add(lblTorbjornKillsAverage = new Label("Torbjorn Kills Average: " + torbjornKillsAverage));
        torbjornLabels.add(lblTorbjornKillsMostGame = new Label("Torbjorn Kills Most Game: " + torbjornKillsMostGame));
        torbjornLabels.add(lblTurretKills = new Label("Turret Kills: " + turretKills));
        torbjornLabels.add(lblTurretKillsAverage = new Label("Turret Kills Average: " + turretKillsAverage));
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
     * set Torbjorn moltenCoreKills
     *
     * @param moltenCoreKills
     */
    public void setMoltenCoreKills(double moltenCoreKills) {
        this.moltenCoreKills = moltenCoreKills;
    }

    /**
     * set Tobjorn moltenCoreKillsAverage
     *
     * @param moltenCoreKillsAverage
     */
    public void setMoltenCoreKillsAverage(double moltenCoreKillsAverage) {
        this.moltenCoreKillsAverage = moltenCoreKillsAverage;
    }

    /**
     * set Torbjorn moltenCoreKillsMostGame
     *
     * @param moltenCoreKillsMostGame
     */
    public void setMoltenCoreKillsMostGame(double moltenCoreKillsMostGame) {
        this.moltenCoreKillsMostGame = moltenCoreKillsMostGame;
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
     * Override toString() method
     *
     * @return name - hero's name
     */
    @Override
    public String toString() {
        return name;
    }
}
