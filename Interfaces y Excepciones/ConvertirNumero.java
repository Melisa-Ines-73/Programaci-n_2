/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

public class ConvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto no es un número válido.");
        }
    }
}
