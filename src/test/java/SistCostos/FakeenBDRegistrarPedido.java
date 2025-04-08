package SistCostos;

public class FakeenBDRegistrarPedido implements RegistrarPedido {
    @Override
    public void registrar(String registro) {
        // Simulación de registro en una base de datos falsa
        System.out.println("Registro simulado BD: " + registro);
    }
}
