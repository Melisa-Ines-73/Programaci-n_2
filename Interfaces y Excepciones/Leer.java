/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.io.*;

public class Leer {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura.");
        }
    }
}
