
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
public class EjercicioExtra1 {
         /**
     * @param args the command line arguments
     */
    /*
    Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma.
        */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
     int num1 = 0;
     int num2 = 0;
     System.out.println("Ingrese el primer número entero");
     num1 = leer.nextInt();
     System.out.println("Ingrese el segundo número entero");
     num2 = leer.nextInt();
     int suma = num1 + num2;
     System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
     
           
  }
}
