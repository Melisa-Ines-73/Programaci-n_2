/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                throw new Edad("La edad " + edad + " no es válida.");
            }

            System.out.println("Edad correcta.");

        } catch (Edad e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
