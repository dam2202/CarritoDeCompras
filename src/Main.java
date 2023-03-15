import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Pérez", LocalDate.of(1990, 5, 12));

        Descuento descuento = new DescuentoPorcentajeConTope(20, 50); // 20% de descuento con tope de $50
        Carrito carrito = new Carrito(descuento);

        carrito.agregarProducto(new Producto("Jabón en polvo", "Limpia la ropa", 40, "001"));
        carrito.agregarProducto(new Producto("Esponjas", "Para lavar platos", 10, "002"));
        carrito.agregarProducto(new Producto("Chocolates", "Dulce y delicioso", 100, "003"));

        System.out.println("El precio total del carrito con descuento es: " + carrito.precio());
    }
}