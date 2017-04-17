package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
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

    public Sombra() {

        //hero's name
        super.name = "Sombra";

    }
    
    public void labels(){
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

    public void setEnemiesEmp(double enemiesEmp) {
        this.enemiesEmp = enemiesEmp;
    }

    public void setEnemiesEmpAverage(double enemiesEmpAverage) {
        this.enemiesEmpAverage = enemiesEmpAverage;
    }

    public void setEnemiesEmpMostGame(double enemiesEmpMostGame) {
        this.enemiesEmpMostGame = enemiesEmpMostGame;
    }

    public void setEnemiesHacked(double enemiesHacked) {
        this.enemiesHacked = enemiesHacked;
    }

    public void setEnemiesHackedAverage(double enemiesHackedAverage) {
        this.enemiesHackedAverage = enemiesHackedAverage;
    }

    public void setEnemiesHackedMostGame(double enemiesHackedMostGame) {
        this.enemiesHackedMostGame = enemiesHackedMostGame;
    }

    @Override
    public String toString() {
        return name;
    }
}
