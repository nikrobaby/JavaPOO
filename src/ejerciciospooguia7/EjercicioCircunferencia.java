
package ejerciciospooguia7;

import Ejercicios1Guia7.Circunferencia;


public class EjercicioCircunferencia {

    public static void main(String[] args) {
      
        Circunferencia c1 = new Circunferencia(1); //Por que se coloca el 1?
        System.out.println("Area: "+ c1.area());
        System.out.println("Perimetro: " +c1.perimetro());
        c1.setRadio(1);
        System.out.println("Area: "+c1.area());
        System.out.println("Perimetro: "+c1.perimetro());
        
    }
    
}
