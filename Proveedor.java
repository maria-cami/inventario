import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String idProveedor;
    private String nombreProveedor;
    private String contacto;
    private List<Producto> productos; // Lista de productos asociados al proveedor

    public Proveedor(String idProveedor, String nombreProveedor, String contacto) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.contacto = contacto;
        this.productos = new ArrayList<>();
    }

    public String obtenerInfoProveedor() {
        return String.format("ID: %s, Nombre: %s, Contacto: %s", idProveedor, nombreProveedor, contacto);
    }

    public void agregarProductoProveedor(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProductoProveedor(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public Producto buscarProductoProveedor(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public void listarProductosProveedor() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos asociados a este proveedor.");
        } else {
            System.out.println("Productos del proveedor " + nombreProveedor + ":");
            for (Producto producto : productos) {
                System.out.println(producto.obtenerDetalles());
            }
        }
    }
}
