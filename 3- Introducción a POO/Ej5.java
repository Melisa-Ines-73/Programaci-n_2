
public class Ej5 {
    public static void main(String[] args) {
        
      NaveEspacial nave =new NaveEspacial();
      nave.nombre = "Taylor";
      nave.combustible = 50;
      nave.despegar();
      nave.avanzar(45);
      nave.recargarCombustible(25);
      nave.avanzar(14);
      nave.mostrarEstado();
        
        
        
}
  }
