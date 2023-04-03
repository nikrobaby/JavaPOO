package ejerciciospooguia7;

import Ejercicios1Guia7.Operacion;

public class EjercicioOperacion {

    public static void main(String[] args) {

        Operacion op = new Operacion();
        op.crearOperacion();

        System.out.println("Suma : " + op.sumar() + " Resta: " + op.restar() + " Multiplicar: " + op.multiplicacion() + " Division: " + op.division());
        /*System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicacion: " + op.multiplicacion());
        System.out.println("Division: " + op.division());*/
    }

}
