package playerwatch;

import java.io.IOException;
import playerwatch.heroes.DVa;
import playerwatch.heroes.Soldier76;
import playerwatch.heroes.Ana;
import playerwatch.heroes.Bastion;
import playerwatch.heroes.Genji;
import playerwatch.heroes.Roadhog;
import playerwatch.heroes.Hero;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import org.json.simple.parser.ParseException;
import playerwatch.heroes.Hanzo;
import playerwatch.heroes.JunkRat;
import playerwatch.heroes.Lucio;
import playerwatch.heroes.McCree;
import playerwatch.heroes.Mei;
import playerwatch.heroes.Mercy;
import playerwatch.heroes.Pharah;
import playerwatch.heroes.Reaper;
import playerwatch.heroes.Reinhardt;
import playerwatch.heroes.Sombra;
import playerwatch.heroes.Symmetra;
import playerwatch.heroes.Torbjorn;
import playerwatch.heroes.Tracer;
import playerwatch.heroes.Widowmaker;
import playerwatch.heroes.Winston;
import playerwatch.heroes.Zarya;
import playerwatch.heroes.Zenyatta;

/**
 *
 * @author Michael Lyn, Garrett Holland
 */
public class Playerwatch extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Login login = new Login();
//        
//        login.login("Original-1425");
        //launch the JavaFX application
        launch(args);
    }

    //TextField for the BattleTag input
    TextField txtBattleTag;
    //Label for an error logging in
    Label loginError;
    //The primary stage of the application
    Stage primaryStage;

    Login battle;

    BorderPane loginPane;

    ArrayList<Hero> allHeroesArray;

    @Override
    public void start(Stage primaryStage) throws Exception {

        //set primary stage of start method
        this.primaryStage = primaryStage;

        //create first scene for login
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
        loginPane = new BorderPane();
        loginPane.setId("loginPane");

        //set the center and bottom of the loginPane
        setLoginCenter(loginPane);

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

        //set the center and bottom of generalPane
        setGeneralCenter(generalPane);
        setGeneralBottom(generalPane);

        //create scene for generalPane
        Scene generalScene = new Scene(generalPane, 400, 400);
        //get the stylesheet for the generalScene
        generalScene.getStylesheets().addAll(this.getClass()
                .getResource("PlayerwatchCSS.css").toExternalForm());

        return generalScene;
    }

    private Scene heroStatsScene() {
        //pane for Most Played Hero's Scene
        BorderPane heroStatsPane = new BorderPane();
        heroStatsPane.setId("heroStatsPane");

        //set the center of the heroStatsPane
        setHeroStatsCenter(heroStatsPane);
        //get the stylesheet for the heroStatsPane
        heroStatsPane.getStylesheets().addAll(this.getClass()
                .getResource("PlayerwatchCSS.css").toExternalForm());

        //create the scene for heroStatsPane
        Scene heroStatsScene = new Scene(heroStatsPane, 600, 500);

        return heroStatsScene;
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

        battle = new Login();

        //constrain txtBattleTag for layout alignment
        GridPane.setConstraints(txtBattleTag, 2, 2);

        //button to login to application
        Button btnGeneralScene = new Button("Login");
        //constrain btnGeneralScene for layout alignment
        GridPane.setConstraints(btnGeneralScene, 4, 2);
        //ActionEvent, change the scene of the primary stage to the generalPane
        btnGeneralScene.setOnAction((ActionEvent e) -> {

            if ("Original-1425".equals(txtBattleTag.getText())) {
                try {
                    battle.login(txtBattleTag.getText());
                } catch (IOException | ParseException ex) {
                    Logger.getLogger(Playerwatch.class.getName()).log(Level.SEVERE, null, ex);
                }

                //Create instances of every hero, set the stats of every hero
                Ana ana = new Ana();
                Bastion bastion = new Bastion();
                DVa dva = new DVa();
                Genji genji = new Genji();
                Hanzo hanzo = new Hanzo();
                JunkRat junkRat = new JunkRat();
                Lucio lucio = new Lucio();
                McCree mcCree = new McCree();
                Mei mei = new Mei();
                Mercy mercy = new Mercy();
                Pharah pharah = new Pharah();
                Reaper reaper = new Reaper();
                Reinhardt reinhardt = new Reinhardt();
                Roadhog roadHog = new Roadhog();
                Soldier76 soldier76 = new Soldier76();
                Sombra sombra = new Sombra();
                Symmetra symmetra = new Symmetra();
                Torbjorn torbjorn = new Torbjorn();
                Tracer tracer = new Tracer();
                Widowmaker widowmaker = new Widowmaker();
                Winston winston = new Winston();
                Zarya zarya = new Zarya();
                Zenyatta zenyatta = new Zenyatta();

                battle.initializeStats(ana, bastion, dva, genji, hanzo, mei, junkRat, lucio, mcCree, mei, mercy, pharah, reaper, reinhardt, roadHog, soldier76, sombra, symmetra, torbjorn, tracer, widowmaker, winston, zarya, zenyatta);
                //set the labels for each instance of every hero, unique and general
                ana.labels();
                ana.generalLabels();
                bastion.labels();
                bastion.generalLabels();
                dva.labels();
                dva.generalLabels();
                genji.labels();
                genji.generalLabels();
                hanzo.labels();
                hanzo.generalLabels();
                junkRat.labels();
                junkRat.generalLabels();
                lucio.labels();
                lucio.generalLabels();
                mcCree.labels();
                mcCree.generalLabels();
                mei.labels();
                mei.generalLabels();
                pharah.labels();
                pharah.generalLabels();
                reaper.labels();
                reaper.generalLabels();
                reinhardt.labels();
                reinhardt.generalLabels();
                roadHog.labels();
                roadHog.generalLabels();
                soldier76.labels();
                soldier76.generalLabels();
                sombra.labels();
                sombra.generalLabels();
                symmetra.labels();
                symmetra.generalLabels();
                torbjorn.labels();
                torbjorn.generalLabels();
                tracer.labels();
                tracer.generalLabels();
                widowmaker.labels();
                widowmaker.generalLabels();
                winston.labels();
                winston.generalLabels();
                zarya.labels();
                zarya.generalLabels();
                zenyatta.labels();
                zenyatta.generalLabels();

                //create arraylist to store all of the heroes, add to arraylist
                allHeroesArray = new ArrayList<>();
                allHeroesArray.add(ana);
                allHeroesArray.add(bastion);
                allHeroesArray.add(dva);
                allHeroesArray.add(genji);
                allHeroesArray.add(hanzo);
                allHeroesArray.add(junkRat);
                allHeroesArray.add(lucio);
                allHeroesArray.add(mcCree);
                allHeroesArray.add(mei);
                allHeroesArray.add(pharah);
                allHeroesArray.add(reaper);
                allHeroesArray.add(reinhardt);
                allHeroesArray.add(roadHog);
                allHeroesArray.add(soldier76);
                allHeroesArray.add(sombra);
                allHeroesArray.add(symmetra);
                allHeroesArray.add(torbjorn);
                allHeroesArray.add(tracer);
                allHeroesArray.add(widowmaker);
                allHeroesArray.add(winston);
                allHeroesArray.add(zarya);
                allHeroesArray.add(zenyatta);

                primaryStage.setScene(generalScene());
            } else {

                setLoginBottom(loginPane);
            }
        });

        //add txtBattleTag and btnGeneralScene to the centerPane
        centerPane.getChildren().addAll(txtBattleTag, btnGeneralScene);

        //set the center of BorderPane main
        main.setCenter(centerPane);

    }

    //bottom for login pane
    private void setLoginBottom(BorderPane main) {
        //label for invalid Battle.net ID input from user
        loginError = new Label("Entered an invalid Battle.net ID");
        loginError.setStyle("-fx-font:20 Arial; -fx-text-fill:RED;");
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
        battleNetName.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label mostPlay = new Label("Most Played Hero: ");
        mostPlay.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label winPercent = new Label("Win Percentage");
        winPercent.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label achievements = new Label("Achievements");
        achievements.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label eliminations = new Label("Total Eliminations: ");
        eliminations.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label soloKills = new Label("Total Solo Kills: ");
        soloKills.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label healingDone = new Label("Healing Done: ");
        healingDone.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");

        //labels for variables of stats
        Label mostPlayV = new Label("mostPlayV");
        mostPlayV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label winPercentV = new Label("winPercentV");
        winPercentV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label achievementsV = new Label("achievmentsV");
        achievementsV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label eliminationsV = new Label("eliminationsV");
        eliminationsV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label soloKillsV = new Label("soloKillsV");
        soloKillsV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");
        Label healingDoneV = new Label("healingDoneV");
        healingDoneV.setStyle("-fx-font:16 Arial; -fx-text-fill:WHITE;");

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

        //add button to hBox
        hBox.getChildren().addAll(btnStats);

        //set bottom of BorderPane to hBox
        main.setBottom(hBox);
    }

    private void setHeroStatsCenter(BorderPane main) {

        //Hbox for center of Hero Stats pane
        HBox hBox = new HBox(20);

        //Vbox to store label and listview to choose hero
        VBox heroBox = new VBox(10);
        heroBox.setPadding(new Insets(10));

        //Vbox to store label and scrollpane of chosen hero stats
        VBox statBox = new VBox(10);
        statBox.setPadding(new Insets(10));

        //Label describing ListView below
        Label chooseHero = new Label("Choose your hero!");
        chooseHero.setStyle("-fx-font:20 Impact; -fx-text-fill:WHITE;");
        //Listview to display sorted list of heros, based upon most played
        ListView<Hero> heroList = new ListView<>();

        //add the array of heroes to the heroList
        heroList.getItems().addAll(allHeroesArray);
        //add chooseHero and heroList to the heroBox
        heroBox.getChildren().addAll(chooseHero, heroList);

        //Label describing the ScrollPane below
        Label statPage = new Label("Hero Stats");
        statPage.setStyle("-fx-font:20 Impact; -fx-text-fill:WHITE;");
        //Scroll pane to go through hero stats of hero chosen
        ScrollPane scrollStats = new ScrollPane();
        //VBox to contain the labels with stat names and variables
        VBox statLabels = new VBox(10);
        statLabels.setPadding(new Insets(5));

        //add a listener to change values of the statLabels based upon heroList value chosen
        heroList.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Hero>() {
            //Label to state end of stats page, also used as variable to clear statLabels on change
            Label endOfStats = new Label("You've reached the end of the Stats page!");

            @Override
            public void changed(ObservableValue<? extends Hero> ov, Hero oldValue, Hero newValue) {
                //if there the endOfStats label, clear the statLabels VBox
                if (statLabels.getChildren().contains(endOfStats)) {
                    statLabels.getChildren().clear();
                }
                //add the ArrayList of labels unique to the hero first
                statLabels.getChildren().addAll(newValue.getUniqueLabels());
                //add the ArrayList of labels that are shared between heroes
                statLabels.getChildren().addAll(newValue.getHeroLabels());
                //add the endOfStats label
                statLabels.getChildren().add(endOfStats);
                //set the content of the scrollStats as the VBox statLabels
                scrollStats.setContent(statLabels);
            }

        }
        );

        Button btnReturn = new Button("Back");
        btnReturn.setOnAction((ActionEvent e) -> {
            primaryStage.setScene(generalScene());
        });

        //add the statPage label and the scrollStats scroll pane to the VBox statBox
        statBox.getChildren().addAll(statPage, scrollStats);

        //add heroBox and statBox to hBox for alignment
        hBox.getChildren().addAll(heroBox, statBox);

        //set the center of BorderPane main to hBox
        main.setCenter(hBox);

    }
}
