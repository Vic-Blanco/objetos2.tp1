package SistCostos;

public class FakeenDiscoRegistrarPedido implements RegistrarPedido {
    @Override
    public void registrar(String registro) {
        // Simulación de registro en disco
        System.out.println("Registro en disco: " + registro);
    }
}
