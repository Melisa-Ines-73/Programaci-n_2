
public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int año) {
        if (año > 0 ) {
         this.añoPublicacion = año;
        }
        
        
     
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
     
    }
    
    
    
    



