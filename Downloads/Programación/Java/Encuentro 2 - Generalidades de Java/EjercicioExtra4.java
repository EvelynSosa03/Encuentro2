
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
public class EjercicioExtra4 {
                 /**
     * @param args the command line arguments
     */
    /*
   Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
        */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    double centigrados;
    System.out.println("Ingrese los grados centrigrados");
    centigrados = leer.nextInt();
    double formula = 32 + (9 * centigrados / 5);
    System.out.println("Los grados centigrados eqivalentes en Fahrenheit es: " + formula);
    }
}
