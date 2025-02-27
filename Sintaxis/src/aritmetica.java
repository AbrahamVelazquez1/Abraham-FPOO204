/*
 * 5. Escribe un programa que simule una calculadora básica utilizando un switch.
El usuario debe ingresar dos números y un operador (+, -, *, /). Según el
operador ingresado, el programa debe realizar la operación correspondiente y
mostrar el resultado. Si el operador no es válido, el programa debe mostrar un
mensaje de error.
 */

import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Introduce un operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error. Imposible dividir entre cero");
                }
                break;
            default:
                System.out.println("Error. Operador no valido");
        }

        sc.close();
    }
}
