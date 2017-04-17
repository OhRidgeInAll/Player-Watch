package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Zarya extends Hero {

    //variables unqiue to Zarya
    double averageEnergyBestGame;
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
    Label lblAverageEnergyBestGame;
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

    public Zarya() {

        //hero's name
        super.name = "Zarya";

    }
    
    public void labels(){
        //array list of labels for variables of Zarya
        zaryaLabels = new ArrayList<>();
        zaryaLabels.add(lblAverageEnergyBestGame = new Label("Average Energy Best Game: " + averageEnergyBestGame));
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

    public void setAverageEnergyBestGame(double averageEnergyBestGame) {
        this.averageEnergyBestGame = averageEnergyBestGame;
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

    public void setEnergyMax(double energyMax) {
        this.energyMax = energyMax;
    }

    public void setGravSurgeAverage(double gravSurgeAverage) {
        this.gravSurgeAverage = gravSurgeAverage;
    }

    public void setGravSurgeMostGame(double gravSurgeMostGame) {
        this.gravSurgeMostGame = gravSurgeMostGame;
    }

    public void setHighEnergyKills(double highEnergyKills) {
        this.highEnergyKills = highEnergyKills;
    }

    public void setHighEnergyKillsAverage(double highEnergyKillsAverage) {
        this.highEnergyKillsAverage = highEnergyKillsAverage;
    }

    public void setHighEnergyKillsMostGame(double highEnergyKillsMostGame) {
        this.highEnergyKillsMostGame = highEnergyKillsMostGame;
    }

    public void setLifetimeEnergyAccumulation(double lifetimeEnergyAccumulation) {
        this.lifetimeEnergyAccumulation = lifetimeEnergyAccumulation;
    }

    public void setLifetimeGravSurgeKills(double lifetimeGravSurgeKills) {
        this.lifetimeGravSurgeKills = lifetimeGravSurgeKills;
    }

    public void setProjectedBarriers(double projectedBarriers) {
        this.projectedBarriers = projectedBarriers;
    }

    public void setProjectedBarriersAverage(double projectedBarriersAverage) {
        this.projectedBarriersAverage = projectedBarriersAverage;
    }

    public void setProjectedBarriersMostGame(double projectedBarriersMostGame) {
        this.projectedBarriersMostGame = projectedBarriersMostGame;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}
