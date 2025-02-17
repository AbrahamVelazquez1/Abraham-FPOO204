package Banco;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        Cuenta cuenta = new Cuenta(numeroCuenta, titular, edad, saldo);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n1. Consultar saldo\n2. Ingresar efectivo\n3. Retirar efectivo\n4. Depositar a otra cuenta\n5. Salir"));
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo actual: " + cuenta.getSaldo());
                    break;
                case 2:
                    double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar:"));
                    cuenta.ingresar(ingreso);
                    break;
                case 3:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    String numeroCuentaDestino = JOptionPane.showInputDialog("Ingrese el numero de cuenta destino:");
                    String titularDestino = JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta destino:");
                    int edadDestino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta destino:"));
                    double saldoDestino = 0;
                    Cuenta cuentaDestino = new Cuenta(numeroCuentaDestino, titularDestino, edadDestino, saldoDestino);
                    double cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    cuenta.depositar(cuentaDestino, cantidadDeposito);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 5);
    }
}
