import java.util.*;

public class nletras_nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        longitud = nombre.length();

        System.out.print(nombre.toUpperCase() + " tiene " + longitud + " letras");
    }
}