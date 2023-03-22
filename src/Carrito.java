import java.time.LocalDate;
import java.util.ArrayList;

public class Carrito {
    protected ArrayList<Producto> productos;
    private Descuento descuento;

    public Carrito(Descuento descuento) {
        this.productos = new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public float precio() {
        float precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        try {
            precioTotal = descuento.aplicarDescuento(precioTotal);
        } catch (DescuentoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return precioTotal;
    }
}