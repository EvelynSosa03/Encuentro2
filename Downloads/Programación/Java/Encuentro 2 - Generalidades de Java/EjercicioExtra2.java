
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
public class EjercicioExtra2 {
             /**
     * @param args the command line arguments
     */
    /*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.

        */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
    String nombre;
    System.out.println("Ingrese su nombre");
    nombre = leer.next();
    System.out.println("Mi nombre es " + nombre);
    }
}
