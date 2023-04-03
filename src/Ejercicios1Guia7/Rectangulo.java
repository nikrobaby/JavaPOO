
package Ejercicios1Guia7;

import java.util.Scanner;


public class Rectangulo {
    
    private int base,altura;
   

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    /*public Rectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
    Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base=sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura=sc.nextInt();
    }
    public int getSuperficie(){
       return base*altura;
    }
    public int getPerimetro(){
        return (base+altura)*2;
    }        
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
               System.out.print( " * ");
            }
            System.out.println("");
        }
    }        
}
