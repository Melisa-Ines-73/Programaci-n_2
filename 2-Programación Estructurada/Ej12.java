
package tp2_programacionestructurada;

public class Ej12 {
    public static void main(String[] args) {

    double[] precios = {150, 740, 456, 150, 600 };
    
    System.out.println("Precios originales");
     mostrarArray(precios);
    
    precios[2] = 500;
    
    
    System.out.println("\nPrecios actualizados");
    mostrarArray(precios);
  }
  public static void mostrarArray(double[] array) {
        for (int i = 0; i < array.length; i= i+1) {
            System.out.println("Producto" + (i + 1) + array[i]);
        }

}
}
