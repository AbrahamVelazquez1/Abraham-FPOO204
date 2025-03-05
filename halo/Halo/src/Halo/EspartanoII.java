package Halo;

public class EspartanoII extends Espartano {
    public EspartanoII(String nombre, int salud, String arma) {
        super(nombre, salud, arma, 100);
    }

    public EspartanoII() {
        super();
        this.escudo = 100;
    }

    public void usarManejoAvanzado() {
        System.out.println(nombre + " utiliza manejo avanzado de combate.");
    }
}