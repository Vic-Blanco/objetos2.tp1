package SistCostos;

public class GenericaT extends Tarjeta {
    @Override
    public Double aplicarDescuento(Double costoBebidas, Double costoPlatos) {
        return costoBebidas + costoPlatos;
    }
}
