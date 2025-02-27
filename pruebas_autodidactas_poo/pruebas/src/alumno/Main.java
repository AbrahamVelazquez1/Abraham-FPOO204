package alumno;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matricula;

        System.out.print("Ingrese la matricula del alumno: ");
        matricula = sc.nextInt();

        Alumno Alumno_1 = new Alumno();
        Alumno_1.setMatricula(matricula);

        System.out.print("La matricula del alumno es: " + Alumno_1.getMatricula());
        
        sc.close();
    }
}
