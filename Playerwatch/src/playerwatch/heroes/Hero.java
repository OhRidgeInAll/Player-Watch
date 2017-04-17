package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author micha
 */
public class Hero {

    //Variables that are used for every hero
    String name;
    ImageView heroImage;
    int soloKills;
    int soloKillsAverage;
    int objectiveKills;
    int objectiveKillsAverage;
    int eliminations;
    int multikills;
    int healingDone;
    int healingDoneAverage;
    int multikillBest;
    int timeSpentonFire;
    int timeSpentonFireAverage;
    int damageDoneAverage;
    int eliminationsAverage;
    int deaths;
    int deathsAverage;
    int environmentalDeaths;
    int gamesPlayed;
    int gamesWon;
    int timePlayed;
    int gamesTied;
    int gamesLost;
    int weaponAccuracy;
    int winPercentage;
    int killStreakBest;
    int criticalHits;
    int criticalHitAccuracy;
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
        this.heroLabels = new ArrayList<>();
        heroLabels.add(lblSoloKills = new Label("Solo Kills: "));
        heroLabels.add(lblObjectiveKills = new Label("Objective Kills: "));
        heroLabels.add(lblEliminations = new Label("Eliminations: "));
        heroLabels.add(lblMultikills = new Label("Multi-Kills: "));
        heroLabels.add(lblHealingDone = new Label("Headling Done: "));
        heroLabels.add(lblMultikillBest = new Label("Multi-Kills Best: "));
        heroLabels.add(lblTimeSpentonFireAverage = new Label("Time Spent on Fire Average: "));
        heroLabels.add(lblSoloKillsAverage = new Label("Solo Kills Average: "));
        heroLabels.add(lblObjectiveKillsAverage = new Label("Objective Kills Average: "));
        heroLabels.add(lblHealingDoneAverage = new Label("Healing Done Average: "));
        heroLabels.add(lblDeathsAverage = new Label("Deaths Average: "));
        heroLabels.add(lblDamageDoneAverage = new Label("Damage Done Average: "));
        heroLabels.add(lblEliminationsAverage = new Label("Eliminations Average: "));
        heroLabels.add(lblDeaths = new Label("Deaths: "));
        heroLabels.add(lblEnvironmentalDeaths = new Label("Environmental Deaths: "));
        heroLabels.add(lblGamesPlayed = new Label("Games Played: "));
        heroLabels.add(lblGamesWon = new Label("Games Won: "));
        heroLabels.add(lblTimeSpentonFire = new Label("Time Spent on Fire: "));
        heroLabels.add(lblTimePlayed = new Label("Time Played: "));
        heroLabels.add(lblGamesTied = new Label("Games Tied: "));
        heroLabels.add(lblGamesLost = new Label("Games Lost: "));
        heroLabels.add(lblWeaponAccuracy = new Label("Weapon Accuracy: "));
        heroLabels.add(lblWinPercentage = new Label("Win Percentage: "));
        heroLabels.add(lblKillStreakBest = new Label("Kill Streak Best: "));
        heroLabels.add(lblCriticalHits = new Label("Critical Hits: "));
        heroLabels.add(lblCriticalHitAccuracy = new Label("Critical Hits Accuracy: "));
        this.name = "HERO";
        this.soloKills = Integer.parseInt("2");
        this.objectiveKills = Integer.parseInt("3");
        this.eliminations = Integer.parseInt("6");
        this.multikills = Integer.parseInt("7");
        this.healingDone = Integer.parseInt("8");
        this.multikillBest = Integer.parseInt("17");
        this.timeSpentonFireAverage = Integer.parseInt("21");
        this.soloKillsAverage = Integer.parseInt("22");
        this.objectiveKillsAverage = Integer.parseInt("24");
        this.healingDoneAverage = Integer.parseInt("25");
        this.deathsAverage = Integer.parseInt("27");
        this.damageDoneAverage = Integer.parseInt("28");
        this.eliminationsAverage = Integer.parseInt("29");
        this.deaths = Integer.parseInt("30");
        this.environmentalDeaths = Integer.parseInt("31");
        this.gamesPlayed = Integer.parseInt("37");
        this.gamesWon = Integer.parseInt("38");
        this.timeSpentonFire = Integer.parseInt("39");
        this.timePlayed = Integer.parseInt("41");
        this.gamesTied = Integer.parseInt("43");
        this.gamesLost = Integer.parseInt("44");
        this.weaponAccuracy = Integer.parseInt("48");
        this.winPercentage = Integer.parseInt("50");
        this.killStreakBest = Integer.parseInt("52");
        this.criticalHits = Integer.parseInt("53");
        this.criticalHitAccuracy = Integer.parseInt("55");
    }


    public int getSoloKills() {
        return soloKills;
    }

    public void setSoloKills(int soloKills) {
        this.soloKills = soloKills;
    }

    public int getObjectiveKills() {
        return objectiveKills;
    }

    public void setObjectiveKills(int objectiveKills) {
        this.objectiveKills = objectiveKills;
    }

    public int getEliminations() {
        return eliminations;
    }

    public void setEliminations(int eliminations) {
        this.eliminations = eliminations;
    }

    public int getMultikills() {
        return multikills;
    }

    public void setMultikills(int multikills) {
        this.multikills = multikills;
    }

    public int getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(int healingDone) {
        this.healingDone = healingDone;
    }

    public int getMultikillBest() {
        return multikillBest;
    }

    public void setMultikillBest(int multikillBest) {
        this.multikillBest = multikillBest;
    }

    public int getTimeSpentonFireAverage() {
        return timeSpentonFireAverage;
    }

    public void setTimeSpentonFireAverage(int timeSpentonFireAverage) {
        this.timeSpentonFireAverage = timeSpentonFireAverage;
    }

    public int getSoloKillsAverage() {
        return soloKillsAverage;
    }

    public void setSoloKillsAverage(int soloKillsAverage) {
        this.soloKillsAverage = soloKillsAverage;
    }

    public int getObjectiveKillsAverage() {
        return objectiveKillsAverage;
    }

    public void setObjectiveKillsAverage(int objectiveKillsAverage) {
        this.objectiveKillsAverage = objectiveKillsAverage;
    }

    public int getHealingDoneAverage() {
        return healingDoneAverage;
    }

    public void setHealingDoneAverage(int healingDoneAverage) {
        this.healingDoneAverage = healingDoneAverage;
    }

    public int getDeathsAverage() {
        return deathsAverage;
    }

    public void setDeathsAverage(int deathsAverage) {
        this.deathsAverage = deathsAverage;
    }

    public int getDamageDoneAverage() {
        return damageDoneAverage;
    }

    public void setDamageDoneAverage(int damageDoneAverage) {
        this.damageDoneAverage = damageDoneAverage;
    }

    public int getEliminationsAverage() {
        return eliminationsAverage;
    }

    public void setEliminationsAverage(int eliminationsAverage) {
        this.eliminationsAverage = eliminationsAverage;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getEnvironmentalDeaths() {
        return environmentalDeaths;
    }

    public void setEnvironmentalDeaths(int environmentalDeaths) {
        this.environmentalDeaths = environmentalDeaths;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getTimeSpentonFire() {
        return timeSpentonFire;
    }

    public void setTimeSpentonFire(int timeSpentonFire) {
        this.timeSpentonFire = timeSpentonFire;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getWeaponAccuracy() {
        return weaponAccuracy;
    }

    public void setWeaponAccuracy(int weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
    }

    public int getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(int winPercentage) {
        this.winPercentage = winPercentage;
    }

    public int getKillStreakBest() {
        return killStreakBest;
    }

    public void setKillStreakBest(int killStreakBest) {
        this.killStreakBest = killStreakBest;
    }

    public int getCriticalHits() {
        return criticalHits;
    }

    public void setCriticalHits(int criticalHits) {
        this.criticalHits = criticalHits;
    }

    public int getCriticalHitAccuracy() {
        return criticalHitAccuracy;
    }

    public void setCriticalHitAccuracy(int criticalHitAccuracy) {
        this.criticalHitAccuracy = criticalHitAccuracy;
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Image getHeroImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
