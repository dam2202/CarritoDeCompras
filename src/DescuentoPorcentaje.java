public class DescuentoPorcentaje implements Descuento {
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float aplicarDescuento(float precio) throws DescuentoInvalidoException {
        if (precio == 0) {
            throw new DescuentoInvalidoException("No se puede aplicar un descuento a un carrito de precio 0");
        }
        float descuento = precio * porcentaje / 100;
        float precioConDescuento = precio - descuento;
        if (precioConDescuento < 0) {
            throw new DescuentoInvalidoException("El descuento no puede dar un monto negativo");
        }
        return precioConDescuento;
    }
}