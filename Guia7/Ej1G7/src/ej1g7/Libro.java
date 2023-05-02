/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.


 */
package ej1g7;

/**
 *
 * @author U
 */
public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NroPg;

    public Libro(String ISBN, String Titulo, String Autor, int NroPg) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroPg = NroPg;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NroPg=" + NroPg + '}';
    }
    
    
    
    
    
}
