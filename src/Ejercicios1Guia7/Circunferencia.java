
package Ejercicios1Guia7;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
 
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");//No toma el sout?
        this.radio=sc.nextDouble();
        
    }
    public double area(){
    
        return PI*Math.pow(radio, 2);
    
    }
    public double perimetro(){
        return 2 * PI * radio;
    
    }
    
    
}
