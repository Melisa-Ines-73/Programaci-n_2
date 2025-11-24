/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el denominador: ");
            int b = sc.nextInt();

            int r = a / b;
            System.out.println("Resultado: " + r);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
