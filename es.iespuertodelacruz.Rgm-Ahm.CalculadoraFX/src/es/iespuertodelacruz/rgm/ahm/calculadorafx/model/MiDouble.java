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
    
    @Override
    public MiDouble suma(MiDouble objeto) {
        double sumNum = this.num + objeto.num;
        return new MiDouble(sumNum);
    }

    @Override
    public MiDouble resta(MiDouble objeto) {
        double resNum = this.num - objeto.num;
        return new MiDouble(resNum);
    }

    @Override
    public MiDouble multiplicacion(MiDouble objeto) {
        double proNum = this.num * objeto.num;
        return new MiDouble(proNum);
    }

    @Override
    public MiDouble division(MiDouble objeto) {
        double divNum = this.num / objeto.num;
        return new MiDouble(divNum);
    }

    public double toDouble(){
        return num;
    }

    @Override
    public String toString() {
        return  ""+num ;
    }
    
    
}
