
public class Gallina {
    // atributos
    public int idGallina;
    public int edad;
    public int huevosPuestos;
    
    
    //metodos
    void ponerHuevo(int huevos) {
        if (huevos > 0 ){
    huevosPuestos = huevosPuestos + huevos;
    }
    }
            
     void envejecer(int años) { 
      edad = edad + años;
     }
           
                    
    void mostrarEstado() { 
        System.out.println("ID_Gallina: " + idGallina + " Edad: " + edad + " Huevos Puestos: "+ huevosPuestos);
    }
    
    
}
