package com.joshuapetersen.tournament.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FxmlUtils
{
    public static void loadFXML(String filename,Pane container)
    {
        try
        {
            Parent root = FXMLLoader.load(new File(filename).toURI().toURL(),null);
            container.getChildren().setAll(root);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
