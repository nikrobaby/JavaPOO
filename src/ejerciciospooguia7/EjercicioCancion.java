
package ejerciciospooguia7;

import Ejercicios1Guia7.Cancion;


public class EjercicioCancion {

    
    public static void main(String[] args) {
       
        Cancion c1 = new Cancion();
        c1.crearCancion();
        
        System.out.println("El titulo de la cancion es: " + c1.titulo);
        System.out.println("El autor de la cancion es: " + c1.autor);
                
    }
    
    
    
}
