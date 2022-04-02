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
class CalculadoraPF<T extends OperablePF<T>> {

    LinkedList<T> listaCalculos;
    String signo;
    /**
     * Costructor por defecto
     */
    public CalculadoraPF() {
        this.listaCalculos = new LinkedList<>();
    }

    /**
     * Metodo para añadir los numeros a operar de la clase
     * @param operando 
     */
    public void addOperando(T operando) {
        listaCalculos.push(operando);
    }

    /**
     * añade los signos de la ecuacion
     * @param signo 
     */
    public void operar(String signo) {
        T operando1 = listaCalculos.pop();
        T operando2 = listaCalculos.pop();
        
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
    public LinkedList<T> getListaCalculos() {
        return listaCalculos;
    }

    /**
     * Metodo para modificar el historial
     * @param listaCalculos 
     */
    public void setListaCalculos(LinkedList<T> listaCalculos) {
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
    public T resultado () {
      return listaCalculos.element();  
    }
}
