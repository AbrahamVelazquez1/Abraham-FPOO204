/*
 * 3. Escribir un programa para una empresa que tiene salas de juegos para todas
las edades y quiere calcular de forma automática el precio que debe cobrar a
sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente
y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar
gratis, si tiene entre 4 y 18 años debe pagar $110 y si es mayor de 18 años, $190
 * 
 */
import java.util.Scanner;

public class precio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad del cliente: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("La entrada es gratis");
        } else if (edad <= 18) {
            System.out.println("El precio de la entrada es $110");
        } else {
            System.out.println("El precio de la entrada es $190");
        }

        sc.close();
    }
}
