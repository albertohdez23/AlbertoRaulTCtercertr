/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.rgm.ahm.calculadorafx.model;

/**
 *
 * @author Raúl Gónzález Martín / Alberto Hernández Medina
 */
interface OperablePF<T> {

    T suma(T objeto);

    T resta(T objeto);

    T multiplicacion(T objeto);

    T division(T objeto);

}
