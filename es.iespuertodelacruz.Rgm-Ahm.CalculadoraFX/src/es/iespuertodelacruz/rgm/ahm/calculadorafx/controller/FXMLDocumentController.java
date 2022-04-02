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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new CalculadoraPF();
    }  
    
}
