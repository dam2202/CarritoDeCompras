public class Producto {
    private String nombre;
    private String descripcion;
    private float precio;
    private String codigo;

    public Producto(String nombre, String descripcion, float precio, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
}