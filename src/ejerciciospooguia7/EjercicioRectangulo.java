
package ejerciciospooguia7;

import Ejercicios1Guia7.Rectangulo;




public class EjercicioRectangulo {

   
    public static void main(String[] args) {
    
        
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        System.out.println("La base es: "+ r1.getSuperficie());
        System.out.println("La altura es: " + r1.getPerimetro());
        r1.dibujarRectangulo();
        
    }
    
    
}
