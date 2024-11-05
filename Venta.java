public class Venta {
    private String numeroVenta;
    private Producto producto;
    private int cantidadVendida;
    private String fechaVenta;
    private boolean estaAnulada;

    public Venta(String numeroVenta, Producto producto, int cantidadVendida, String fechaVenta) {
        this.numeroVenta = numeroVenta;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
        this.estaAnulada = false; // Inicialmente la venta no está anulada
    }

    public void realizarVenta(Inventario inventario) {
        // Verificar si hay suficiente cantidad en el inventario
        Producto productoEnInventario = inventario.buscarProducto(producto.getCodigo());
        if (productoEnInventario != null && productoEnInventario.getCantidad() >= cantidadVendida) {
            // Si hay suficiente cantidad, reducirla del inventario
            inventario.actualizarInventario(producto.getCodigo(), productoEnInventario.getCantidad() - cantidadVendida);
            System.out.println("Venta realizada: " + numeroVenta);
        } else {
            System.out.println("No hay suficiente cantidad en inventario para realizar la venta.");
        }
    }

    public void anularVenta(Inventario inventario) {
        if (!estaAnulada) {
            // Si la venta no está anulada, se puede anular
            this.estaAnulada = true;
            // Devuelve la cantidad al inventario
            inventario.actualizarInventario(producto.getCodigo(), inventario.buscarProducto(producto.getCodigo()).getCantidad() + cantidadVendida);
            System.out.println("Venta anulada: " + numeroVenta);
        } else {
            System.out.println("La venta ya ha sido anulada.");
        }
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public boolean isEstaAnulada() {
        return estaAnulada;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }
}
