
package playerwatch;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author micha
 */
public class Hero {
    String name;
    ImageView heroImage;
    int meleeFinalBlows;
    int soloKills;
    int objectiveKills;
    int finalBlows;
    int damageDone;
    int eliminations;
    int multikills;
    int healingDone;
    int teleportedPadsDestroyed;
    int eliminationsMostGame;
    int damageDoneMostGame;
    int finalBlowsMostGame;
    int healingDoneMostGame;
    int defensiveAssistsMostGame;
    int objectiveTimeMostGame;
    int objectiveKillsMostGame;
    int multikillBest;
    int soloKillsMostGame;
    int timeSpentonFireMostGame;
    int meleeFinalBlowsAverage;
    int timeSpentonFireAverage;
    int soloKillsAverage;
    int objectiveTimeAverage;
    int objectiveKillsAverage;
    int healingDoneAverage;
    int finalBlowsAverage;
    int deathsAverage;
    int damageDoneAverage;
    int eliminationsAverage;
    int deaths;
    int environmentalDeaths;
    int cards;
    int medals;
    int medalsGold;
    int medalsSilver;
    int medalsBronze;
    int gamesPlayed;
    int gamesWon;
    int timeSpentonFire;
    int objectiveTime;
    int timePlayed;
    int meleeFinalBlowMostGame;
    int gamesTied;
    int gamesLost;
    int offensiveAssists;
    int defensiveAssists;
    int shotsFired;
    int weaponAccuracy;
    int weaponAccuarcyBestGame;
    int winPercentage;
    int turretsDestroyed;
    int killStreakBest;
    int criticalHits;
    int criticalHitsPerMinute;
    int criticalHitAccuracy;

    public Hero() {
        this.name = "HERO";
        String Icon = "https://blzgdapipro-a.akamaihd.net/game/unlocks/0x0250000000000BAD.png";
        //create image from url given by JSON
        ImageView playerIcon = new ImageView(Icon);
        this.heroImage = playerIcon;
        this.meleeFinalBlows = Integer.parseInt("1");
        this.soloKills = Integer.parseInt("2");
        this.objectiveKills = Integer.parseInt("3");
        this.finalBlows = Integer.parseInt("4");
        this.damageDone = Integer.parseInt("5");
        this.eliminations = Integer.parseInt("6");
        this.multikills = Integer.parseInt("7");
        this.healingDone = Integer.parseInt("8");
        this.teleportedPadsDestroyed = Integer.parseInt("9");
        this.eliminationsMostGame = Integer.parseInt("10");
        this.damageDoneMostGame = Integer.parseInt("11");
        this.finalBlowsMostGame = Integer.parseInt("12");
        this.healingDoneMostGame = Integer.parseInt("13");
        this.defensiveAssistsMostGame = Integer.parseInt("14");
        this.objectiveTimeMostGame = Integer.parseInt("15");
        this.objectiveKillsMostGame = Integer.parseInt("16");
        this.multikillBest = Integer.parseInt("17");
        this.soloKillsMostGame = Integer.parseInt("18");
        this.timeSpentonFireMostGame = Integer.parseInt("19");
        this.meleeFinalBlowsAverage = Integer.parseInt("20");
        this.timeSpentonFireAverage = Integer.parseInt("21");
        this.soloKillsAverage = Integer.parseInt("22");
        this.objectiveTimeAverage = Integer.parseInt("23");
        this.objectiveKillsAverage = Integer.parseInt("24");
        this.healingDoneAverage = Integer.parseInt("25");
        this.finalBlowsAverage = Integer.parseInt("26");
        this.deathsAverage = Integer.parseInt("27");
        this.damageDoneAverage = Integer.parseInt("28");
        this.eliminationsAverage = Integer.parseInt("29");
        this.deaths = Integer.parseInt("30");
        this.environmentalDeaths = Integer.parseInt("31");
        this.cards = Integer.parseInt("32");
        this.medals = Integer.parseInt("33");
        this.medalsGold = Integer.parseInt("34");
        this.medalsSilver = Integer.parseInt("35");
        this.medalsBronze = Integer.parseInt("36");
        this.gamesPlayed = Integer.parseInt("37");
        this.gamesWon = Integer.parseInt("38");
        this.timeSpentonFire = Integer.parseInt("39");
        this.objectiveTime = Integer.parseInt("40");
        this.timePlayed = Integer.parseInt("41");
        this.meleeFinalBlowMostGame = Integer.parseInt("42");
        this.gamesTied = Integer.parseInt("43");
        this.gamesLost = Integer.parseInt("44");
        this.offensiveAssists = Integer.parseInt("45");
        this.defensiveAssists = Integer.parseInt("46");
        this.shotsFired = Integer.parseInt("47");
        this.weaponAccuracy = Integer.parseInt("48");
        this.weaponAccuarcyBestGame = Integer.parseInt("49");
        this.winPercentage = Integer.parseInt("50");
        this.turretsDestroyed = Integer.parseInt("51");
        this.killStreakBest = Integer.parseInt("52");
        this.criticalHits = Integer.parseInt("53");
        this.criticalHitsPerMinute = Integer.parseInt("54");
        this.criticalHitAccuracy = Integer.parseInt("55");
    }

    public int getMeleeFinalBlows() {
        return meleeFinalBlows;
    }

    public void setMeleeFinalBlows(int meleeFinalBlows) {
        this.meleeFinalBlows = meleeFinalBlows;
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

    public int getFinalBlows() {
        return finalBlows;
    }

    public void setFinalBlows(int finalBlows) {
        this.finalBlows = finalBlows;
    }

    public int getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(int damageDone) {
        this.damageDone = damageDone;
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

    public int getTeleportedPadsDestroyed() {
        return teleportedPadsDestroyed;
    }

    public void setTeleportedPadsDestroyed(int teleportedPadsDestroyed) {
        this.teleportedPadsDestroyed = teleportedPadsDestroyed;
    }

    public int getEliminationsMostGame() {
        return eliminationsMostGame;
    }

    public void setEliminationsMostGame(int eliminationsMostGame) {
        this.eliminationsMostGame = eliminationsMostGame;
    }

    public int getDamageDoneMostGame() {
        return damageDoneMostGame;
    }

    public void setDamageDoneMostGame(int damageDoneMostGame) {
        this.damageDoneMostGame = damageDoneMostGame;
    }

    public int getFinalBlowsMostGame() {
        return finalBlowsMostGame;
    }

    public void setFinalBlowsMostGame(int finalBlowsMostGame) {
        this.finalBlowsMostGame = finalBlowsMostGame;
    }

    public int getHealingDoneMostGame() {
        return healingDoneMostGame;
    }

    public void setHealingDoneMostGame(int healingDoneMostGame) {
        this.healingDoneMostGame = healingDoneMostGame;
    }

    public int getDefensiveAssistsMostGame() {
        return defensiveAssistsMostGame;
    }

    public void setDefensiveAssistsMostGame(int defensiveAssistsMostGame) {
        this.defensiveAssistsMostGame = defensiveAssistsMostGame;
    }

    public int getObjectiveTimeMostGame() {
        return objectiveTimeMostGame;
    }

    public void setObjectiveTimeMostGame(int objectiveTimeMostGame) {
        this.objectiveTimeMostGame = objectiveTimeMostGame;
    }

    public int getObjectiveKillsMostGame() {
        return objectiveKillsMostGame;
    }

    public void setObjectiveKillsMostGame(int objectiveKillsMostGame) {
        this.objectiveKillsMostGame = objectiveKillsMostGame;
    }

    public int getMultikillBest() {
        return multikillBest;
    }

    public void setMultikillBest(int multikillBest) {
        this.multikillBest = multikillBest;
    }

    public int getSoloKillsMostGame() {
        return soloKillsMostGame;
    }

    public void setSoloKillsMostGame(int soloKillsMostGame) {
        this.soloKillsMostGame = soloKillsMostGame;
    }

    public int getTimeSpentonFireMostGame() {
        return timeSpentonFireMostGame;
    }

    public void setTimeSpentonFireMostGame(int timeSpentonFireMostGame) {
        this.timeSpentonFireMostGame = timeSpentonFireMostGame;
    }

    public int getMeleeFinalBlowsAverage() {
        return meleeFinalBlowsAverage;
    }

    public void setMeleeFinalBlowsAverage(int meleeFinalBlowsAverage) {
        this.meleeFinalBlowsAverage = meleeFinalBlowsAverage;
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

    public int getObjectiveTimeAverage() {
        return objectiveTimeAverage;
    }

    public void setObjectiveTimeAverage(int objectiveTimeAverage) {
        this.objectiveTimeAverage = objectiveTimeAverage;
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

    public int getFinalBlowsAverage() {
        return finalBlowsAverage;
    }

    public void setFinalBlowsAverage(int finalBlowsAverage) {
        this.finalBlowsAverage = finalBlowsAverage;
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

    public int getCards() {
        return cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public int getMedalsGold() {
        return medalsGold;
    }

    public void setMedalsGold(int medalsGold) {
        this.medalsGold = medalsGold;
    }

    public int getMedalsSilver() {
        return medalsSilver;
    }

    public void setMedalsSilver(int medalsSilver) {
        this.medalsSilver = medalsSilver;
    }

    public int getMedalsBronze() {
        return medalsBronze;
    }

    public void setMedalsBronze(int medalsBronze) {
        this.medalsBronze = medalsBronze;
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

    public int getObjectiveTime() {
        return objectiveTime;
    }

    public void setObjectiveTime(int objectiveTime) {
        this.objectiveTime = objectiveTime;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public int getMeleeFinalBlowMostGame() {
        return meleeFinalBlowMostGame;
    }

    public void setMeleeFinalBlowMostGame(int meleeFinalBlowMostGame) {
        this.meleeFinalBlowMostGame = meleeFinalBlowMostGame;
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

    public int getOffensiveAssists() {
        return offensiveAssists;
    }

    public void setOffensiveAssists(int offensiveAssists) {
        this.offensiveAssists = offensiveAssists;
    }

    public int getDefensiveAssists() {
        return defensiveAssists;
    }

    public void setDefensiveAssists(int defensiveAssists) {
        this.defensiveAssists = defensiveAssists;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public void setShotsFired(int shotsFired) {
        this.shotsFired = shotsFired;
    }

    public int getWeaponAccuracy() {
        return weaponAccuracy;
    }

    public void setWeaponAccuracy(int weaponAccuracy) {
        this.weaponAccuracy = weaponAccuracy;
    }

    public int getWeaponAccuarcyBestGame() {
        return weaponAccuarcyBestGame;
    }

    public void setWeaponAccuarcyBestGame(int weaponAccuarcyBestGame) {
        this.weaponAccuarcyBestGame = weaponAccuarcyBestGame;
    }

    public int getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(int winPercentage) {
        this.winPercentage = winPercentage;
    }

    public int getTurretsDestroyed() {
        return turretsDestroyed;
    }

    public void setTurretsDestroyed(int turretsDestroyed) {
        this.turretsDestroyed = turretsDestroyed;
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

    public int getCriticalHitsPerMinute() {
        return criticalHitsPerMinute;
    }

    public void setCriticalHitsPerMinute(int criticalHitsPerMinute) {
        this.criticalHitsPerMinute = criticalHitsPerMinute;
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
