
public class NaveEspacial {
    
    // atributos: nombre, combustible
    
    String nombre;
    double combustible; 
    
    
    
    // Métodos requeridos: despegar(), avanzar(distancia),
    //recargarCombustible(cantidad), mostrarEstado().
    
    
    
    void avanzar(int distancia) { 
        if (distancia <= combustible) {
            combustible = combustible -  distancia;
            
    }
    }
    void despegar() { 
        if (combustible >5){
        combustible = combustible - 5;

} else {
            System.out.println("Combustible insuficiente para despegar: ");
        }
}

       
    void recargarCombustible(int cantidad){ 
    if (cantidad > 0){
    combustible = combustible + cantidad;
        }
    }
    
    
    void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible); 
    }
        
    

    
}