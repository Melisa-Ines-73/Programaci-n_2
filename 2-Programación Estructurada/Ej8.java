
package tp2_programacionestructurada;

import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base");
        double base = input.nextDouble();
        
        System.out.print("Ingrese el porcentaje de impuesto");
        double impuesto = input.nextDouble() / 100;
        
        System.out.print("Ingrese el porcentaje de descuento");
        double descuento = input.nextDouble() / 100;
        

        double precioFinal = calcularPrecioFinal(base, impuesto, descuento);
         System.out.print("El precio final es  "+ precioFinal);
        

                    }  
public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        double precioConImpuesto = base + (base * impuesto);
        double precioConDescuento = precioConImpuesto - (precioConImpuesto * descuento);
        return precioConDescuento;

}
}
 
