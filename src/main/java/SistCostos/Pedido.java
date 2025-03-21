package SistCostos;

import java.util.HashMap;

public class Pedido {

    private Mesa mesa;
    private HashMap<Plato, Integer> platos;
    private HashMap<Bebida, Integer> bebidas;

    public Pedido(Mesa mesa, HashMap<Plato, Integer> platos, HashMap<Bebida, Integer> bebidas) {
        this.mesa = mesa;
        this.platos = platos;
        this.bebidas = bebidas;
    }


    public double calcularTotal(Tarjeta tarjeta, double propina) {
        double costoPlatos = platos.entrySet().stream().mapToDouble(e -> e.getKey().getCosto() * e.getValue()).sum();
        double costoBebidas = bebidas.entrySet().stream().mapToDouble(e -> e.getKey().getCosto() * e.getValue()).sum();
        double total = tarjeta.aplicarDescuento(costoBebidas, costoPlatos);
        total += total * (propina / 100);
        return total;
    }

}
