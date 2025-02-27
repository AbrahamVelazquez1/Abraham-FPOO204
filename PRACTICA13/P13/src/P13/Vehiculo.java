package P13;

import javax.swing.JOptionPane;

public class Vehiculo{
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    public Vehiculo(){
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga(kg):"));
        this.conductor = null;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor(){
        return conductor;
    }

    public void asignarConductor(){ // No necesita parámetro Conductor
        if(this.conductor != null) {
            JOptionPane.showMessageDialog(null, "Error: El conductor ya ha sido asignado y no se puede modificar.");
            return;
        }
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        this.conductor = new Conductor(nombre, licencia, identificacion);
        JOptionPane.showMessageDialog(null, "Conductor asignado: " + this.conductor.getNombre());
    }
}
