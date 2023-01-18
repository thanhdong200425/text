package com.example.project01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    public void btnTuyChinh(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("TuyChinh.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Tùy chỉnh");
    }

    @FXML
    public void btnBangXepHang(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("BangXepHang.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Bảng xếp hạng ");
    }

    @FXML
    public void btnThongKe(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ThongKe.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Thống kê");
    }

    @FXML
    public void btnLichThiDau(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("LichThiDau.fxml"));
        Scene scene = new Scene(parent);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Lịch thi đấu");
    }
}