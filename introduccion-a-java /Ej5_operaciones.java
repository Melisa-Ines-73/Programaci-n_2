
package holamundo;

import java.util.Scanner;


public class Ej5_operaciones {

    public static void main(String[] args) {
      System.out.println("Ingrese el primer número entero");
      Scanner input = new Scanner (System.in);
      int num1;
      int num2;
      num1 = input.nextInt();
      System.out.println("Ingrese el segundo número entero");
      num2 = input.nextInt ();
      
      int suma = num1 + num2;
      int resta = num1 - num2; 
      int multi = num1 * num2;
      int div = num1 / num2;
      
      System.out.println("Suma: " + suma + " resta: " + resta + " multiplicación: " + multi + " división: " + div);
              
      
    
    }
    
}
