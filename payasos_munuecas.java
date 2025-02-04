import java.util.*;

public class payasos_munuecas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c_payasos, c_munecas;
        int peso;

        System.out.print("Ingrese la cantidad de payasos del ultimo pedido: ");
        c_payasos = sc.nextInt();

        System.out.print("Ingrese la cantidad de munecas del ultimo pedido: ");
        c_munecas = sc.nextInt();

        peso = (c_munecas * 75) + (c_payasos * 112);
        System.out.print("El peso total es: " + peso);
    }
}