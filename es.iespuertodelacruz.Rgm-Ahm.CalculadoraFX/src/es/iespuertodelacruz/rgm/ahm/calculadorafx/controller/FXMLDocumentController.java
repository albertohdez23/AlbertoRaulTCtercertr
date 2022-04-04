/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.controller;

import es.iespuertodelacruz.rgm.ahm.calculadorafx.model.MiDouble;
import es.iespuertodelacruz.rgm.ahm.calculadorafx.model.CalculadoraPF;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Raúl González Martín / Alberto Hernández Medina 
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextArea txtResultado;
    public CalculadoraPF calc;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnComa;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnProducto;
    @FXML
    private Button btnHistorial;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnHistorial1;
    @FXML
    private Button btnComa1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new CalculadoraPF();
        CalculadoraPF<MiDouble> calculadoramd = new CalculadoraPF<>();
    }  

    @FXML
    private void operando(ActionEvent event) {     
    }

    @FXML
    private void igual(ActionEvent event) {
    }

    @FXML
    private void operador(ActionEvent event) {
    }

    @FXML
    private void limpiar(ActionEvent event) {
    }
    
}
