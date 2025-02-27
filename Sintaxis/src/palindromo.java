/*
 * 4. Codifica un programa que solicite una cadena de caracteres e imprima como
resultado si la cadena es palíndromo o no
 * 
 */

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        
        if (cadena.equalsIgnoreCase(cadenaInvertida)) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena no es un palindromo.");
        }

        sc.close();
    }
}