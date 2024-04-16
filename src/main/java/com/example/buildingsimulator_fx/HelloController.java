package com.example.buildingsimulator_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Box;

public class HelloController {

    @FXML
    private GridPane gridPane; // Declare gridPane and annotate with @FXML

    private int currentRow = 0; // Track the current row of the cube

    @FXML
    public void initialize() {
        // Initialize any necessary setup here
    }

    @FXML
    public void StartSimulation() {
        // Implement logic to start the simulation when the button is clicked

    }

    @FXML
    public void moveCubeUp() {
        if (currentRow > 0) {
            gridPane.getChildren().removeIf(node -> GridPane.getRowIndex(node) == currentRow && GridPane.getColumnIndex(node) == 2);
            currentRow--;
            gridPane.add(new Box(100, 40, 100), 2, currentRow);
        }
    }

    @FXML
    public void moveCubeDown() {
        if (currentRow < gridPane.getRowConstraints().size() - 1) {
            gridPane.getChildren().removeIf(node -> GridPane.getRowIndex(node) == currentRow && GridPane.getColumnIndex(node) == 2);
            currentRow++;
            gridPane.add(new Box(100, 40, 100), 2, currentRow);


        }
    }
}