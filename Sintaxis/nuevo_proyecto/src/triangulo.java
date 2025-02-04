/*
 * 7. Imprime un árbol de navidad formado con Asteriscos haciendo uso del while,
Solicitando al usuario la cantidad de * de la base
 */

 import java.util.*;

 public class triangulo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int base;
 
         System.out.print("Introduce la cantidad de * de la base del árbol de Navidad (entero positivo): ");
         base = sc.nextInt();
 
         int fila = 1;
         while (fila <= base) {
             
             int espacios = base - fila;
             for (int i = 0; i < espacios; i++) {
                 System.out.print(" ");
             }
   
             int asteriscos = 2 * fila - 1;
             for (int i = 0; i < asteriscos; i++) {
                 System.out.print("*");
             }
             
             System.out.println(); 
             fila++;
         }
 
         for (int i = 0; i < base - 1; i++) {
             System.out.print(" ");
         } 
         sc.close();
     }
 }