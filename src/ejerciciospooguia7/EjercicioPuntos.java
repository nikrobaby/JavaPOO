
package ejerciciospooguia7;

import Ejercicios1Guia7.Puntos;


public class EjercicioPuntos {

    
    public static void main(String[] args) {
       
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        puntos.calcularDistancia();
        System.out.println("La distancia del P1 al P2 es de: " + puntos.calcularDistancia());
    }
    
}
