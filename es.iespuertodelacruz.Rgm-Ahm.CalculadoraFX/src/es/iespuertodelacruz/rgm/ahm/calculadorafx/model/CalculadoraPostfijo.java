/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

/**
 * Main de pruebas de codigo
 * @author alumno
 */
public class CalculadoraPostfijo {

    public static void main(String[] args) {

        CalculadoraPF<MiDouble> calculadoramd = new CalculadoraPF<>();
        
        
        String cadena = "2 3 5 + *";
        
        calculadoramd.addOperacion(cadena); /*Boton oper*/
        
        System.out.println(calculadoramd.getResultado()); /*boton igual*/  
        
        cadena = "5 1 +";
        
        calculadoramd.addOperacion(cadena);
        
        System.out.println(calculadoramd.getResultado());

    }
}
