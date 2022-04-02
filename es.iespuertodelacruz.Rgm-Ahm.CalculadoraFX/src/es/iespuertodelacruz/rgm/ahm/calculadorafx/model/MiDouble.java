/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

/**
 *
 * @author Raúl González Martín / Alberto Hernández Medina
 */
public class MiDouble implements OperablePF<MiDouble>{
    
    double num;
    
    /**
     * Constructor por defecto
     */
    public MiDouble(){}

    
    /**
     * Constructo con un parametro de la clase
     * @param num 
     */
    public MiDouble(double num) {
        this.num = num;
    }
    
    
}
