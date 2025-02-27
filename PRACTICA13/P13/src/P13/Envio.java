package P13;

import javax.swing.*;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private Double peso;


    //A continuacion se sobrecargan dos constructores, es decir se crean dos formas en las cuales controlar los datos
    public Envio(String codigoEnvio, String destino){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envio(String codigoEnvio, String destino, Double peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public Double getPeso(){
        return peso;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }

    //metodo estatico para la interaccion de los datos jajas
    public static Envio crearEnvio(){
        String codigo = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar el peso?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if(opcion == JOptionPane.YES_OPTION){

            String pesoStr = JOptionPane.showInputDialog("Ingrese el peso: ");
            Double peso = Double.parseDouble(pesoStr);
            return new Envio(codigo, destino, peso);

        }else{
            return new Envio(codigo, destino);
        }
    }
}
