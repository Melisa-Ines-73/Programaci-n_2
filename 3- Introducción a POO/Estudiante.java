
public class Estudiante {
    
    public String nombre;
    public String apellido;
    public String  curso;
    public double nota; 

    
    
   void subirCalificacion(double puntos){
       if (puntos >= 0){
     nota = nota + puntos ;
    }else {
        System.out.println ("No es valido el valor ingresado");
        }
       }
    
    void bajarCalificacion(double puntos){
        if (puntos >= 0 && nota > puntos){
        nota = nota - puntos ; 
    } else {
        System.out.println ("No es valido el valor ingresado");
        }
        }
    void mostrarInfo(){
       System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Curso: " + curso + " Nota: " + nota);
    }

    

}