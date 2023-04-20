
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
public class EjercicioExtra5 {
                  /**
     * @param args the command line arguments
     */
    /*
   Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
        */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double cuadrada;
        System.out.println("El doble de "+ numero+" es "+ doble);
        System.out.println("El triple de "+numero+" es "+ triple);
        System.out.println("La raiz cuadrada de "+ numero+ " es "+ Math.sqrt(numero));
        
}
}
