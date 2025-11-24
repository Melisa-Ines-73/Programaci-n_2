
package uni6;


public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Categoria categoria;

    public Producto(String id, String nombre, double precio, int cantidad, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: $" + precio +
                " | Stock: " + cantidad +
                " | Categoría: " + categoria +
                " (" + categoria.getDescripcion() + ")");
    }
}