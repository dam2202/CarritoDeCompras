public class DescuentoPorcentajeConTope implements Descuento {
    private float porcentaje;
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    @Override
    public float aplicarDescuento(float precio) {
        float descuento = precio * (porcentaje / 100);

        if (descuento > tope) {
            return precio - tope;
        } else {
            return precio - descuento;
        }
    }
}