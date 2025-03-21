package SistConcursos;

import java.time.LocalDate;

public class Inscripcion {

    Participante participante;
    private Concurso concurso;
    private LocalDate fechaInscripcion;

    public Inscripcion(Participante participante, Concurso concurso) {

        this.participante = participante;
        this.concurso = concurso;
        this.fechaInscripcion = LocalDate.now();

    }

    public boolean estaInscripto(Participante participante) {
        return this.participante.equals(participante);
    }
}
