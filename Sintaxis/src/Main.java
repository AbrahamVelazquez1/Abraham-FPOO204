import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola soy Abraham!");
        String cadena = "Hola" + "Soy" + "Abraham";

        System.out.println(cadena);

        System.out.println(cadena.length()); //Obtener la longitud de la cadena

        System.out.println(cadena.substring(0, 1)); //Extraer los datos de la cadena en A a B posicion

        int a = 1, a2, a3 = 500, a4 = 20;
        double b = 45.5, b2;
        String c = "bskjog";
        String d = "1";
        String f; //guarda el valor de a3 en modo cadena

        a2 = Integer.parseInt(d);
        f = String.valueOf(a3);
        b2 = Double.valueOf(a4);

        Random numeroRandom = new Random();

        int random_entero = numeroRandom.nextInt();
        double random_double = numeroRandom.nextDouble();

        System.out.println(random_entero);
        System.out.println(random_double);

        System.out.println("Ingresa algo: ");
        String dato = sc.nextLine();

        System.out.println("Usted ingreso: " + dato);

        System.out.println(10 > 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        int x=3;

        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        
    }
}