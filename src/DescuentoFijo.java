
class DescuentoFijo implements Descuento {
    private float descuento;

    public DescuentoFijo(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public float aplicarDescuento(float precio) {
        return precio - descuento;
    }
}

