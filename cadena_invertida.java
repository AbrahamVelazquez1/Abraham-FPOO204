import java.util.*;

public class cadena_invertida {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String cadena = sc.nextLine();

		String invertida = "";
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			invertida += cadena.charAt(indice);
		}
		System.out.println("Frase original: " + cadena);
		System.out.println("Frase invertida: " + invertida);

	}
}