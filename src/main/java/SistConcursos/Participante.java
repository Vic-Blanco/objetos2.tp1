package SistConcursos;

public class Participante {
    private int id;
    private int puntaje;
    private String nombre;

    public Participante(int id, String nombre) {
        this.id = id;
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

    int getId() {
        return id;
    }
}
