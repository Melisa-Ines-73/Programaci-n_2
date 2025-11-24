/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Melisa");
        Pedido pedido = new Pedido(c);

        pedido.agregarProducto(new Producto("Notebook", 800000));
        pedido.agregarProducto(new Producto("Mouse", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDesc = tc.aplicarDescuento(total);

        tc.procesarPago(totalConDesc);

        pedido.cambiarEstado("Pagado");
        pedido.cambiarEstado("Enviado");
    }
}
