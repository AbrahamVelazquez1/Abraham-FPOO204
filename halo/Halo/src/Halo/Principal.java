package Halo;

public class Principal {
    public static void main(String[] args) {
        Soldado soldado = new Soldado("Soldado1", 100, "Rifle");
        Espartano espartano = new Espartano("Espartano1", 150, "Escopeta", 100);
        EspartanoII espartanoII = new EspartanoII("EspartanoII1", 200, "Lanzamisiles");
        EspartanoIII espartanoIII = new EspartanoIII("EspartanoIII1", 180, "Sniper");
        EspartanoIV espartanoIV = new EspartanoIV("EspartanoIV1", 220, "Plasma");

        soldado.mostrarInformacion();
        espartano.mostrarInformacion();
        espartanoII.mostrarInformacion();
        espartanoIII.mostrarInformacion();
        espartanoIV.mostrarInformacion();

        soldado.atacar("Enemigo1");
        espartano.atacar("Enemigo2");

        espartano.recibirDano(30);
        espartanoII.recibirDano(50);

        espartanoII.usarManejoAvanzado();
        espartanoIII.camuflajeActivo();
        espartanoIV.usarPropulsores();

        espartano.recargarEscudo();
    }
}