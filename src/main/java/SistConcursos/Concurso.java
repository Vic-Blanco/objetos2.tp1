package SistConcursos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Concurso {
    ArrayList<Inscripcion> inscripciones = new ArrayList<>();
    private int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private RegistrarInscripcion exportar;
    private EnviarMensaje mensaje;

    public Concurso(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, RegistrarInscripcion exportar, EnviarMensaje mensaje) {
        //Fecha inicio debe ser menor a la fecha fin
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.exportar = exportar;
        this.mensaje = mensaje;

    }

    public void inscribirse(Participante participante) {

        if (LocalDate.now().isBefore(fechaInicio) || LocalDate.now().isAfter(fechaFin)) {
            throw new RuntimeException("No se puede inscribir fuera de la fecha de inscripcion");

        } else {
            if (LocalDate.now().equals(fechaInicio)) {
                participante.cargarPuntos();
            }
            if (estaInscripto(participante)) {
                throw new RuntimeException("El participante ya esta inscripto");
            }
            Inscripcion inscripcion = new Inscripcion(participante, this);
            inscripciones.add(inscripcion);
            String registro = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + participante.getId() + ", " + this.getId() + "\n";
            this.exportar.registrar(registro);
            this.mensaje.enviar("Registro de Inscripcion", "Se ha registrado con exito en el concurso " + this.getNombre());
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

    private int getId() {
        return id;
    }

    private String getNombre() {
        return nombre;
    }
}


