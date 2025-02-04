import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero X: ");
        int X = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= X; i++) {
            suma += i;
        }
        System.out.println("La suma de los enteros desde 1 hasta " + X + " es: " + suma);
        scanner.close();
    }
}