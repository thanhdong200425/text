package com.example.project01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ThongKeController {
    @FXML
    public void btnBack(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Main_Program.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Main Program");
        stage.setScene(scene);
        stage.show();
    }
}
