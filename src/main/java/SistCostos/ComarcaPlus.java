package SistCostos;

public class ComarcaPlus extends Tarjeta {
    private Double descuento = 0.98;

    @Override
    public Double aplicarDescuento(Double costoBebidas, Double costoPlatos) {
        return ((costoPlatos + costoBebidas) * descuento);
    }
}
