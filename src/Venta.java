import java.time.LocalDate;

class Venta {
    private Cliente cliente;
    private Carrito carrito;
    private LocalDate fecha;
    private float precioTotal;

    public Venta(Cliente cliente, Carrito carrito) {
        this.cliente = cliente;
        this.carrito = carrito;
        fecha = LocalDate.now();
        precioTotal = carrito.precio();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }
}