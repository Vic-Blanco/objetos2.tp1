package SistConcursos;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class ConcursoTest {


    @Test
    public void InscribirParticipante() {
        Concurso concurso = new Concurso("Concurso de programación", LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 30));
        Participante participante = new Participante("Maria");
        concurso.inscribirse(participante);
        assertTrue(concurso.estaInscripto(participante));
    }

    @Test
    public void InscribirParticipantePrimerDia() {
        Concurso concurso = new Concurso("Concurso de programación", LocalDate.now(), LocalDate.of(2025, 10, 20));
        Participante participante = new Participante("Carlos");
        concurso.inscribirse(participante);
        assertTrue(concurso.estaInscripto(participante));
        assertEquals(10, participante.consultarPuntaje());
    }

    @Test
    public void InscribirParticipanteFueraDeRango() {
        Concurso concurso = new Concurso("Concurso de programación", LocalDate.of(2021, 10, 10), LocalDate.of(2021, 10, 20));
        Participante participante = new Participante("Ana");
        assertThrows(RuntimeException.class, () -> concurso.inscribirse(participante));
    }
}


