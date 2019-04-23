package com.joshuapetersen.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TournamentApplicationController
{
    @FXML
    private TabPane tabPane;

    @FXML
    private AnchorPane tournamentTemplateAnchorPane;


    @FXML
    private MenuItem registerPlayersMenuItem;


    @FXML
    public void initialize()
    {
        registerPlayersMenuItem.setOnAction(this::onRegisterPlayersClicked);

    }


    @FXML
    void onRegisterPlayersClicked(ActionEvent event)
    {
        System.out.println("Adding Player...");
    }


}