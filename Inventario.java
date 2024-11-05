import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        listaProductos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public void actualizarInventario(String codigo, int nuevaCantidad) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.actualizarCantidad(nuevaCantidad);
        }
    }
}
