public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, String descripcion, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad; // Método getter para obtener la cantidad
    }

    public void actualizarCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public String obtenerDetalles() {
        return String.format("Código: %s, Nombre: %s, Descripción: %s, Precio: %.2f, Cantidad: %d",
                codigo, nombre, descripcion, precio, cantidad);
    }
}
