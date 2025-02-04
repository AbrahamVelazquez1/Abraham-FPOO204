/*
 * 2. Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
 */

 import java.util.*;

public class cuenta_atras {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;

        System.out.print("Ingrese una numero: ");
        int numero = sc.nextInt();
        c = numero;

        for(int i=0; i<=numero; i++){
            System.out.print(c + ", ");
            c--;
        }
	}
}