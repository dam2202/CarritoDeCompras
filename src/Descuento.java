public interface Descuento {
    float aplicarDescuento(float precio) throws DescuentoInvalidoException;
}