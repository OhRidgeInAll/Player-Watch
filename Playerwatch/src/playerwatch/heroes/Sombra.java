package playerwatch.heroes;

import java.util.ArrayList;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Lyn
 */
public class Sombra extends Hero {

    //variables unqiue to Sombra
    String enemiesEmp;
    String enemiesEmpAverage;
    String enemiesEmpMostGame;
    String enemiesHacked;
    String enemiesHackedAverage;
    String enemiesHackedMostGame;
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
        //set variables unqiue to Sombra
        this.enemiesEmp = "hack";
        this.enemiesEmpAverage = "hack";
        this.enemiesEmpMostGame = "hack";
        this.enemiesHacked = "hack";
        this.enemiesHackedAverage = "hack";
        this.enemiesHackedMostGame = "hack";

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

    @Override
    public String toString() {
        return name;
    }
}
