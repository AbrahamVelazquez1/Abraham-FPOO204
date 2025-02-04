import java.util.*;
public class nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar su nombre: ");
        String n = sc.nextLine();
        System.out.print("Ingresar su apellido paterno: ");
        String ape = sc.nextLine();
        System.out.print("Ingresar su apellido materno: ");
        String ama = sc.nextLine();

        String nombre_completo = n + " " + ape + " " + ama;

        String nc = n.toUpperCase().charAt(0) + " " + ape.toUpperCase().charAt(0)+ " " + ama.toUpperCase().charAt(0);
        
        System.out.println(nombre_completo.toLowerCase());
        System.out.println(nombre_completo.toUpperCase());
        System.out.println(nc);
    }
}