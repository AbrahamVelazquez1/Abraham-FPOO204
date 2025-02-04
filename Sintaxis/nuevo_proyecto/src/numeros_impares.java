/*
 * 1. Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla todos los números impares desde 1 hasta ese número separados
por comas.
 */

import java.util.*;

public class numeros_impares {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1;

        System.out.print("Ingrese una numero: ");
        int numero = sc.nextInt();

        for(int i=0; i<numero; i++){
            if ((c) % 2 == 0) {
            } else {
                System.out.println(c);
            }

            c++;
        }
	}
}