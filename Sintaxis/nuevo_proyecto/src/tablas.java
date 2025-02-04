/*
 * 3. Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.
 */

import java.util.*;

public class tablas {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1, r=0;

        System.out.print("Ingrese una numero para saber su tabla: ");
        int numero = sc.nextInt();

        for(int i=0; i<10; i++){
            r = numero * c;
            System.out.println(numero + " x " + c + " = " + r);
            c++;
        }
	}
}