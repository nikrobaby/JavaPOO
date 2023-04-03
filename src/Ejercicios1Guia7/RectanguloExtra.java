/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area"
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo"
con lados de 4 y 6 y imprime el área del rectángulo.
 */
package Ejercicios1Guia7;

import java.util.Scanner;


public class RectanguloExtra {
    
    public int lado1,lado2;

    public RectanguloExtra() {
    }

    public RectanguloExtra(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

     public int calcular_area(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer lado del rectangulo: ");
        this.lado1=sc.nextInt();
        System.out.println("Ingrese el segundo lado del rectangulo: ");
        this.lado2=sc.nextInt();
        return lado1*lado2;
}
   /*  public int calcular_Area(){
     return lado1*lado2;
     }*/
}

