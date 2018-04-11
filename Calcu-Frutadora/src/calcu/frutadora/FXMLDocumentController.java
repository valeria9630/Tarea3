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
import javafx.scene.control.TextField;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ComboBox cbListaFrutas;

    @FXML
    private Label resultadoSuma;

    @FXML
    private Label frutaFija;
    @FXML
    private TextField nuevaFruta;

    Frutas fruta;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        fruta = new Frutas();
        frutaFija.setText("PERA");

        for (int i = 0; i < fruta.getColumna().size(); i++) {
            cbListaFrutas.getItems().add(fruta.getColumna().get(i));
        }

    }

    @FXML
    public void sumarAlimentos(ActionEvent event) {

        String alimentoSeleccionado = (String) cbListaFrutas.getSelectionModel().getSelectedItem();

        String frutaFija1 = frutaFija.getText();

        System.out.println(alimentoSeleccionado);

        String resultado = (fruta.suma(fruta.posicionAlimento(frutaFija1), fruta.posicionAlimento(alimentoSeleccionado)));

        resultadoSuma.setText(resultado.toUpperCase());

        frutaFija.setText(resultado.toUpperCase());

    }

    @FXML
    public void agregar(ActionEvent event) {
        String nuevaFruta1 = nuevaFruta.getText();
        fruta.agregarAlimento(nuevaFruta1);
        frutaFija.setText(nuevaFruta1);

        cbListaFrutas.getItems().add(nuevaFruta1.toUpperCase());

    }

}
