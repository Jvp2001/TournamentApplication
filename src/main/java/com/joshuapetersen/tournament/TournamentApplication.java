package com.joshuapetersen.tournament;

import com.joshuapetersen.tournament.data.Player;
import com.joshuapetersen.tournament.data.TournamentData;
import com.joshuapetersen.tournament.util.FxmlUtils;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class TournamentApplication extends Application
{


    @Override
    public void start(Stage primaryStage) throws IOException, URISyntaxException
    {
        Pane root = new Pane();

        TournamentData.tournamentsData.putIfAbsent("Backgammon",FXCollections.<Player>observableArrayList(new Player("Joshua",0)));
        URL resource = getClass().getResource("fxml/TournamentApplication.fxml");
        Scene scene = new Scene(new Pane());
        Parent staffLoginDialogRoot = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/TournamentApplication.fxml"));
        scene.setRoot(staffLoginDialogRoot);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
