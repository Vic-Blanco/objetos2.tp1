package SistConcursos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
    ArrayList<Inscripcion> inscripciones = new ArrayList<>();
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        //Fecha inicio debe ser menor a la fecha fin
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

    }

    public void inscribirse(Participante participante) {

        if (LocalDate.now().isBefore(fechaInicio) || LocalDate.now().isAfter(fechaFin)) {
            throw new RuntimeException("No se puede inscribir fuera de la fecha de inscripcion");

        } else {
            if (LocalDate.now().equals(fechaInicio)) {
                participante.cargarPuntos();
            }
            //se debe validad que el participante no este insciripto en el concurso
            Inscripcion inscripcion = new Inscripcion(participante, this);
            inscripciones.add(inscripcion);

        }

    }

    public boolean estaInscripto(Participante participante) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.estaInscripto(participante)) {
                return true;
            }
        }
        return false;
    }
}


