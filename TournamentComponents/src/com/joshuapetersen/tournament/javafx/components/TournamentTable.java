package com.joshuapetersen.tournament.javafx.components;
import com.joshuapetersen.tournament.data.Player;
import com.joshuapetersen.tournament.data.TournamentData;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TournamentTable extends TableView<Player>
{
    
    private StringProperty tournamentName = new SimpleStringProperty();


    
    TableColumn<Player,Integer> rankColumn = new TableColumn<>("Rank");

    
    TableColumn<Player,char[]> nameColumn = new TableColumn<>("Name");


    TableColumn<Player,Integer> gamesWonColumn = new TableColumn<>("Games Won");


    TableColumn<Player,Integer> totalGamesColumn = new TableColumn<>("Games Played");


    public TournamentTable()
    {
        setup();
    }


    public void setup()
    {

        //setup table
        TableView<Player> resultsTable = this;
        
        resultsTable.setEditable(true);
        resultsTable.getColumns().setAll(rankColumn,nameColumn,gamesWonColumn,totalGamesColumn);
        //setup columns
        setupColumn(rankColumn,"rank",false);
        setupColumn(nameColumn,"name",false);
        setupColumn(gamesWonColumn,"gamesWon",true);
        setupColumn(totalGamesColumn,"totalGames",false);
    }


    private <T> void setupColumn(TableColumn<Player,T> tableColumn, String propertyName, boolean editable)
    {
        tableColumn.setEditable(editable);
        tableColumn.setCellValueFactory(new PropertyValueFactory<Player,T>(propertyName));

    }

    public String getTournamentName()
    {
        return tournamentName.get();
    }

    public void setTournamentName(String tournamentName)
    {
        this.tournamentName.set(tournamentName);
    }
    public StringProperty getTournamentNameProperty()
    {
        return this.tournamentName;
    }

}
