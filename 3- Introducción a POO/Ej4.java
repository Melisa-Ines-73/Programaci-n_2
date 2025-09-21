
public class Ej4 {
    public static void main(String[] args) {
    Gallina g1 = new Gallina();
    Gallina g2 = new Gallina (); 
    
    g1.idGallina = 5;
    g2.idGallina = 6;   
    g1.envejecer(2);
    g2.envejecer(5);
    g1.ponerHuevo(8);
    g2.ponerHuevo(3);
    
    g1.mostrarEstado();
    g2.mostrarEstado();
    
    
}
}    
