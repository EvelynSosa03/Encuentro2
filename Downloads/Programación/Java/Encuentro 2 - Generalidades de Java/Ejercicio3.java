
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Ejercicio3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    System.out.println("Ingrese dos numeros enteros:");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    
    int suma = num1 + num2;
    double division = num2 / num1;
    boolean logico = num1 <= num2;
    int multiplicacion = num1 * num2;
    
    System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
    System.out.println("La division de " + num2 + " / " + num1 + " = " + division);
    System.out.println("El resultado de " + num1 + " <= " + num2 + " es " + logico);
    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + multiplicacion);
   
}
}