public class GestionInventario {
    public static void main(String[] args) {
        // Crear inventario y productos
        Inventario inventario = new Inventario();
        Producto producto1 = new Producto("001", "Laptop", "Laptop gaming", 1200.00, 10);
        Producto producto2 = new Producto("002", "Mouse", "Mouse gamer", 50.00, 25);
        
        // Agregar productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        
        // Realizar una venta
        Venta venta1 = new Venta("VEN001", producto1, 3, "2024-11-01");
        venta1.realizarVenta(inventario); // Intentar realizar la venta
        
        // Mostrar el estado del inventario después de la venta
        System.out.println("Estado del inventario después de la venta:");
        System.out.println(producto1.obtenerDetalles());
        System.out.println(producto2.obtenerDetalles());

        // Anular la venta
        venta1.anularVenta(inventario); // Anular la venta
        
        // Mostrar el estado del inventario después de anular la venta
        System.out.println("Estado del inventario después de anular la venta:");
        System.out.println(producto1.obtenerDetalles());
        System.out.println(producto2.obtenerDetalles());
    }
}
