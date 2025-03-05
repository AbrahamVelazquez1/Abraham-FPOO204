package Halo;

public class EspartanoIII extends Espartano {
    public EspartanoIII(String nombre, int salud, String arma) {
        super(nombre, salud, arma, 75);
    }

    public EspartanoIII() {
        super();
        this.escudo = 75;
    }

    public void camuflajeActivo() {
        System.out.println(nombre + " activa su camuflaje y se vuelve invisible.");
    }
}