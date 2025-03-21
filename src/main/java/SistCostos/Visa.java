package SistCostos;

public class Visa extends Tarjeta {
    private Double descuento = 0.97;

    @Override
    public Double aplicarDescuento(Double costoBebidas, Double costoPlatos) {
        return ((costoBebidas) * descuento) + costoPlatos;
    }
}
