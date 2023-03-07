import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /*
        Carrito carrito = new Carrito();

        Producto jabon = new Producto("Jabón en polvo", "Detergente en polvo para lavar ropa", 40, 1);
        Producto esponjas = new Producto("Esponjas", "Pack de esponjas para limpieza", 10, 2);
        Producto chocolates = new Producto("Chocolates", "Caja de chocolates variados", 100, 3);

        carrito.agregarProducto(jabon);
        carrito.agregarProducto(esponjas);
        carrito.agregarProducto(chocolates);

        float precioTotal = carrito.precio();
        System.out.println("El precio total del carrito es: " + precioTotal);
        */


        // Crear la persona
        Persona persona = new Persona("Juan", "Pérez", LocalDate.of(1990, 5, 12));

        // Crear el carrito
        Carrito carrito = new Carrito();

        // Agregar los productos al carrito
        carrito.agregarProducto(new Producto("Jabón en polvo", "Limpia la ropa", 40, "001"));
        carrito.agregarProducto(new Producto("Esponjas", "Para lavar platos", 10, "002"));
        carrito.agregarProducto(new Producto("Chocolates", "Dulce y delicioso", 100, "003"));

        // Mostrar el precio total del carrito
        System.out.println("El precio total del carrito es: " + carrito.precio());

        // Mostrar los datos de la persona
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }
}