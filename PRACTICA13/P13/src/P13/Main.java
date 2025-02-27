package P13;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Envio envio = null;
        Entrega entrega = null;
        
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menu de Gestion\n" +
                "1. Crear Vehiculo\n" +
                "2. Asignar Conductor\n" +
                "3. Crear Envio\n" +
                "4. Registrar Entrega\n" +
                "5. Actualizar Estado de Entrega\n" +
                "6. Salir\n" +
                "Seleccione una opcion:");
            
            if (opcion == null || opcion.equals("6")) {
                break;
            }
            
            switch (opcion) {
                case "1":
                    vehiculo = new Vehiculo();
                    break;
                case "2":
                    if (vehiculo != null) {
                        vehiculo.asignarConductor();
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe crear un vehiculo.");
                    }
                    break;
                case "3":
                    envio = Envio.crearEnvio();
                    break;
                case "4":
                    if (envio != null) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el numero de guia de la entrega:");
                        entrega = new Entrega(numeroGuia);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar un envio.");
                    }
                    break;
                case "5":
                    if (entrega != null) {
                        entrega.actualizarEstado();
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar una entrega.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }
}
