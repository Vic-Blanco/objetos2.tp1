package SistConcursos;

public class Participante {
    private int puntaje;
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    void cargarPuntos() {
        this.puntaje += 10;
    }

    int consultarPuntaje() {
        int puntos = puntaje;
        return (puntos);
    }
}
