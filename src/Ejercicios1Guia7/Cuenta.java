/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
de realizar una transacción de retiro.

 */
package Ejercicios1Guia7;

import java.util.Scanner;

public class Cuenta {

    public Cuenta() {
    }
    
    public String titular;
    public double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar_dinero(){
    Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        this.titular=sc.next();
        int fondos=0;
        System.out.println("Su saldo actual es de: " + fondos);
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        this.saldo=sc.nextInt();
        
        if (fondos<0) {
            System.out.println("No tiene fondos");
        }

    }
}

        


