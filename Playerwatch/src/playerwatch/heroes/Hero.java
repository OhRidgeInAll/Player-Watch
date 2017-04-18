package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class that extends all unique Heroes
 * Holds all variables shared between each different Hero
 * 
 * @author Michael Lyn
 */
public class Hero {

    //Variables that are used for every hero
    String name;
    double soloKills;
    double soloKillsAverage;
    double objectiveKills;
    double objectiveKillsAverage;
    double eliminations;
    double eliminationsAverage;
    double deaths;
    double deathsAverage;
    double environmentalDeaths;
    double gamesWon;
    double timePlayed;
    double weaponAccuracy;
    double criticalHits;
    double criticalHitAccuracy;
    //labels to display the variables of instance Hero
    Label lblSoloKills;
    Label lblObjectiveKills;
    Label lblEliminations;
    Label lblSoloKillsAverage;
    Label lblObjectiveKillsAverage;
    Label lblDeathsAverage;
    Label lblEliminationsAverage;
    Label lblDeaths;
    Label lblEnvironmentalDeaths;
    Label lblGamesWon;
    Label lblTimePlayed;
    Label lblWeaponAccuracy;
    Label lblCriticalHits;
    Label lblCriticalHitAccuracy;
    //array list to store Hero class labels, and store Unique hero labels
    ArrayList<Label> heroLabels;
    ArrayList<Label> uniqueLabels;

    /**
     * get the uniqueLabels of each hero, variables unique to the hero
     * @return uniqueLabels
     */
    public ArrayList<Label> getUniqueLabels() {
        return uniqueLabels;
    }

    /**
     * get the heroLabels of each hero, variables shared between heroes
     * @return heroLabels
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
        heroLabels.add(lblSoloKillsAverage = new Label("Solo Kills Average: " + soloKillsAverage));
        heroLabels.add(lblObjectiveKillsAverage = new Label("Objective Kills Average: " + objectiveKillsAverage));
        heroLabels.add(lblDeathsAverage = new Label("Deaths Average: " + deathsAverage));
        heroLabels.add(lblEliminationsAverage = new Label("Eliminations Average: " + eliminationsAverage));
        heroLabels.add(lblDeaths = new Label("Deaths: " + deaths));
        heroLabels.add(lblEnvironmentalDeaths = new Label("Environmental Deaths: " + environmentalDeaths));
        heroLabels.add(lblGamesWon = new Label("Games Won: " + gamesWon));
        heroLabels.add(lblTimePlayed = new Label("Time Played: " + timePlayed));
        heroLabels.add(lblWeaponAccuracy = new Label("Weapon Accuracy: " + weaponAccuracy));
        heroLabels.add(lblCriticalHits = new Label("Critical Hits: " + criticalHits));
        heroLabels.add(lblCriticalHitAccuracy = new Label("Critical Hits Accuracy: " + criticalHitAccuracy));
        this.heroLabels = heroLabels;
    }

    /**
     * get Name of Hero
     * @return name
     */
    public String getName() {
        return name;
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
     * set Hero gamesWon
     * @param gamesWon 
     */
    public void setGamesWon(double gamesWon) {
        this.gamesWon = gamesWon;
    }

    /**
     * get Hero timePlayed
     * @return timePlayed
     */
    public double getTimePlayed() {
        return timePlayed;
    }

    /**
     * set Hero timePlayed
     * @param timePlayed 
     */
    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
    }
    
    /**
     * set Hero weaponAccuracy
     * @param weaponAccuracy 
     */
    public void setWeaponAccuracy(double weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
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

    /**
     * get Hero soloKills
     * @return soloKills
     */
    public double getSoloKills() {
        return soloKills;
    }

    /**
     * get Hero soloKillsAverage
     * @return soloKillsAverage
     */
    public double getSoloKillsAverage() {
        return soloKillsAverage;
    }

    /**
     * get Hero eliminations
     * @return eliminations
     */
    public double getEliminations() {
        return eliminations;
    }

    /**
     * get Hero eliminationsAverage
     * @return eliminationsAverage
     */
    public double getEliminationsAverage() {
        return eliminationsAverage;
    }

    /**
     * get Hero deaths
     * @return deaths
     */
    public double getDeaths() {
        return deaths;
    }

    /**
     * get Hero deathsAverage
     * @return deathsAverage
     */
    public double getDeathsAverage() {
        return deathsAverage;
    }

    /**
     * get Hero gamesWon
     * @return gamesWon
     */
    public double getGamesWon() {
        return gamesWon;
    }

}
