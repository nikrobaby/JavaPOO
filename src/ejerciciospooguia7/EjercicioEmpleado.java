
package ejerciciospooguia7;

import Ejercicios1Guia7.Empleado;

public class EjercicioEmpleado {

    public static void main(String[] args) {
       
        Empleado aumentar = new Empleado();
        aumentar.calcularAumento();
       
        System.out.println("El aumento salarial es de:$ " + aumentar.aumento());
    }
   
    
}
