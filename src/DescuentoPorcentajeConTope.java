public class DescuentoPorcentajeConTope implements Descuento {
    private float porcentaje;
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    public float aplicarDescuento(float precio) throws DescuentoInvalidoException {
        float descuento = precio * (porcentaje / 100);

        if (descuento > tope) {
            descuento = tope;
        }

        float precioConDescuento = precio - descuento;

        if (precioConDescuento < 0) {
            throw new DescuentoInvalidoException("El descuento no puede dar un monto negativo");
        }

        return precioConDescuento;
    }
}