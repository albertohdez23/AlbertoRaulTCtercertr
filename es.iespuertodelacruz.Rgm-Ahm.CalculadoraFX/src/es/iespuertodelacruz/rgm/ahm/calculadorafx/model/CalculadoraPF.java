/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

import java.util.LinkedList;

/**
 * Funcion de la calculadora que implementa la interfaz Operable
 * @author Alberto Hernández Medina / Raúl González Martín
 * @param <T> tipo de dato con el que opera a calculadora
 */
public class CalculadoraPF<T extends OperablePF<T>> {

    LinkedList <MiDouble> listaCalculos;
    String signo;
    /**
     * Costructor por defecto
     */
    public CalculadoraPF() {
        this.listaCalculos = new LinkedList<>();
    }

    /**
     * Metodo para añadir los numeros a operar de la clase
     * @param operacion cadena de String con la operacion
     */
    public void addOperacion(String operacion){
        
        String [] splitOperacion = operacion.split(" ");
        
        for (String string : splitOperacion) {   
            
            if(string.equals("-") || string.equals("+") || string.equals("*") || string.equals("/") ){
                
                operar(string);
                
            }else{
                
                MiDouble num = new MiDouble(Double.parseDouble(string));
                listaCalculos.push(num);
                
            }
        }
        
    }

    /**
     * añade los signos de la ecuacion
     * @param signo 
     */
    public void operar(String signo) {
        MiDouble operando1 = listaCalculos.pop();
        MiDouble operando2 = listaCalculos.pop();
        
        switch (signo){
            case"+":
                listaCalculos.push(operando1.suma(operando2));
                break;
            case"-":
                listaCalculos.push(operando1.resta(operando2));
                break;
            case"*":
                listaCalculos.push(operando1.multiplicacion(operando2));
                break;
            case"/":
                listaCalculos.push(operando1.division(operando2));
                break;   
        }
        
    }
    
    /**
     * Metodo para obtener el historial
     * @return 
     */
    public LinkedList<MiDouble> getListaCalculos() {
        return listaCalculos;
    }

    /**
     * Metodo para modificar el historial
     * @param listaCalculos 
     */
    public void setListaCalculos(LinkedList<MiDouble> listaCalculos) {
        this.listaCalculos = listaCalculos;
    }
    
    /**
     * Metodo que borra la base de datos de la calculadora
     */
    private void limpiar() {
        listaCalculos.clear();
    }

    /**
     * Metodo que devuelve el resultado
     * @return resultado de la operacion
     */
    public String getResultado () {
      return listaCalculos.element()+"";  
    }
}
