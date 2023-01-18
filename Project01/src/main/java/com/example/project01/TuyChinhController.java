package com.example.project01;

import com.example.project01.CLB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class TuyChinhController implements Initializable {


    @FXML
    public TableView<CLB> tableView;
    @FXML
    public TableColumn<CLB, Integer> id;

    @FXML
    public TableColumn<CLB, String> name;

    @FXML
    public TableColumn<CLB, Integer> hlv;

    public ObservableList<CLB> listCLB;

    @FXML
    public TextField idTextField, nameTextField, hlvTextField;

    public TuyChinhController(){

    }



    @FXML
    public void btnBack(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Main_Program.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Main Program");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listCLB = FXCollections.observableArrayList(
                new CLB(1, "Ha Noi FC", 5)
        );
        id.setCellValueFactory(new PropertyValueFactory<CLB, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<CLB, String>("name"));
        hlv.setCellValueFactory(new PropertyValueFactory<CLB, Integer>("hlv"));
        tableView.setItems(listCLB);

    }

    @FXML
    public void add(ActionEvent event) throws IOException {
        CLB clb = new CLB();
        clb.setId(Integer.parseInt(idTextField.getText()));
        clb.setName(nameTextField.getText());
        clb.setHlv(Integer.parseInt(hlvTextField.getText()));
        listCLB.add(clb);
        idTextField.setText("");
        nameTextField.setText("");
        hlvTextField.setText("");
    }


    @FXML
    public void delete(ActionEvent event){
        CLB clb = tableView.getSelectionModel().getSelectedItem();
        listCLB.remove(clb);
    }

    @FXML
    public void sorts(ActionEvent event){
        listCLB.clear();
    }

    @FXML
    public void update(ActionEvent event){
        CLB clb = tableView.getSelectionModel().getSelectedItem();
        idTextField.setText(""+clb.getId());
        nameTextField.setText(clb.getName());
        hlvTextField.setText(""+clb.getHlv());
    }

    @FXML
    public void save(ActionEvent event) throws IOException {
       delete(event);
       add(event);
    }

    @FXML
    public void search(ActionEvent event){
        String result = idTextField.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        for(CLB clb: listCLB){
            if(result.equals(clb.getId())){
                alert.setTitle("Information");
                alert.setHeaderText("YES");
                alert.show();
            } else {
                alert.setTitle("Information");
                alert.setHeaderText("NO");
                alert.show();
            }
        }
    }


}
