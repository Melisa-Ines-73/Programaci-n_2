
package tp7.tp7_3;

 import java.util.ArrayList;
public class tp7_3 {

    
    public static void main(String[] args) {
                
   
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoP("Ana", 300000));
        empleados.add(new EmpleadoT("Luis", 80, 2000));
        empleados.add(new EmpleadoP("Carla", 350000));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoP) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoT) {
                System.out.println("Tipo: Temporal");
            }

            System.out.println("-------------------");
        }
    }
}

    
    

