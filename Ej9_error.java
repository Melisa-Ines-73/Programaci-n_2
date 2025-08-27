
package holamundo;

import java.util.Scanner;


public class Ej9_error {



//public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
//System.out.print("Ingresa tu nombre: ");
//String nombre = scanner.nextInt(); // el error esta en que se usa para enteros  y la variable nombre es un string
//System.out.println("Hola, " + nombre);
//}
//}// se reemplaza scanner.nexInt() por next.Line() para leer un string
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Ingresa tu nombre: ");
     String nombre = scanner.nextLine();
     System.out.println("Hola, " + nombre);
 }
 }