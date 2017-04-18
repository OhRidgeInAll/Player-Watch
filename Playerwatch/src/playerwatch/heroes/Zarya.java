package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Zarya hero
 *
 * @author Michael Lyn
 */
public class Zarya extends Hero {

    //variables unqiue to Zarya
    double damageBlocked;
    double damageBlockedAverage;
    double damageBlockedMostGame;
    double energyMax;
    double gravSurgeAverage;
    double gravSurgeMostGame;
    double highEnergyKills;
    double highEnergyKillsAverage;
    double highEnergyKillsMostGame;
    double lifetimeEnergyAccumulation;
    double lifetimeGravSurgeKills;
    double projectedBarriers;
    double projectedBarriersAverage;
    double projectedBarriersMostGame;
    //labels to display variables of Zarya
    Label lblDamageBlocked;
    Label lblDamageBlockedAverage;
    Label lblDamageBlockedMostGame;
    Label lblEnergyMax;
    Label lblGravSurgeAverage;
    Label lblGravSurgeMostGame;
    Label lblHighEnergyKills;
    Label lblHighEnergyKillsAverage;
    Label lblHighEnergyKillsMostGame;
    Label lblLifetimeEnergyAccumulation;
    Label lblLifetimeGravSurgeKills;
    Label lblProjectedBarriers;
    Label lblProjectedBarriersAverage;
    Label lblProjectedBarriersMostGame;
    ArrayList<Label> zaryaLabels;

    /**
     * Zarya constructor, pass name to hero class
     */
    public Zarya() {

        //hero's name
        super.name = "Zarya";

    }

    /**
     * Method to generate labels for Zarya unique stats
     */
    public void labels() {
        //array list of labels for variables of Zarya
        zaryaLabels = new ArrayList<>();
        zaryaLabels.add(lblDamageBlocked = new Label("Damage Blocked: " + damageBlocked));
        zaryaLabels.add(lblDamageBlockedAverage = new Label("Damage Blocked Average: " + damageBlockedAverage));
        zaryaLabels.add(lblDamageBlockedMostGame = new Label("Damage Blocked Most Game: " + damageBlockedMostGame));
        zaryaLabels.add(lblEnergyMax = new Label("Energy Max: " + energyMax));
        zaryaLabels.add(lblGravSurgeAverage = new Label("Gravity Surge Average: " + gravSurgeAverage));
        zaryaLabels.add(lblGravSurgeMostGame = new Label("Gravity Surge Most Game: " + gravSurgeMostGame));
        zaryaLabels.add(lblHighEnergyKills = new Label("High Energy Kills: " + highEnergyKills));
        zaryaLabels.add(lblHighEnergyKillsAverage = new Label("High Energy Kills Average: " + highEnergyKillsAverage));
        zaryaLabels.add(lblHighEnergyKillsMostGame = new Label("High Energy Kills Most Game: " + highEnergyKillsMostGame));
        zaryaLabels.add(lblLifetimeEnergyAccumulation = new Label("Lifetime Energy Accumulation: " + lifetimeEnergyAccumulation));
        zaryaLabels.add(lblLifetimeGravSurgeKills = new Label("Lifetime Gravity Surge Kills: " + lifetimeGravSurgeKills));
        zaryaLabels.add(lblProjectedBarriers = new Label("Projected Barriers: " + projectedBarriers));
        zaryaLabels.add(lblProjectedBarriersAverage = new Label("Projected Barriers Average: " + projectedBarriersAverage));
        zaryaLabels.add(lblProjectedBarriersMostGame = new Label("Projected Barriers Most Game: " + projectedBarriersMostGame));
        super.uniqueLabels = zaryaLabels;
    }

    /**
     * set Zarya damageBlocked
     *
     * @param damageBlocked
     */
    public void setDamageBlocked(double damageBlocked) {
        this.damageBlocked = damageBlocked;
    }

    /**
     * set Zarya damageBlockedAverage
     *
     * @param damageBlockedAverage
     */
    public void setDamageBlockedAverage(double damageBlockedAverage) {
        this.damageBlockedAverage = damageBlockedAverage;
    }

    /**
     * set Zarya damageBlockedMostGame
     *
     * @param damageBlockedMostGame
     */
    public void setDamageBlockedMostGame(double damageBlockedMostGame) {
        this.damageBlockedMostGame = damageBlockedMostGame;
    }

    /**
     * set Zarya energyMax
     *
     * @param energyMax
     */
    public void setEnergyMax(double energyMax) {
        this.energyMax = energyMax;
    }

    /**
     * set Zarya gravSurgeAverage
     *
     * @param gravSurgeAverage
     */
    public void setGravSurgeAverage(double gravSurgeAverage) {
        this.gravSurgeAverage = gravSurgeAverage;
    }

    /**
     * set Zarya gravSurgeMostGame
     *
     * @param gravSurgeMostGame
     */
    public void setGravSurgeMostGame(double gravSurgeMostGame) {
        this.gravSurgeMostGame = gravSurgeMostGame;
    }

    /**
     * set Zarya highEnergyKills
     *
     * @param highEnergyKills
     */
    public void setHighEnergyKills(double highEnergyKills) {
        this.highEnergyKills = highEnergyKills;
    }

    /**
     * set Zarya highEnergyKillsAverage
     *
     * @param highEnergyKillsAverage
     */
    public void setHighEnergyKillsAverage(double highEnergyKillsAverage) {
        this.highEnergyKillsAverage = highEnergyKillsAverage;
    }

    /**
     * set Zarya highEnergyKillsMostGame
     *
     * @param highEnergyKillsMostGame
     */
    public void setHighEnergyKillsMostGame(double highEnergyKillsMostGame) {
        this.highEnergyKillsMostGame = highEnergyKillsMostGame;
    }

    /**
     * set Zarya lifetimeEnergyAccumulation
     *
     * @param lifetimeEnergyAccumulation
     */
    public void setLifetimeEnergyAccumulation(double lifetimeEnergyAccumulation) {
        this.lifetimeEnergyAccumulation = lifetimeEnergyAccumulation;
    }

    /**
     * set Zarya lifetimeGravSurgeKills
     *
     * @param lifetimeGravSurgeKills
     */
    public void setLifetimeGravSurgeKills(double lifetimeGravSurgeKills) {
        this.lifetimeGravSurgeKills = lifetimeGravSurgeKills;
    }

    /**
     * set Zarya projectedBarriers
     *
     * @param projectedBarriers
     */
    public void setProjectedBarriers(double projectedBarriers) {
        this.projectedBarriers = projectedBarriers;
    }

    /**
     * set Zarya projectedBarriersAverage
     *
     * @param projectedBarriersAverage
     */
    public void setProjectedBarriersAverage(double projectedBarriersAverage) {
        this.projectedBarriersAverage = projectedBarriersAverage;
    }

    /**
     * set Zarya projectedBarriersMostGame
     *
     * @param projectedBarriersMostGame
     */
    public void setProjectedBarriersMostGame(double projectedBarriersMostGame) {
        this.projectedBarriersMostGame = projectedBarriersMostGame;
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
