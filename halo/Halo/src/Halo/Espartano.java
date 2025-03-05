package Halo;

public class Espartano extends Soldado {
    protected int escudo;

    public Espartano(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma);
        this.escudo = escudo;
    }

    public Espartano() {
        super();
        this.escudo = 0;
    }

    public void recibirDano(int dano) {
        if (escudo > 0) {
            escudo -= dano;
            if (escudo < 0) {
                salud += escudo;
                escudo = 0;
            }
            if (salud <= 0) {
                salud = 0;
                System.out.println(nombre + " ha sido eliminado.");
            } else {
                System.out.println(nombre + " ahora tiene " + salud + " de salud y " + escudo + " de escudo.");
            }
        } else {
            super.recibirDano(dano);
        }
    }

    public void recargarEscudo() {
        escudo = 100;
        System.out.println(nombre + " ha recargado su escudo a " + escudo);
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Escudo: " + escudo);
    }
}