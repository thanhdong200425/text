package com.example.project01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BangXepHangController implements Initializable {
    @FXML
    private TableView<BangXepHang> tableView;

    @FXML
    private TableColumn<BangXepHang, Integer> thuTu;

    @FXML
    private TableColumn<BangXepHang, String> ten;

    @FXML
    private TableColumn<BangXepHang, Integer> soTran;

    @FXML
    private TableColumn<BangXepHang, Integer> thang;

    @FXML
    private TableColumn<BangXepHang, Integer> hoa;

    @FXML
    private TableColumn<BangXepHang, Integer> thua;

    @FXML
    private TableColumn<BangXepHang, Integer> diem;

    @FXML
    private TableColumn<BangXepHang, Integer> hlv;

    public ObservableList<BangXepHang> listBXH;



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
        listBXH = FXCollections.observableArrayList();
        thuTu.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("Thu tu"));
        ten.setCellValueFactory(new PropertyValueFactory<BangXepHang, String>("Ten"));
        soTran.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("So Tran"));
        thang.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("Thang"));
        thua.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("Thua"));
        hoa.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("Hoa"));
        diem.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("Diem"));
        hlv.setCellValueFactory(new PropertyValueFactory<BangXepHang, Integer>("HLV"));
        tableView.setItems(listBXH);
    }

    @FXML
    public void getter(ActionEvent e) throws IOException {
        BangXepHang bangXepHang = new BangXepHang();
        CLB clb = new CLB();
        thuTu.setText();
    }
}
