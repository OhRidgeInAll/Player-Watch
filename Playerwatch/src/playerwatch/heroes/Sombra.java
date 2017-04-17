package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 * Class to create Sombra hero
 *
 * @author Michael Lyn
 */
public class Sombra extends Hero {

    //variables unqiue to Sombra
    double enemiesEmp;
    double enemiesEmpAverage;
    double enemiesEmpMostGame;
    double enemiesHacked;
    double enemiesHackedAverage;
    double enemiesHackedMostGame;
    //labels to display variables of Sombra
    Label lblEnemiesEmp;
    Label lblEnemiesEmpAverage;
    Label lblEnemiesEmpMostGame;
    Label lblEnemiesHacked;
    Label lblEnemiesHackedAverage;
    Label lblEnemiesHackedMostGame;
    ArrayList<Label> sombraLabels;

    /**
     * Sombra constructor, pass name to hero class
     */
    public Sombra() {

        //hero's name
        super.name = "Sombra";

    }

    /**
     * Method to generate labels for Sombra unique stats
     */
    public void labels() {
        //array list of labels for variables of Sombra
        sombraLabels = new ArrayList<>();
        sombraLabels.add(lblEnemiesEmp = new Label("Ememies EMP: " + enemiesEmp));
        sombraLabels.add(lblEnemiesEmpAverage = new Label("Enemies EMP Average: " + enemiesEmpAverage));
        sombraLabels.add(lblEnemiesEmpMostGame = new Label("Enemies EMP Most Game: " + enemiesEmpMostGame));
        sombraLabels.add(lblEnemiesHacked = new Label("Enemies Hacked: " + enemiesHacked));
        sombraLabels.add(lblEnemiesHackedAverage = new Label("Enemies Hacked Average: " + enemiesHackedAverage));
        sombraLabels.add(lblEnemiesHackedMostGame = new Label("Enemies Hacked Most Game: " + enemiesHackedMostGame));
        super.uniqueLabels = sombraLabels;
    }

    /**
     * set Sombra enemiesEmp
     *
     * @param enemiesEmp
     */
    public void setEnemiesEmp(double enemiesEmp) {
        this.enemiesEmp = enemiesEmp;
    }

    /**
     * set Sombra enemiesEmpAverage
     *
     * @param enemiesEmpAverage
     */
    public void setEnemiesEmpAverage(double enemiesEmpAverage) {
        this.enemiesEmpAverage = enemiesEmpAverage;
    }

    /**
     * set Sombra enemiesEmpMostGame
     *
     * @param enemiesEmpMostGame
     */
    public void setEnemiesEmpMostGame(double enemiesEmpMostGame) {
        this.enemiesEmpMostGame = enemiesEmpMostGame;
    }

    /**
     * set Sombra enemiesHacked
     *
     * @param enemiesHacked
     */
    public void setEnemiesHacked(double enemiesHacked) {
        this.enemiesHacked = enemiesHacked;
    }

    /**
     * set Sombra enemiesHackedAverage
     *
     * @param enemiesHackedAverage
     */
    public void setEnemiesHackedAverage(double enemiesHackedAverage) {
        this.enemiesHackedAverage = enemiesHackedAverage;
    }

    /**
     * set Sombra enemiesHackedMostGame
     *
     * @param enemiesHackedMostGame
     */
    public void setEnemiesHackedMostGame(double enemiesHackedMostGame) {
        this.enemiesHackedMostGame = enemiesHackedMostGame;
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
