
package tp2_programacionestructurada;

import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
     int edad = input.nextInt();

    if (edad < 12) {
            System.out.println("Etapa de vida: Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Etapa de vida: Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Etapa de vida: Adulto");
        } else {
            System.out.println("Etapa de vida: Adulto mayor");
        }

        input.close();
}
    }  
