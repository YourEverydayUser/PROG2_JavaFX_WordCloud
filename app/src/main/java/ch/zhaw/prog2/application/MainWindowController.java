package ch.zhaw.prog2.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Scanner;

    public class MainWindowController {

        Scanner myScanner = new Scanner(System.in);

        @FXML
        private Label lableTitel;

        @FXML
        private TextField textEingabe;

        @FXML
        private TextArea textHistory;

        @FXML
        void hinzufuegenText(ActionEvent event) {
            textHistory.setText(textHistory.getText() + textEingabe.getText() + System.lineSeparator());

        }

        @FXML
        void leerenTextEingabe(ActionEvent event) {
            textEingabe.clear();
        }

        public void connectProperties() {

            lableTitel.textProperty().bind(textEingabe.textProperty());
        }

        //public void initialize() {
        //    connectProperties();
        //}

    }
