package P13;

import javax.swing.JOptionPane;

public class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente"; // Estado por defecto cpmmo pendiente
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En transito / Entregado):");
        
        //Validar la entrada del usuario
        if (nuevoEstado != null && (nuevoEstado.equalsIgnoreCase("En transito") || nuevoEstado.equalsIgnoreCase("Entregado"))) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + this.estado);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Solo se permiten los estados 'En transito' o 'Entregado'.");
        }
    }
}