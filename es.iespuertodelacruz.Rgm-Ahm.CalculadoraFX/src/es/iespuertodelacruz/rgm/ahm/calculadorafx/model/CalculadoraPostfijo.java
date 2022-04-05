/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

/**
 * Main de pruebas de codigo
 * @author Alberto Hernández Medina
 */
public class CalculadoraPostfijo {

    public static void main(String[] args) {

        CalculadoraPF<MiDouble> calculadoramd = new CalculadoraPF<>();
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
        
        String cadena = "2 3 5 + *";
        
        calculadoramd.addOperacion(cadena); /*Boton oper*/
        
        System.out.println(calculadoramd.getResultado()); /*boton igual*/  
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
        
        cadena = "5 1 +";
        
        calculadoramd.addOperacion(cadena);
        
        System.out.println(calculadoramd.getResultado());
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
        
        cadena = "3 4 *";
        
        calculadoramd.addOperacion(cadena);
        
        System.out.println(calculadoramd.getResultado());
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
        
        calculadoramd.limpiarMemoria2();
        System.out.println("Se borra la M2");
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
        
        cadena = "0 4 /";
        
        calculadoramd.addOperacion(cadena);
        
        System.out.println(calculadoramd.getResultado());
        
        System.out.println("M1: " + calculadoramd.M1);
        System.out.println("M2: " + calculadoramd.M2);
    }
}
