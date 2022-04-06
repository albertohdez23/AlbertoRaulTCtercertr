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
    
    @FXML 
    private TextArea txtResultado;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnMemoria1;
    @FXML
    private Button btnMemoria2;
    @FXML
    private Button btnSpace;
    @FXML
    private Button btnPunto;
    
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
    private Button btnShift;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new CalculadoraPF<MiDouble>();
    }  

    @FXML
    private void igual(ActionEvent event) {
        calc.addOperacion(txtResultado.getText());
        String resultado = calc.getResultado();
        txtResultado.setText(resultado);
    }

    @FXML
    private void limpiar(ActionEvent event) {
        Button btn = (Button)event.getSource();
        if (calc.limpiar){
            if (btn == btnBorrar){
                txtResultado.setText("");
                calc.limpiar = false;
            }
        }else{
            calc.limpiar = true;
        }
    }

    @FXML
    private void operar(ActionEvent event) {
        Button btn = (Button)event.getSource();
        //calc.cadena += btn.getText();ate void limpiar(ActionEvent event)
        if (calc.limpiar == false){
            if (btn == btnSpace) {
                txtResultado.setText(txtResultado.getText() + " ");
            } else if (btn == btnMemoria1) {
                txtResultado.setText(txtResultado.getText() + calc.imprimirM1());
            } else if (btn == btnMemoria2) {
                txtResultado.setText(txtResultado.getText() + calc.imprimirM2());

            } else {
                txtResultado.setText(txtResultado.getText() + btn.getText());
            }
        }else{
            if (btn == btnMemoria1) {
                calc.limpiar = false;
                calc.limpiarMemoria1();
            }else if (btn == btnMemoria2) {
                calc.limpiar = false;
                calc.limpiarMemoria2();
            }else {
                calc.limpiar = false;
            }
        }
    }
}
