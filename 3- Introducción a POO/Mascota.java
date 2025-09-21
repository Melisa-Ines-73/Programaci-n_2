
public class Mascota {
    
    String nombre;
    String especie;
    int edad; 
    
    
    
    
    void cumplirAnios(int anios) {
        if (anios >0){
            edad = edad + anios;
        }
        
    }
    void mostrarInfo(){
         System.out.println("Nombre: " + nombre + " Especie: " + especie + " Edad: "+ edad);
    }
    
}




