package com.joshuapetersen.tournament.template;

import com.joshuapetersen.tournament.data.Player;
import com.joshuapetersen.tournament.javafx.components.TournamentTable;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TournamentTemplate
{



    @FXML
    private BorderPane root;
    @FXML
    private Label tournamentTitle;

    @FXML
    private TournamentTable tournamentTable;
    @FXML
    public void initialize() throws IOException
    {
//       root.setCenter((Node) FXMLLoader.load(TournamentTemplate.class.getClassLoader().getResource(
//               "fxml/tournament/template/TournamentTable.fxml")));
        tournamentTitle.setText("Backgammon");
    }

}
