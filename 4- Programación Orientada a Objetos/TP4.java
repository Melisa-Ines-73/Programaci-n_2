
package tp4;


public class TP4 {

   
    public static void main(String[] args) {
         Empleado emp1 = new Empleado(101, "Ana Gómez", "Secretaria", 50000);
        
        
        
        Empleado emp2 = new Empleado("María López", "Atención al Cliente");
       
        emp1.actualizarSalario(10);       
        emp2.actualizarSalario(5000);
      
        
      System.out.println(emp1);
      System.out.println(emp2);  
         System.out.println("Total de empleados " + Empleado.mostrarTotalEmpleados());
    }
    }


