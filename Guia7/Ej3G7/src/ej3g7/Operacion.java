/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g7;

import java.util.Scanner;

/**
 *
 * @author U
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ing un Ent. A: ");
        setNumero1(leer.nextInt());
        System.out.print("Ing un Ent. B: ");
        setNumero2(leer.nextInt());
    }
    public int sumar(){
        int suma = getNumero1() + getNumero2();
        return suma;
    }
    public int restar(){
        int resta = getNumero1() - getNumero2();
        return resta;
    }
    public int multiplicar(){
        int multip = getNumero1() * getNumero2();
        return multip;
    }
    public int dividir(){
        int div = getNumero1() / getNumero2();
        return div;
    }
}
