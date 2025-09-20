
package tp2_programacionestructurada;

import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);
    
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;
    
    System.out.println("Ingrese 10 números enteros");
    
    for (int i = 1; i <= 10; i= i+ 1) {
            System.out.print("Número " + i);
            int numero = input.nextInt();

            if (numero > 0) {
                positivos = positivos + 1;
            } else if (numero < 0) {
                negativos = negativos + 1;
            } else {
                ceros = ceros + 1;
            }
        }
    System.out.println("Positivos:" + positivos);
    System.out.println("Negativos:" + negativos);
    System.out.println("Ceros:" + ceros);
    
    
    }
    }
