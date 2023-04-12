package controller;
import classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controllerHome {

    @FXML
    private Button botaoProduto;

    @FXML
    void telaProduto(ActionEvent event) {
        App.changeScreen("produto");
    }
}
