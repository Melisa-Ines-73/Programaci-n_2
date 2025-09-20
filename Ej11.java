
package tp2_programacionestructurada;
            
 import java.util.Scanner;   
public class Ej11 {
    
    static double descuentoEspecial = 0.10;
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Idicar el precio del producto");
        double precio = input.nextDouble();
    
    calcularDescuentoEspecial(precio);
         
    }
    
    public static void calcularDescuentoEspecial(double precio) {
    

        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
    
    
    System.out.println("Descuento" + descuentoAplicado);
    System.out.println("Precio final" + precioFinal);
    
    
}
    


}
