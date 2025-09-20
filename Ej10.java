
package tp2_programacionestructurada;

import java.util.Scanner;
public class Ej10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //stock
        System.out.print("Indique el stock ");
        int stockActual = input.nextInt();
        
           //cantidad
         System.out.print("Indique  la cantidad vendida");
        int cantidadVendida = input.nextInt();
        
        System.out.print("Indique la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
         int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("Stock actual =" + nuevoStock);
        
}
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    
    
    
}
