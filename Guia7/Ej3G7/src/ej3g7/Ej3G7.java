/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g7;

/**
 *
 * @author U
 */
public class Ej3G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion Op1 = new Operacion();
        Op1.crearOperacion();
        System.out.println("Suma = " + Op1.sumar());
        System.out.println("Resta = " + Op1.restar());
        System.out.println("Multip = " + Op1.multiplicar());
        System.out.println("Div = " + Op1.dividir());
    }
    
}
