/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generador_de_contraseñas;
import java.util.Random;

/**
 *
 * @author MINEDUCYT
 */
public class Generador_de_contraseñas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        int longitud = 10;
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contrasena.append(caracter);
        }
        System.out.println("Contraseña generada: " + contrasena.toString());
        
    }
    
}
