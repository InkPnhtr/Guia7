/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g7;

import java.util.Scanner;

/**
 *
 * @author U
 */
public class Ej1G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Libro L1 = CrearLibro();
        MostrarLibro(L1);
    }

    public static Libro CrearLibro() {

        Scanner leer = new Scanner(System.in);
        Libro L1 = new Libro();
        System.out.println("Ingrese Autor");
        L1.Autor =leer.nextLine();
        System.out.println("Ingrese el ISBN");
        L1.ISBN = leer.nextLine();
        System.out.println("Ingrese el Titulo");
        L1.Titulo = leer.nextLine();
        System.out.println("Imngrese el Nro de Pgs.");
        L1.NroPg = leer.nextInt();
        return L1;
         
    }
    
    public static void MostrarLibro(Libro L1){
        System.out.println(L1);
    }


}

//public class Libro {
//    
//    public String ISBN;
//    public String Titulo;
//    public String Autor;
//    public int NroPg;
