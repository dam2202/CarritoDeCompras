import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      /*  Persona persona = new Persona("Juan", "Pérez", LocalDate.of(1990, 5, 12));

        Descuento descuento = new DescuentoPorcentajeConTope(20, 50); // 20% de descuento con tope de $50
        Carrito carrito = new Carrito(descuento);

        carrito.agregarProducto(new Producto("Jabón en polvo", "Limpia la ropa", 40, "001"));
        carrito.agregarProducto(new Producto("Esponjas", "Para lavar platos", 10, "002"));
        carrito.agregarProducto(new Producto("Chocolates", "Dulce y delicioso", 100, "003"));

        System.out.println("El precio total del carrito con descuento es: " + carrito.precio());

       */

        // Creamos un descuento del 10%
        Descuento descuento = new DescuentoPorcentaje(10);

        // Creamos un carrito con el descuento
        Carrito carrito = new Carrito(descuento);

        // Agregamos algunos productos al carrito
        carrito.agregarProducto(new Producto("Camiseta", "Una camiseta de algodón", 20));
        carrito.agregarProducto(new Producto("Pantalón", "Un pantalón de mezclilla", 30));
        carrito.agregarProducto(new Producto("Calcetines", "Un par de calcetines", 5));

        // Creamos un cliente
        Cliente cliente = new Cliente("Juan", "Pérez", LocalDate.of(1990, 5, 15), "juan.perez@example.com", "Calle Falsa 123");

        // Creamos una venta con el carrito y el cliente
        Venta venta = new Venta(cliente, carrito);

        // Mostramos los detalles de la venta
        System.out.println("Detalles de la venta:");
        System.out.println("Fecha: " + venta.getFecha());
        System.out.println("Cliente: " + venta.getCliente().getNombre() + " " + venta.getCliente().getApellido());
        System.out.println("Email: " + venta.getCliente().getEmail());
        System.out.println("Dirección: " + venta.getCliente().getDireccion());
        System.out.println("Productos:");
        for (Producto producto : carrito.productos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Precio total: $" + venta.getPrecioTotal());
    }
}


