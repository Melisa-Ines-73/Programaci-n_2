/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.io.*;

public class Try {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
