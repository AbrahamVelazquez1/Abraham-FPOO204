import java.util.*;

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;

        System.out.print("Ingrese el numero de horas trabajadas: ");
        Double horas = sc.nextDouble();

        sueldo = 34.85 * horas;

        System.out.println("Su sueldo por horas trabajadas es: $" + sueldo);
    }
}