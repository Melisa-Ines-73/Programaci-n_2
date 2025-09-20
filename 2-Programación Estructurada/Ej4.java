
package tp2_programacionestructurada;

import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto:");
        double precioOriginal = input.nextDouble();
    System.out.print("Ingrese la categoría del producto (A, B o C): ");
         String categoria = input.next();
    
    double descuento = 0;

        if (categoria.equalsIgnoreCase("A")) {
            descuento = 0.10;
        } else if (categoria.equalsIgnoreCase("B")) {
            descuento = 0.15;
        } else if (categoria.equalsIgnoreCase("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            input.close();
            return;
            }

            
   double montoDescuento = precioOriginal * descuento;
    double precioFinal = precioOriginal - montoDescuento;
    
    System.out.println("Precio final: " + precioFinal);
    System.out.println("Descuento: " + montoDescuento);
    System.out.println("Precio Original: " + precioOriginal );
}
    }
