/*
 * 2. Escribir un programa que pida al usuario un número entero y muestre por
pantalla si es par o impar.
 * 
 */

import java.util.Scanner;

public class Nimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        sc.close();
    }
}
