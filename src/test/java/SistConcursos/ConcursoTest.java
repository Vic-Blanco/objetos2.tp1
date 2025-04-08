package SistConcursos;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class ConcursoTest {


    @Test
    public void InscribirParticipante() {
        Concurso concurso = new Concurso(1, "Concurso de programación", LocalDate.of(2025, 3, 1), LocalDate.now(), new FakeenDiscoRegistrarInscripcion(), new FakeporMailEnviarMensaje());
        Participante participante = new Participante(1, "Maria");
        concurso.inscribirse(participante);
        assertTrue(concurso.estaInscripto(participante));
    }

    @Test
    public void InscribirParticipantePrimerDia() {
        LocalDate hoy = LocalDate.now();
        Concurso concurso = new Concurso(1, "Concurso de programación", hoy, hoy.plusDays(5), new FakeenDiscoRegistrarInscripcion(), new FakeporMailEnviarMensaje());
        Participante participante = new Participante(2, "Carlos");
        concurso.inscribirse(participante);
        assertTrue(concurso.estaInscripto(participante));
        assertEquals(10, participante.consultarPuntaje());
    }

    @Test
    public void InscribirParticipanteFueraDeRango() {
        Concurso concurso = new Concurso(1, "Concurso de programación", LocalDate.of(2021, 10, 10), LocalDate.of(2021, 10, 20), new FakeenDiscoRegistrarInscripcion(), new FakeporMailEnviarMensaje());
        Participante participante = new Participante(3, "Ana");
        assertThrows(RuntimeException.class, () -> concurso.inscribirse(participante));
    }

}


