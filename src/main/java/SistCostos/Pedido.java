package SistCostos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Pedido {

    private Mesa mesa;
    private HashMap<Plato, Integer> platos;
    private HashMap<Bebida, Integer> bebidas;
    private RegistrarPedido registrarPedido;

    public Pedido(Mesa mesa, HashMap<Plato, Integer> platos, HashMap<Bebida, Integer> bebidas, RegistrarPedido registrarPedido) {
        this.mesa = mesa;
        this.platos = platos;
        this.bebidas = bebidas;
        this.registrarPedido = registrarPedido;
    }


    public double calcularTotal(Tarjeta tarjeta, double propina) {
        double costoPlatos = platos.entrySet().stream().mapToDouble(e -> e.getKey().getCosto() * e.getValue()).sum();
        double costoBebidas = bebidas.entrySet().stream().mapToDouble(e -> e.getKey().getCosto() * e.getValue()).sum();
        double total = tarjeta.aplicarDescuento(costoBebidas, costoPlatos);
        total += total * (propina / 100);
        String registro = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "||" + String.format("%.2f", total) + "\n";
        this.registrarPedido.registrar(registro);
        return total;

    }

}
