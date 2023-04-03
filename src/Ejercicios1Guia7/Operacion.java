
package Ejercicios1Guia7;

import java.util.Scanner;


public class Operacion {
  
    private int num1,num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.num2=sc.nextInt();
        
    }
    public int sumar(){
    return num1+num2;
    }
    public int restar(){
    return num1-num2;
    }
    public int multiplicacion(){
        if (num1==0 || num2==0) {
            System.out.println("Numero no valido");
            return 0;
        }else{
         return num1*num2;
        }
    }
    public double division(){
        if (num2==0) {
            System.out.println("Numero no valido");
            return 0;
        } else{
         return (double) num1/num2;
        }
   
    }
   
}

