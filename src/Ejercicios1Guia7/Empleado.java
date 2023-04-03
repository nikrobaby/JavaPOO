/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado
tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package Ejercicios1Guia7;

import java.util.Scanner;

public class Empleado {

    public Empleado() {
    }
    
    public String nombre;
    public double salario;
    public int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void calcularAumento(){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre=sc.next();
        System.out.println("Ingrese la edad de la persona: ");
        this.edad=sc.nextInt();
        System.out.println("Ingrese el salario actual: ");
        this.salario=sc.nextDouble();
        
    }
    
    public double aumento(){
        double aumento=0;
        if (edad > 30) {
            return aumento = salario * 0.1;
        } else {
            return aumento = salario * 0.05;
        }
      
    }
 
    }
       
        
        
       
    
    
    

