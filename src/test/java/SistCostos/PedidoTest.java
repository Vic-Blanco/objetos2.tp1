package SistCostos;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {
    @Test
    public void testCalcularTotalVisa() {
        Bebida bebida = new Bebida("Coca", 10);
        Plato plato = new Plato("Lomo", 20);
        Mesa mesa = new Mesa(1, 4);
        HashMap<Plato, Integer> platos = new HashMap<>();
        platos.put(plato, 2);
        HashMap<Bebida, Integer> bebidas = new HashMap<>();
        bebidas.put(bebida, 3);
        Pedido pedido = new Pedido(mesa, platos, bebidas);
        Tarjeta tarjeta = new Visa();
        double total = pedido.calcularTotal(tarjeta, 5);
        assertEquals(72.55, total, 0.01);
    }

    @Test
    public void testCalcularTotalMastercard() {
        Bebida bebida = new Bebida("Coca", 10);
        Plato plato = new Plato("Lomo", 20);
        Mesa mesa = new Mesa(1, 4);
        HashMap<Plato, Integer> platos = new HashMap<>();
        platos.put(plato, 2);
        HashMap<Bebida, Integer> bebidas = new HashMap<>();
        bebidas.put(bebida, 3);
        Pedido pedido = new Pedido(mesa, platos, bebidas);
        Tarjeta tarjeta = new Mastercard();
        double total = pedido.calcularTotal(tarjeta, 5);
        assertEquals(72.66, total, 0.01);
    }

    @Test
    public void testCalcularTotalComarcaPlus() {
        Bebida bebida = new Bebida("Coca", 10);
        Plato plato = new Plato("Lomo", 20);
        Mesa mesa = new Mesa(1, 4);
        HashMap<Plato, Integer> platos = new HashMap<>();
        platos.put(plato, 2);
        HashMap<Bebida, Integer> bebidas = new HashMap<>();
        bebidas.put(bebida, 3);
        Pedido pedido = new Pedido(mesa, platos, bebidas);
        Tarjeta tarjeta = new ComarcaPlus();
        double total = pedido.calcularTotal(tarjeta, 3);
        assertEquals(70.65, total, 0.01);
    }

    @Test
    public void testCalcularTotalGenericaT() {
        Bebida bebida = new Bebida("Coca", 10);
        Plato plato = new Plato("Lomo", 20);
        Mesa mesa = new Mesa(1, 4);
        HashMap<Plato, Integer> platos = new HashMap<>();
        platos.put(plato, 2);
        HashMap<Bebida, Integer> bebidas = new HashMap<>();
        bebidas.put(bebida, 3);
        Pedido pedido = new Pedido(mesa, platos, bebidas);
        Tarjeta tarjeta = new GenericaT();
        double total = pedido.calcularTotal(tarjeta, 2);
        assertEquals(71.4, total, 0.01);
    }
}
