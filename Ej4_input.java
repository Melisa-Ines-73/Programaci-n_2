
package holamundo;

import java.util.Scanner;


public class Ej4_input {

    
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre y su edad");
        Scanner input = new Scanner (System.in);
        String nombre;
          int edad;
        nombre = input.nextLine();
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }
    
}
