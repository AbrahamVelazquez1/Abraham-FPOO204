/*
 * 1. Escribir un programa que almacene la cadena de caracteres una contraseña
en una variable, después que solicite al usuario una contraseña e imprima en
pantalla si la contraseña introducida por el usuario coincide con la guardada en
la variable sin tener en cuenta mayúscula y minúscula.
 * 
 */

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        String storedPassword = "contrasena123";

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la contrasena: ");
        String userInput = sc.nextLine();

        if (storedPassword.equalsIgnoreCase(userInput)) {
            System.out.println("La contrasena es correcta.");
        } else {
            System.out.println("La contrasena es incorrecta.");
        }

        sc.close();
    }
}
