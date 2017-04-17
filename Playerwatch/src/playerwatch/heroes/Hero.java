package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author Michael Lyn
 */
public class Hero {

    //Variables that are used for every hero
    String name;
    ImageView heroImage;
    double soloKills;
    double soloKillsAverage;
    double objectiveKills;
    double objectiveKillsAverage;
    double eliminations;
    double multikills;
    double healingDone;
    double healingDoneAverage;
    double multikillBest;
    double timeSpentonFire;
    double timeSpentonFireAverage;
    double damageDoneAverage;
    double eliminationsAverage;
    double deaths;
    double deathsAverage;
    double environmentalDeaths;
    double gamesPlayed;
    double gamesWon;
    double timePlayed;
    double gamesTied;
    double gamesLost;
    double weaponAccuracy;
    double winPercentage;
    double killStreakBest;
    double criticalHits;
    double criticalHitAccuracy;
    //labels to display the variables of instance Hero
    Label lblSoloKills;
    Label lblObjectiveKills;
    Label lblEliminations;
    Label lblMultikills;
    Label lblHealingDone;
    Label lblMultikillBest;
    Label lblTimeSpentonFireAverage;
    Label lblSoloKillsAverage;
    Label lblObjectiveKillsAverage;
    Label lblHealingDoneAverage;
    Label lblDeathsAverage;
    Label lblDamageDoneAverage;
    Label lblEliminationsAverage;
    Label lblDeaths;
    Label lblEnvironmentalDeaths;
    Label lblGamesPlayed;
    Label lblGamesWon;
    Label lblTimeSpentonFire;
    Label lblTimePlayed;
    Label lblGamesTied;
    Label lblGamesLost;
    Label lblWeaponAccuracy;
    Label lblWinPercentage;
    Label lblKillStreakBest;
    Label lblCriticalHits;
    Label lblCriticalHitAccuracy;
    //array list to store Hero class labels, and store Unique hero labels
    ArrayList<Label> heroLabels;
    ArrayList<Label> uniqueLabels;

    public ArrayList<Label> getUniqueLabels() {
        return uniqueLabels;
    }

    public ArrayList<Label> getHeroLabels() {
        return heroLabels;
    }

    public Hero() {
        this.name = "HERO";
    }

    public void generalLabels(){

        heroLabels = new ArrayList<>();
        heroLabels.add(lblSoloKills = new Label("Solo Kills: " + soloKills));
        heroLabels.add(lblObjectiveKills = new Label("Objective Kills: " + objectiveKills));
        heroLabels.add(lblEliminations = new Label("Eliminations: " + objectiveKills));
        heroLabels.add(lblMultikills = new Label("Multi-Kills: " + multikills));
        heroLabels.add(lblHealingDone = new Label("Headling Done: " + healingDone));
        heroLabels.add(lblMultikillBest = new Label("Multi-Kills Best: " + multikillBest));
        heroLabels.add(lblTimeSpentonFireAverage = new Label("Time Spent on Fire Average: " + timeSpentonFireAverage));
        heroLabels.add(lblSoloKillsAverage = new Label("Solo Kills Average: " + soloKillsAverage));
        heroLabels.add(lblObjectiveKillsAverage = new Label("Objective Kills Average: " + objectiveKillsAverage));
        heroLabels.add(lblHealingDoneAverage = new Label("Healing Done Average: " + healingDoneAverage));
        heroLabels.add(lblDeathsAverage = new Label("Deaths Average: " + deathsAverage));
        heroLabels.add(lblDamageDoneAverage = new Label("Damage Done Average: " + damageDoneAverage));
        heroLabels.add(lblEliminationsAverage = new Label("Eliminations Average: " + eliminationsAverage));
        heroLabels.add(lblDeaths = new Label("Deaths: " + deaths));
        heroLabels.add(lblEnvironmentalDeaths = new Label("Environmental Deaths: " + environmentalDeaths));
        heroLabels.add(lblGamesPlayed = new Label("Games Played: " + gamesPlayed));
        heroLabels.add(lblGamesWon = new Label("Games Won: " + gamesWon));
        heroLabels.add(lblTimeSpentonFire = new Label("Time Spent on Fire: " + timeSpentonFire));
        heroLabels.add(lblTimePlayed = new Label("Time Played: " + timePlayed));
        heroLabels.add(lblGamesTied = new Label("Games Tied: " + gamesTied));
        heroLabels.add(lblGamesLost = new Label("Games Lost: " + gamesLost));
        heroLabels.add(lblWeaponAccuracy = new Label("Weapon Accuracy: " + weaponAccuracy));
        heroLabels.add(lblWinPercentage = new Label("Win Percentage: " + winPercentage));
        heroLabels.add(lblKillStreakBest = new Label("Kill Streak Best: " + killStreakBest));
        heroLabels.add(lblCriticalHits = new Label("Critical Hits: " + criticalHits));
        heroLabels.add(lblCriticalHitAccuracy = new Label("Critical Hits Accuracy: " + criticalHitAccuracy));
        this.heroLabels = heroLabels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoloKills(double soloKills) {
        this.soloKills = soloKills;
    }

    public void setSoloKillsAverage(double soloKillsAverage) {
        this.soloKillsAverage = soloKillsAverage;
    }

    public void setObjectiveKills(double objectiveKills) {
        this.objectiveKills = objectiveKills;
    }

    public void setObjectiveKillsAverage(double objectiveKillsAverage) {
        this.objectiveKillsAverage = objectiveKillsAverage;
    }

    public void setEliminations(double eliminations) {
        this.eliminations = eliminations;
    }

    public void setMultikills(double multikills) {
        this.multikills = multikills;
    }

    public void setHealingDone(double healingDone) {
        this.healingDone = healingDone;
    }

    public void setHealingDoneAverage(double healingDoneAverage) {
        this.healingDoneAverage = healingDoneAverage;
    }

    public void setMultikillBest(double multikillBest) {
        this.multikillBest = multikillBest;
    }

    public void setTimeSpentonFire(double timeSpentonFire) {
        this.timeSpentonFire = timeSpentonFire;
    }

    public void setTimeSpentonFireAverage(double timeSpentonFireAverage) {
        this.timeSpentonFireAverage = timeSpentonFireAverage;
    }

    public void setDamageDoneAverage(double damageDoneAverage) {
        this.damageDoneAverage = damageDoneAverage;
    }

    public void setEliminationsAverage(double eliminationsAverage) {
        this.eliminationsAverage = eliminationsAverage;
    }

    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }

    public void setDeathsAverage(double deathsAverage) {
        this.deathsAverage = deathsAverage;
    }

    public void setEnvironmentalDeaths(double environmentalDeaths) {
        this.environmentalDeaths = environmentalDeaths;
    }

    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setGamesWon(double gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
    }

    public void setGamesTied(double gamesTied) {
        this.gamesTied = gamesTied;
    }

    public void setGamesLost(double gamesLost) {
        this.gamesLost = gamesLost;
    }

    public void setWeaponAccuracy(double weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
    }

    public void setWinPercentage(double winPercentage) {
        this.winPercentage = winPercentage;
    }

    public void setKillStreakBest(double killStreakBest) {
        this.killStreakBest = killStreakBest;
    }

    public void setCriticalHits(double criticalHits) {
        this.criticalHits = criticalHits;
    }

    public void setCriticalHitAccuracy(double criticalHitAccuracy) {
        this.criticalHitAccuracy = criticalHitAccuracy;
    }

}
