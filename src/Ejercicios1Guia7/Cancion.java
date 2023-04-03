
package Ejercicios1Guia7;

import java.util.Scanner;

public class Cancion {
    
    public String titulo, autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void crearCancion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        this.titulo=sc.nextLine();
        System.out.println("Ingrese el autor de la cancion");
        this.autor=sc.nextLine();
    }
    
}
