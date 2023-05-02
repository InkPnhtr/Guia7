/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2g7;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia(){
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        Scanner leer = new Scanner(System.in);
        System.out.println("Radio?");
        
        setRadio(leer.nextDouble());
        //this.radio = radio;
        System.out.println("Radio= " + getRadio());
        System.out.println("AREA= " + area());
        System.out.println("PERIMETRO= " + perimetro());
                
    }
    public double area(){
        double area;
        area = pow((PI*(getRadio())),2);
        return area;
                
    }
    public double perimetro(){



        double perimetro = 2 * PI * getRadio();
        return perimetro;
        
    }
    
}
