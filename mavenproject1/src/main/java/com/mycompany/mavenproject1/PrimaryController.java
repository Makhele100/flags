package com.mycompany.mavenproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController
{
    @FXML
    private Rectangle rec1;
    @FXML
    private Rectangle rec2;
    @FXML
    private Rectangle rec3;
    @FXML
    private Button Les;
    @FXML
    private Button clear;
    @FXML
    private Button Germ;
    @FXML
    private Button Yem;
    @FXML
    private Button Rus;
    @FXML
    private Button Gha;

    @FXML
    private void clear(ActionEvent event) 
    {
        rec1.setFill(Color.WHITE);
        rec2.setFill(Color.WHITE);
        rec3.setFill(Color.WHITE);
    }
    
    @FXML
    private void Lesotho(ActionEvent event)
    {
        rec1.setFill(Color.BLUE);
        rec2.setFill(Color.WHITE);
        rec3.setFill(Color.GREEN);
    }

    @FXML
    private void Germeny(ActionEvent event) 
    {
        rec1.setFill(Color.BLACK);
        rec2.setFill(Color.RED);
        rec3.setFill(Color.YELLOW);
    }

    @FXML
    private void Yemeny(ActionEvent event) 
    {
        rec1.setFill(Color.RED);
        rec2.setFill(Color.WHITE);
        rec3.setFill(Color.BLACK);
    }

    @FXML
    private void Russia(ActionEvent event) 
    {
        rec1.setFill(Color.WHITE);
        rec2.setFill(Color.BLUE);
        rec3.setFill(Color.RED);
    }

    @FXML
    private void Ghana(ActionEvent event)
    {
        rec1.setFill(Color.RED);
        rec2.setFill(Color.YELLOW);
        rec3.setFill(Color.GREEN);
    }

}