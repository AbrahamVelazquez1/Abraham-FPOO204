import java.util.Scanner;

public class Examen_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero par comprendido entre 200 y 400: ");
        numero = sc.nextInt();

        if(numero < 200){
            System.out.println("El numero no puede ser menor a 200");
        }else if(numero > 400){
            System.out.println("El numero no puede ser mayor a 400");
        }else{
            for(int i=numero; i<=400; i++){
                if((numero) % 2 == 0){
                    System.out.println(numero);
                }
                numero++;
            }
        }
        sc.close();
    }
}
