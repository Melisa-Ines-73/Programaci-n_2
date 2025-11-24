
package uni6;


public class Uni6 {

   
    
         public static void main(String[] args) {

        Inventario inv = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario

        Producto p1 = new Producto("A1", "Arroz", 1500, 50, Categoria.ALIMENTOS);
        Producto p2 = new Producto("E1", "Monitor", 5000, 20, Categoria.ELECTRONICA);
        Producto p3 = new Producto("R1", "Remeras", 2500, 35, Categoria.ROPA);
        Producto p4 = new Producto("H1", "Mesa", 8000, 10, Categoria.HOGAR);
        Producto p5 = new Producto("A2", "Pan", 1200, 80, Categoria.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // 2.Listar todos los productos mostrando su información y categoría.
        System.out.println(" LISTADO DE PRODUCTOS ");
        inv.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n BUSCAR PRODUCTO (ID: R1) ");
        Producto buscado = inv.buscarProductoPorId("R1");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica. 
        System.out.println("\nFILTRAR POR CATEGORÍA: ALIMENTOS ");
        inv.filtrarPorCategoria(Categoria.ALIMENTOS);

        // 5.Eliminar un producto por su ID y listar los productos restantes.

        System.out.println("\n ELIMINAR PRODUCTO (ID: E1) ");
        inv.eliminarProducto("E1");
        inv.listarProductos();

        // 6. Actualizar el stock de un producto existente. 
        System.out.println("\nACTUALIZAR STOCK (ID: A1) ");
        inv.actualizarStock("A1", 120);

        // 7. Mostrar el total de stock disponible
        System.out.println("\n TOTAL DE STOCK ");
        System.out.println("Total: " + inv.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println("\n PRODUCTO CON MAYOR STOCK");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println("\n PRODUCTOS ENTRE $1000 Y $3000 ");
        inv.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar las categorías disponibles con sus descripciones. 
        System.out.println("\n CATEGORÍAS DISPONIBLES ");
        inv.mostrarCategoriasDisponibles();
    }
}
    
    

