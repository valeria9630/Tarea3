/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu.frutadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ComboBox<String> lisComboBox;
    @FXML
    private Label Fruta;
    @FXML
    private Label Resultado;
    @FXML
    private Label ResultadoSuma;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
