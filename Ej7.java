
package tp2_programacionestructurada;
import java.util.Scanner;

public class Ej7 {
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese la nota entre 0 y 10: ");
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida.");
        
        }

        } while (nota < 0 || nota > 10);

        System.out.println(" Nota válida " + nota);
      
        
        
}
    }
