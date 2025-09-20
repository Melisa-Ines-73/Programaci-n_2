
package tp2_programacionestructurada;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero;
        int sumPares = 0;
        System.out.println("Ingrese números enteros: ");
        
        while (true) {
            System.out.print("Número: ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
              sumPares += numero;
            }
        }

        System.out.println("\nLa Suma de los  números paresingresados es " + sumPares);
        
    }
}
