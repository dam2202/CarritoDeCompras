import java.time.LocalDate;

class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()) {
            edad--;
        } else if (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()
                && fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth()) {
            edad--;
        }
        return edad;
    }
}