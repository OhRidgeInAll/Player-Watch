package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * Class that extends all unique Heroes
 * Holds all variables shared between each different Hero
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

    /**
     * get the uniqueLabels of each hero, variables unique to the hero
     * @return 
     */
    public ArrayList<Label> getUniqueLabels() {
        return uniqueLabels;
    }

    /**
     * get the heroLabels of each hero, variables shared between heroes
     * @return 
     */
    public ArrayList<Label> getHeroLabels() {
        return heroLabels;
    }

    /**
     * Hero constructor, set's name of instance as HERO
     */
    public Hero() {
        this.name = "HERO";
    }

    /**
     * Method to generate labels of variables shared between heroes
     */
    public void generalLabels(){

        heroLabels = new ArrayList<>();
        heroLabels.add(lblSoloKills = new Label("Solo Kills: " + soloKills));
        heroLabels.add(lblObjectiveKills = new Label("Objective Kills: " + objectiveKills));
        heroLabels.add(lblEliminations = new Label("Eliminations: " + objectiveKills));
        heroLabels.add(lblMultikills = new Label("Multi-Kills: " + multikills));
        heroLabels.add(lblHealingDone = new Label("Headling Done: " + healingDone));
        heroLabels.add(lblMultikillBest = new Label("Multi-Kills Best: " + multikillBest));
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

    /**
     * set Hero soloKills
     * @param soloKills 
     */
    public void setSoloKills(double soloKills) {
        this.soloKills = soloKills;
    }

    /**
     * set Hero soloKillsAverage
     * @param soloKillsAverage 
     */
    public void setSoloKillsAverage(double soloKillsAverage) {
        this.soloKillsAverage = soloKillsAverage;
    }

    /**
     * set Hero objectiveKills
     * @param objectiveKills 
     */
    public void setObjectiveKills(double objectiveKills) {
        this.objectiveKills = objectiveKills;
    }

    /**
     * set Hero objectiveKillsAverage
     * @param objectiveKillsAverage 
     */
    public void setObjectiveKillsAverage(double objectiveKillsAverage) {
        this.objectiveKillsAverage = objectiveKillsAverage;
    }

    /**
     * set Hero eliminations
     * @param eliminations 
     */
    public void setEliminations(double eliminations) {
        this.eliminations = eliminations;
    }

    /**
     * set Hero multikills
     * @param multikills 
     */
    public void setMultikills(double multikills) {
        this.multikills = multikills;
    }

    /**
     * set Hero healingDone
     * @param healingDone 
     */
    public void setHealingDone(double healingDone) {
        this.healingDone = healingDone;
    }

    /**
     * set Hero healingDoneAverage
     * @param healingDoneAverage 
     */
    public void setHealingDoneAverage(double healingDoneAverage) {
        this.healingDoneAverage = healingDoneAverage;
    }

    /**
     * set Hero multikillBest
     * @param multikillBest 
     */
    public void setMultikillBest(double multikillBest) {
        this.multikillBest = multikillBest;
    }

    /**
     * set Hero damageDoneAverage
     * @param damageDoneAverage 
     */
    public void setDamageDoneAverage(double damageDoneAverage) {
        this.damageDoneAverage = damageDoneAverage;
    }

    /**
     * set Hero eliminationsAverage
     * @param eliminationsAverage 
     */
    public void setEliminationsAverage(double eliminationsAverage) {
        this.eliminationsAverage = eliminationsAverage;
    }

    /**
     * set Hero deaths
     * @param deaths 
     */
    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }

    /**
     * set Hero deathsAverage
     * @param deathsAverage 
     */
    public void setDeathsAverage(double deathsAverage) {
        this.deathsAverage = deathsAverage;
    }

    /**
     * set Hero environmentalDeaths
     * @param environmentalDeaths 
     */
    public void setEnvironmentalDeaths(double environmentalDeaths) {
        this.environmentalDeaths = environmentalDeaths;
    }

    /**
     * set Hero gamesPlayed
     * @param gamesPlayed 
     */
    public void setGamesPlayed(double gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * set Hero gamesWon
     * @param gamesWon 
     */
    public void setGamesWon(double gamesWon) {
        this.gamesWon = gamesWon;
    }

    /**
     * set Hero timePlayed
     * @param timePlayed 
     */
    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
    }

    /**
     * set Hero gamesTied
     * @param gamesTied 
     */
    public void setGamesTied(double gamesTied) {
        this.gamesTied = gamesTied;
    }

    /**
     * set Hero gamesLost
     * @param gamesLost 
     */
    public void setGamesLost(double gamesLost) {
        this.gamesLost = gamesLost;
    }

    /**
     * set Hero weaponAccuracy
     * @param weaponAccuracy 
     */
    public void setWeaponAccuracy(double weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
    }

    /**
     * set Hero winPercetage
     * @param winPercentage 
     */
    public void setWinPercentage(double winPercentage) {
        this.winPercentage = winPercentage;
    }

    /**
     * set Hero killStreakBest
     * @param killStreakBest 
     */
    public void setKillStreakBest(double killStreakBest) {
        this.killStreakBest = killStreakBest;
    }

    /**
     * set Hero criticalHits
     * @param criticalHits 
     */
    public void setCriticalHits(double criticalHits) {
        this.criticalHits = criticalHits;
    }

    /**
     * set Hero criticalHitAccuracy
     * @param criticalHitAccuracy 
     */
    public void setCriticalHitAccuracy(double criticalHitAccuracy) {
        this.criticalHitAccuracy = criticalHitAccuracy;
    }

}
