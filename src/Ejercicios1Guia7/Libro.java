/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios1Guia7;

import java.util.Scanner;


public class Libro {
    
   public String ISBN;
   public String Titulo;
   public String Autor;
   public int NumPag;

    public Libro(String ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }
    
    public Libro() {
    }
    
    public void setLibro(){
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el ISBN");
        this.ISBN=sc.nextLine();
        System.out.println("Ingrese el nombre del Autor");
        this.Autor=sc.nextLine();
        System.out.println("Ingrese el Titulo del libro");
        this.Titulo=sc.nextLine();
        System.out.println("Ingrese el numero de paginas");
        this.NumPag=sc.nextInt();
  
    }
    
    public void getLibro(){
    System.out.println("El ISBN: "+ ISBN +" El titulo es: "+ Titulo +" El autor es: "+ Autor +" El número de paginas es: "+ NumPag );
        
    }
    
}
