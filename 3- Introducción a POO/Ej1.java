
public class Ej1 {

   
    public static void main(String[] args) {
       Estudiante a = new Estudiante();
       a.nombre ="Juan";
       a.apellido ="Garcia";
       a.curso ="29";
       a.nota = 9;
      
       a.bajarCalificacion(8);
       a.mostrarInfo();
       a.subirCalificacion(2);
       a.mostrarInfo();
    }
    
}
