import java.time.LocalDate;

class Cliente extends Persona {
    private String email;
    private String direccion;

    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento, String email, String direccion) {
        super(nombre, apellido, fechaNacimiento);
        this.email = email;
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }
}