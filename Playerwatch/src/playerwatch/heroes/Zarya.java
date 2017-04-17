package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Zarya extends Hero {

    //variables unqiue to Zarya
    String averageEnergyBestGame;
    String damageBlocked;
    String damageBlockedAverage;
    String damageBlockedMostGame;
    String energyMax;
    String gravSurgeAverage;
    String gravSurgeMostGame;
    String highEnergyKills;
    String highEnergyKillsAverage;
    String highEnergyKillsMostGame;
    String lifetimeEnergyAccumulation;
    String lifetimeGravSurgeKills;
    String projectedBarriers;
    String projectedBarriersAverage;
    String projectedBarriersMostGame;
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
        //set variables unqiue to Zarya
        this.averageEnergyBestGame = "grav";
        this.damageBlocked = "grav";
        this.damageBlockedAverage = "grav";
        this.damageBlockedMostGame = "grav";
        this.energyMax = "grav";
        this.gravSurgeAverage = "grav";
        this.gravSurgeMostGame = "grav";
        this.highEnergyKills = "grav";
        this.highEnergyKillsAverage = "grav";
        this.highEnergyKillsMostGame = "grav";
        this.lifetimeEnergyAccumulation = "grav";
        this.lifetimeGravSurgeKills = "grav";
        this.projectedBarriers = "grav";
        this.projectedBarriersAverage = "grav";
        this.projectedBarriersMostGame = "grav";

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

    @Override
    public String toString() {
        return name;
    }
}
