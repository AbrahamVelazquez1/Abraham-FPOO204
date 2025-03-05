package Halo;

public class EspartanoIV extends Espartano {
    public EspartanoIV(String nombre, int salud, String arma) {
        super(nombre, salud, arma, 50);
    }

    public EspartanoIV() {
        super();
        this.escudo = 50;
    }

    public void usarPropulsores() {
        System.out.println(nombre + " activa sus propulsores para un salto avanzado.");
    }
}