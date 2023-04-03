
package Ejercicios1Guia7;

import java.util.Scanner;


public class Juego {

    private int cantidadIntentos;
    private int numeroAdivinar;
    private int numeroIngresado;
    
    public Juego (){
    
    }

    public Juego(int cantidadIntentos, int numeroAdivinar, int numeroIngresado) {
        this.cantidadIntentos = cantidadIntentos;
        this.numeroAdivinar = numeroAdivinar;
        this.numeroIngresado = numeroIngresado;
     
   
    }
    
    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }
    
    public void iniciarJuego (){
    Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de intentos: ");
        this.cantidadIntentos=sc.nextInt();
        System.out.println("Ingrese el numero a adivinar: ");
        this.numeroAdivinar=sc.nextInt();
        int contador = 0;
        
        do {            
            System.out.println("Jugador dos,ingrese el numero: ");
            this.numeroAdivinar=sc.nextInt();
            if (numeroIngresado>numeroAdivinar) {
                System.out.println("Menor");
            } else if(numeroIngresado<numeroAdivinar) {
                System.out.println("Mayor");
            }
            contador++;
        } while (contador < cantidadIntentos && numeroAdivinar != numeroIngresado);
        if (numeroAdivinar != numeroIngresado) {
            System.out.println("No adivinaste :c");
        } else {
            System.out.println("Adivinaste!!!");
        }        
    }
    
}