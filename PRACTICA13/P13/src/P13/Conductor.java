package P13;

import javax.swing.JOptionPane;

public class Conductor {
    private String nombre;
    private String licencia;
    private String identificacion;

    public Conductor(String nombre, String licencia, String identificacion){
        this.nombre = nombre;
        this.licencia = licencia;
        this.identificacion = identificacion; 
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getLicencia(){
        return licencia;
    }

    public String getIdentificacion(){
        return identificacion;
    }
}