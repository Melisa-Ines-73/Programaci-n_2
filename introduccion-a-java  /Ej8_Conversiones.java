
package holamundo;

import java.util.Scanner;


public class Ej8_Conversiones {

  
    public static void main(String[] args) {
    System.out.println("Ingrese el primer número entero");
      Scanner input = new Scanner (System.in);
      int num1;
      int num2;
      num1 = input.nextInt();
      System.out.println("Ingrese el segundo número entero");
      num2 = input.nextInt ();
      
      int divEntera = num1 / num2;
      System.out.println("División Entera:" + divEntera);
      
      
      double divDecimal = (double)num1 /num2;
       System.out.println("División Decimal:" + divDecimal);
    }
    
}
