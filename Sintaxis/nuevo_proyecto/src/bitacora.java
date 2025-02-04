/*
 * 6. Escriba un programa que administre una cuenta bancaria, usando una bitácora
de operaciones. (img 2)
La bitácora de operaciones tiene la siguiente forma:
D 100
R 50
D 100 significa que depositó 100 pesos
R 50 significa que retiró 50 pesos
Introducir una línea vacía indica que ha finalizado la bitácora e imprime el saldo
Final
 */

 import java.util.*;

 public class bitacora {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int saldo = 9800;
         String movimiento;
         boolean band = false;
 
         System.out.println("Su saldo es de : $" + saldo);
         System.out.println("D: 100");
         System.out.println("R: 50");
 
         do {
             System.out.print("Ingrese la letra de la operacion a realizar: ");
             movimiento = sc.nextLine();
 
             if (movimiento.equals("d") || movimiento.equals("D")) {
                 System.out.println("Usted ha depositado $100 a su saldo");
                 saldo += 100; 
             } else if (movimiento.equals("r") || movimiento.equals("R")) {
                 System.out.println("Usted ha retirado $50 de su saldo");
                 saldo -= 50;
             } else if (movimiento.equals("")) { 
                 band = true;
             }
         } while (!band); 
 
         System.out.println("Su saldo final es de: $" + saldo);
     }
 }