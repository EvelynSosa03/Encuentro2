
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
public class EjercicioExtra3 {
              /**
     * @param args the command line arguments
     */
    /*
   Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        System.out.println("La frase en minuscula es:");
        System.out.println(frase.toLowerCase());
        System.out.println("La frase en mayuscula es:");
        System.out.println(frase.toUpperCase());
        
}
}