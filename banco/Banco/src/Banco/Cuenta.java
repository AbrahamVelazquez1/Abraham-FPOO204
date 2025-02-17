package Banco;

import javax.swing.JOptionPane;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Ingreso exitoso. Nuevo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad invalida.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad invalida.");
        }
    }

    public void depositar(Cuenta destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            destino.ingresar(cantidad);
            JOptionPane.showMessageDialog(null, "Deposito exitoso a " + destino.getTitular() + ". Nuevo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cantidad invalida.");
        }
    }
}
