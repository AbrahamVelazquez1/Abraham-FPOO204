/*
 * 4. Escribir un programa que pida al usuario un número entero y muestre por
pantalla un triángulo rectángulo como el de más abajo, de altura el número
introducido. (img 1)
 * 
 */

import java.util.*;

public class MostrarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura del triangulo (entero positivo): ");
        int altura = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}