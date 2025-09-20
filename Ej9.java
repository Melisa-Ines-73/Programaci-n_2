
package tp2_programacionestructurada;


import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso del paquete");
        double peso = input.nextDouble();
    
        System.out.println("Ingrese el precio");
        double precioProducto = input.nextDouble();
        
        input.nextLine(); // limpiar salto de línea pendiente
            
            
        System.out.println("Indique si la zona de envío es nacional o internacional");
         String zona = input.nextLine().trim();
    
        
        
        //costo 
        double costoEnvio = calcularCostoEnvio(peso, zona);
    
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: $" + total);
        System.out.println("El total de envío a pagar es: $" + costoEnvio);
    }
    
  public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida.");
            return 0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}