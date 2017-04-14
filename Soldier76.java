package playerwatch;

/**
 *
 * @author micha
 */
public class Soldier76 extends Hero {

//variables unique to soldier
    int bioticFieldHealingDone;
    int bioticFiledsDeployed;
    int helixRocketKills;
    int helixRocketKillsAverage;
    int helixRockertKillsMostGame;
    int tacticalVisorKillsAverage;
    int tacticalVisorKillsMostGame;
    int selfHealing;
    int selfHealingAverage;
    int selfHealingMostGame;

    public Soldier76() {

        super.name = "Soldier76";
        this.bioticFieldHealingDone = Integer.parseInt("1");
        this.bioticFiledsDeployed = Integer.parseInt("2");
        this.helixRocketKills = Integer.parseInt("3");
        this.helixRocketKillsAverage = Integer.parseInt("4");
        this.helixRockertKillsMostGame = Integer.parseInt("5");
        this.tacticalVisorKillsAverage = Integer.parseInt("6");
        this.tacticalVisorKillsMostGame = Integer.parseInt("7");
        this.selfHealing = Integer.parseInt("8");
        this.selfHealingAverage = Integer.parseInt("9");
        this.selfHealingMostGame = Integer.parseInt("10");
    }
    
    @Override
    public String toString(){
        return name;
    }

}
