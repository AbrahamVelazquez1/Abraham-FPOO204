package Halo;

public class Main {
    public static void main(String[] args){
        Spartan JefeMaestro = new Spartan();
        Spartan Reach = new Spartan();

        JefeMaestro.nombre = "John117";
        JefeMaestro.salud = 100;
        JefeMaestro.escudo = 90;
        JefeMaestro.armaPrincipal = "Rifle de asalto";

        Reach.mostrarInfo();
        Reach.atacar("Elite");
        Reach.recargarArma(65);
        Reach.correr(true);

        Reach.nombre = "Emile";
        Reach.salud = 65;
        Reach.escudo = 1;
        Reach.armaPrincipal = "Magnum";

        Reach.mostrarInfo();
        Reach.atacar("Gunter");
        Reach.recargarArma(2);
        Reach.correr(false);


    }
}
