
public class Ej3 {
    
    
    public static void main(String[] args) {
        
       Libro libro1 = new Libro();
       libro1.setAutor("Julio Verne");
       libro1.setTitulo("La vuelta al mundo en 80 días");
       libro1.setAñoPublicacion(-100);
       
       
       libro1.setAñoPublicacion(1873);
        
        System.err.println("Títutlo: " + libro1.getAutor());
        System.err.println("Autor: " + libro1.getAutor());
        System.err.println("Año de Publicación : " + libro1.getAñoPublicacion());
    }
}
