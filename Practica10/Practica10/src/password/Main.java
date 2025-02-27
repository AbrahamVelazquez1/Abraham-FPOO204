package password;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int length = 8;
        String input = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (minimo 8, por defecto 8): ");

        //validando que el usuario digite un numero
        try{
            length = Integer.parseInt(input);
            if (length < 8) length = 8;

            } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada no valida, usando longitud por defecto de 8.");
        }

        int includeUppercase = JOptionPane.showConfirmDialog(null, "Incluir mayusculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        int includeSpecials = JOptionPane.showConfirmDialog(null, "Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        
        String password = PasswordGenerator.generatePassword(length, includeUppercase == JOptionPane.YES_OPTION, includeSpecials == JOptionPane.YES_OPTION);
        String strength = PasswordStrength.checkPasswordStrength(password);
        
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + password + "\nFortaleza: " + strength);
    }
}