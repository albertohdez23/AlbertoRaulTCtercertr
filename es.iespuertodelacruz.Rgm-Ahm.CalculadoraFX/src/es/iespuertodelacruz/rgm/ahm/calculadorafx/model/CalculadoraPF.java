/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

import java.util.LinkedList;

/**
 * Funcion de la calculadora que implementa la interfaz Operable
 * @author Alberto Hernández Medina
 * @param <T> tipo de dato con el que opera a calculadora
 */
public class CalculadoraPF<T extends OprablePF<T>> {

    LinkedList<T> listaCalculos;

    public CalculadoraPF() {
        this.listaCalculos = new LinkedList<>();
    }

    public LinkedList<T> getListaCalculos() {
        return listaCalculos;
    }

    public void setListaCalculos(LinkedList<T> listaCalculos) {
        this.listaCalculos = listaCalculos;
    }

    public void addOperando(T operando) {

        listaCalculos.push(operando);

    }

    public void operar(String operador) {

        T operador1;
        T operador2;
        T resultado;

        switch (operador) {
            case "+":
                operador1 = listaCalculos.pop();
                operador2 = listaCalculos.pop();

                resultado = operador2.suma(operador1);
                listaCalculos.push(resultado);
                break;

            case "-":
                operador1 = listaCalculos.pop();
                operador2 = listaCalculos.pop();

                resultado = operador2.resta(operador1);
                listaCalculos.push(resultado);
                break;

            case "*":
                operador1 = listaCalculos.pop();
                operador2 = listaCalculos.pop();

                resultado = operador2.multiplicacion(operador1);
                listaCalculos.push(resultado);
                break;

            case "/":
                operador1 = listaCalculos.pop();
                operador2 = listaCalculos.pop();

                resultado = operador2.division(operador1);
                listaCalculos.push(resultado);
                break;
        }

    }

    public OprablePF resultado() {

        OprablePF resultado = listaCalculos.pop();
        return resultado;
    }
}
