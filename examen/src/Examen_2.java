import java.util.Scanner;

public class Examen_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        do{
            if((numero) % 2 == 0){
                numero = numero / 2;
                System.out.println(numero);
            }else if((numero) % 2 != 0){
                numero = (numero * 3) + 1;
                System.out.println(numero);
            }

        }while(numero != 1);

        sc.close();
    }
}