package SistConcursos;

public class FakeenDiscoRegistrarInscripcion implements RegistrarInscripcion {
    @Override
    public void registrar(String registro) {
        // Simulación de registro en disco
        System.out.println("Registro en disco: " + registro);
    }
}
