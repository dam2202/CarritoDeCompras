public class Carrito {
    private Producto[] productos;
    private int cantidadProductos;

    public Carrito() {
        productos = new Producto[3];
        cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < 3) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("No se pueden agregar más productos al carrito");
        }
    }

    public float precio() {
        float total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
}

