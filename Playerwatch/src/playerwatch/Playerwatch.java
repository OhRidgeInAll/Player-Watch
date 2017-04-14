package playerwatch;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Michael Lyn, Garrett Holland
 */
public class Playerwatch extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch the JavaFX application
        launch(args);
    }

    TextField txtBattleTag;
    Label loginError;
    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;

        //  generalScene.getStylesheets().addAll(this.getClass()
        //        .getResource("PlayerwatchCSS.css").toExternalForm());
        Scene scene = loginScene();

        //set the Scene, Tite, and Icon of the primary stage, do not allow resize
        primaryStage.setScene(scene);
        primaryStage.setTitle("Playerwatch");
        primaryStage.getIcons().add(new Image("playerwatch/overwatchLogo.png"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    private Scene loginScene() {

        //pane for login screen
        BorderPane loginPane = new BorderPane();
        loginPane.setId("loginPane");

        setLoginCenter(loginPane);
        setLoginBottom(loginPane);

        //scene of the login pane
        Scene loginScene = new Scene(loginPane, 380, 380);
        loginScene.getStylesheets().addAll(this.getClass()
                .getResource("PlayerwatchCSS.css").toExternalForm());

        //focus on the pane to remove focus from txtBattleTag
        loginPane.requestFocus();

        return loginScene;
    }

    private Scene generalScene() {

        //pane for General Stats screen
        BorderPane generalPane = new BorderPane();
        generalPane.setId("generalPane");

        setGeneralCenter(generalPane);
        setGeneralBottom(generalPane);

        Scene generalScene = new Scene(generalPane, 400, 400);

        return generalScene;
    }

    private Scene heroStatsScene() {
        //pane for Most Played Hero's Scene
        BorderPane heroStatsPane = new BorderPane();
        heroStatsPane.setId("mostPlayPane");

        Scene mostPlayScene = new Scene(heroStatsPane, 400, 400);

        return mostPlayScene;
    }

    //center for login pane
    private void setLoginCenter(BorderPane main) {

        GridPane centerPane = new GridPane();
        centerPane.getColumnConstraints().add(new ColumnConstraints(100));
        centerPane.getRowConstraints().add(new RowConstraints(170));

        //create Textfield for Battle Tag, set column count
        txtBattleTag = new TextField();
        txtBattleTag.setPrefColumnCount(17);
        txtBattleTag.setPromptText("Enter a Battle.net ID");
        txtBattleTag.setId("BattleTag");
        txtBattleTag.setMaxWidth(200);

        GridPane.setConstraints(txtBattleTag, 2, 2);

        Button btnGeneralScene = new Button("Login");
        btnGeneralScene.setOnAction((ActionEvent e) -> {
            primaryStage.setScene(generalScene());
        });
        GridPane.setConstraints(btnGeneralScene, 4, 2);

        centerPane.getChildren().addAll(txtBattleTag, btnGeneralScene);

        //add BattleTag textfield to center pane
        main.setCenter(centerPane);

    }

    //bottom for login pane
    private void setLoginBottom(BorderPane main) {
        //label for invalid Battle.net ID input from user
        loginError = new Label("Entered an invalid Battle.net ID");
        loginError.setId("loginError");
        BorderPane.setAlignment(loginError, Pos.CENTER);

        main.setBottom(loginError);
    }

    private void setGeneralCenter(BorderPane main) {

        //HBox to contain center elements
        StackPane stackLabelPane = new StackPane();

        //VBox to contain name, hero stats labels
        VBox vBox = new VBox(10);

        //Hboxes to contain labels with stats
        HBox playerName = new HBox(10);
        HBox mostPlayHbox = new HBox(10);
        HBox winPercentHbox = new HBox(10);
        HBox achieveHbox = new HBox(10);
        HBox soloKillsHbox = new HBox(10);
        HBox elimHbox = new HBox(10);
        HBox healingHbox = new HBox(10);

        String Icon = "https://blzgdapipro-a.akamaihd.net/game/unlocks/0x0250000000000BAD.png";
        //create image from url given by JSON
        ImageView playerIcon = new ImageView(Icon);
        playerIcon.setFitWidth(50);
        playerIcon.setFitHeight(50);

        //labels of names of stats
        Label battleNetName = new Label("Name Variable");
        Label mostPlay = new Label("Most Played Hero: ");
        Label winPercent = new Label("Win Percentage");
        Label achievements = new Label("Achievements");
        Label eliminations = new Label("Total Eliminations: ");
        Label soloKills = new Label("Total Solo Kills: ");
        Label healingDone = new Label("Healing Done: ");

        //labels for variables of stats
        Label mostPlayV = new Label("mostPlayV");
        Label winPercentV = new Label("winPercentV");
        Label achievementsV = new Label("achievmentsV");
        Label eliminationsV = new Label("eliminationsV");
        Label soloKillsV = new Label("soloKillsV");
        Label healingDoneV = new Label("healingDoneV");

        //add labels to corresponding Hbox
        playerName.getChildren().addAll(battleNetName, playerIcon);
        mostPlayHbox.getChildren().addAll(mostPlay, mostPlayV);
        winPercentHbox.getChildren().addAll(winPercent, winPercentV);
        achieveHbox.getChildren().addAll(achievements, achievementsV);
        soloKillsHbox.getChildren().addAll(soloKills, soloKillsV);
        elimHbox.getChildren().addAll(eliminations, eliminationsV);
        healingHbox.getChildren().addAll(healingDone, healingDoneV);

        //add Hboxes to main Vbox
        vBox.getChildren().addAll(playerName, mostPlayHbox, winPercentHbox,
                achieveHbox, soloKillsHbox, elimHbox, healingHbox);

        //set margins for vBox withing StackPane
        StackPane.setMargin(vBox, new Insets(50));

        //add vBox to stackLabelPane
        stackLabelPane.getChildren().add(vBox);

        //set the center of main BorderPane to stackLabelPane
        main.setCenter(stackLabelPane);

    }

    private void setGeneralBottom(BorderPane main) {
        //HBox for bottom of generalPane
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        //button to go to the stats scene
        Button btnStats = new Button("Hero Stats");
        btnStats.setOnAction((ActionEvent e) -> {
            primaryStage.setScene(heroStatsScene());
        });

        //button to go to tips and tricks scene
        Button btnTips = new Button("Tips and Tricks");

        //add buttons to hBox
        hBox.getChildren().addAll(btnStats, btnTips);

        //set bottom of BorderPane to hBox
        main.setBottom(hBox);
    }

    private void setHeroStatsCenter(BorderPane main) {

        //Hbox for center of Hero Stats pane
        HBox hBox = new HBox(20);

        //Vbox to store label and listview to choose hero
        VBox heroBox = new VBox(10);

        //Vbox to store label and scrollpane of chosen hero stats
        VBox statBox = new VBox(10);

        //Listview to display sorted list of heros, based upon most played
        ListView heroList = new ListView();

        //Scroll pane to go through hero stats of hero chosen
        ScrollPane scrollStats = new ScrollPane();
    }

}
