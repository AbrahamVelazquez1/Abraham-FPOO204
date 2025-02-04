/*
 * 5. Escribir un programa en el que se pregunte al usuario por una frase y una letra,
y muestre por pantalla el número de veces que aparece la letra en la frase.
 */
 import java.util.Scanner;
 public class veces_letra {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese una frase: ");
         String frase = sc.nextLine().toLowerCase(); 
         System.out.print("Ingrese una letra: ");
         String letra = sc.nextLine().toLowerCase(); 
         if (letra.length() != 1) {
             System.out.println("Ingresa una letra: ");
             return;
         }
         int contador = 0;
         for (int i = 0; i < frase.length(); i++) {
             if (frase.charAt(i) == letra.charAt(0)) {
                 contador++;
             }
         }
         System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la fraseA");
         sc.close();
     }
 }